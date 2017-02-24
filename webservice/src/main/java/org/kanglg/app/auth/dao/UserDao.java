package org.kanglg.app.auth.dao;

import org.kanglg.app.auth.entity.BSysUser;
import org.springframework.data.repository.CrudRepository;

/**
 * 用户DAO
 * Created by kanglg on 2017/2/20.
 */
public interface UserDao extends CrudRepository<BSysUser, String> {
    //    @Query("select t from BSysUser t where t.userAccount=?1")
    BSysUser findByUserAccount(String userAccount);
}
