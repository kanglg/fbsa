package org.kanglg.app.auth.web;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.kanglg.app.auth.entity.BSysUser;
import org.kanglg.app.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * 用户资源
 * Created by kanglg on 2017/2/20.
 */
@RestController
@RequestMapping("/user")
@RequiresPermissions("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public BSysUser index() {
        BSysUser user = userService.findUserByAccount("kanglg");
        Set<String> set = userService.findRoles("kanglg");
        Set<String> set2 = userService.findPermissions("kanglg");
        return userService.findUser("0");
    }
}
