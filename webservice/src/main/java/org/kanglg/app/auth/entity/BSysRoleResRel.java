package org.kanglg.app.auth.entity;

import javax.persistence.*;

/**
 * Created by kanglg on 2017/2/24.
 */
@Entity
@Table(name = "b_sys_role_res_rel")
@IdClass(BSysRoleResRelPK.class)
public class BSysRoleResRel {
    private String permision;
    private String roleId;
    private String resId;

    @Basic
    @Column(name = "PERMISION")
    public String getPermision() {
        return permision;
    }

    public void setPermision(String permision) {
        this.permision = permision;
    }

    @Id
    @Column(name = "ROLE_ID")
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Id
    @Column(name = "RES_ID")
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

        BSysRoleResRel that = (BSysRoleResRel) o;

        if (permision != null ? !permision.equals(that.permision) : that.permision != null) return false;
        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;
        if (resId != null ? !resId.equals(that.resId) : that.resId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = permision != null ? permision.hashCode() : 0;
        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
        result = 31 * result + (resId != null ? resId.hashCode() : 0);
        return result;
    }
}
