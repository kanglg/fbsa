package org.kanglg.app.auth.dao;

import org.kanglg.app.auth.entity.BSysRes;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

/**
 * 资源DAO
 * Created by kanglg on 2017/2/23.
 */
public interface ResDao extends CrudRepository<BSysRes, String> {
    /**
     * 通过账号获取权限
     * @param account 账号
     * @return 权限集合
     */
    @Query("select t.permision from BSysRoleResRel t, BSysRole t1, BSysUserRoleRel t2, BSysUser t3 where t.roleId = t1.roleId and t1.roleId = t2.roleId and t2.userId = t3.userId and t3.userAccount = ?1")
    Set<String> findPermissionByAccount(String account);
}
