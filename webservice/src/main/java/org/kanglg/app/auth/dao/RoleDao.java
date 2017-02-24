package org.kanglg.app.auth.dao;

import org.kanglg.app.auth.entity.BSysRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

/**
 * 角色DAO
 * Created by kanglg on 2017/2/23.
 */
public interface RoleDao extends CrudRepository<BSysRole, String> {
    /**
     * 通过账号获取用户角色
     * @param account 用户账号
     * @return 角色集合
     */
    @Query("select distinct t2.roleName from BSysUser t1, BSysRole t2, BSysUserRoleRel t3 where t1.userId = t3.userId and t2.roleId = t3.roleId and t1.userAccount = ?1")
    Set<String> findByAccount(String account);
}
