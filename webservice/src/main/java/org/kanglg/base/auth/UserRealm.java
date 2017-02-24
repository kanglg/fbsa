package org.kanglg.base.auth;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.kanglg.app.auth.entity.BSysUser;
import org.kanglg.app.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 自定义Realm实现
 * Created by kanglg on 2017/2/20.
 */
public class UserRealm extends AuthorizingRealm {
    private final UserService userService;

    @Autowired
    public UserRealm(UserService userService) {
        this.userService = userService;
    }

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String account = (String) principalCollection.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(userService.findRoles(account));
        authorizationInfo.setStringPermissions(userService.findPermissions(account));
        return authorizationInfo;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String account = (String) authenticationToken.getPrincipal();
        BSysUser user = userService.findUserByAccount(account);
        if (user == null) {
            throw new UnknownAccountException();
        }
        ByteSource credentialsSalt = ByteSource.Util.bytes(account);
        return new SimpleAuthenticationInfo(user.getUserAccount(), user.getUserPassword(), credentialsSalt, getName());
    }
}
