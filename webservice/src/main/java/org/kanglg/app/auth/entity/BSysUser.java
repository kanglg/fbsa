package org.kanglg.app.auth.entity;

import javax.persistence.*;

/**
 * Created by kanglg on 2017/2/24.
 */
@Entity
@Table(name = "b_sys_user")
public class BSysUser {
    private String userId;
    private String userName;
    private String userAccount;
    private String userPassword;

    @Id
    @Column(name = "USER_ID")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "USER_ACCOUNT")
    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    @Basic
    @Column(name = "USER_PASSWORD")
    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BSysUser bSysUser = (BSysUser) o;

        if (userId != null ? !userId.equals(bSysUser.userId) : bSysUser.userId != null) return false;
        if (userName != null ? !userName.equals(bSysUser.userName) : bSysUser.userName != null) return false;
        if (userAccount != null ? !userAccount.equals(bSysUser.userAccount) : bSysUser.userAccount != null)
            return false;
        if (userPassword != null ? !userPassword.equals(bSysUser.userPassword) : bSysUser.userPassword != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userAccount != null ? userAccount.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        return result;
    }
}
