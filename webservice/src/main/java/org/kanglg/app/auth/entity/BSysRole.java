package org.kanglg.app.auth.entity;

import javax.persistence.*;

/**
 * Created by kanglg on 2017/2/24.
 */
@Entity
@Table(name = "b_sys_role")
public class BSysRole {
    private String roleId;
    private String roleName;
    private String remark;
    private Byte available;

    @Id
    @Column(name = "ROLE_ID")
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "ROLE_NAME")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "REMARK")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "AVAILABLE")
    public Byte getAvailable() {
        return available;
    }

    public void setAvailable(Byte available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BSysRole bSysRole = (BSysRole) o;

        if (roleId != null ? !roleId.equals(bSysRole.roleId) : bSysRole.roleId != null) return false;
        if (roleName != null ? !roleName.equals(bSysRole.roleName) : bSysRole.roleName != null) return false;
        if (remark != null ? !remark.equals(bSysRole.remark) : bSysRole.remark != null) return false;
        if (available != null ? !available.equals(bSysRole.available) : bSysRole.available != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId != null ? roleId.hashCode() : 0;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (available != null ? available.hashCode() : 0);
        return result;
    }
}
