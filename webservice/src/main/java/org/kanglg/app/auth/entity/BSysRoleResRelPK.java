package org.kanglg.app.auth.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by kanglg on 2017/2/23.
 */
public class BSysRoleResRelPK implements Serializable {
    private String roleId;
    private String resId;

    @Column(name = "ROLE_ID")
    @Id
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Column(name = "RES_ID")
    @Id
    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BSysRoleResRelPK that = (BSysRoleResRelPK) o;

        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;
        if (resId != null ? !resId.equals(that.resId) : that.resId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId != null ? roleId.hashCode() : 0;
        result = 31 * result + (resId != null ? resId.hashCode() : 0);
        return result;
    }
}
