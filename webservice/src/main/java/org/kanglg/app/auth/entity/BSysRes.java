package org.kanglg.app.auth.entity;

import javax.persistence.*;

/**
 * Created by kanglg on 2017/2/24.
 */
@Entity
@Table(name = "b_sys_res", schema = "webapp", catalog = "")
public class BSysRes {
    private String resId;
    private String resName;
    private String resType;
    private Integer orderNum;
    private String pid;
    private String pids;
    private Byte available;

    @Id
    @Column(name = "RES_ID")
    public String getResId() {
        return resId;
    }

    public void setResId(String resId) {
        this.resId = resId;
    }

    @Basic
    @Column(name = "RES_NAME")
    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    @Basic
    @Column(name = "RES_TYPE")
    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }

    @Basic
    @Column(name = "ORDER_NUM")
    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Basic
    @Column(name = "PID")
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "PIDS")
    public String getPids() {
        return pids;
    }

    public void setPids(String pids) {
        this.pids = pids;
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

        BSysRes bSysRes = (BSysRes) o;

        if (resId != null ? !resId.equals(bSysRes.resId) : bSysRes.resId != null) return false;
        if (resName != null ? !resName.equals(bSysRes.resName) : bSysRes.resName != null) return false;
        if (resType != null ? !resType.equals(bSysRes.resType) : bSysRes.resType != null) return false;
        if (orderNum != null ? !orderNum.equals(bSysRes.orderNum) : bSysRes.orderNum != null) return false;
        if (pid != null ? !pid.equals(bSysRes.pid) : bSysRes.pid != null) return false;
        if (pids != null ? !pids.equals(bSysRes.pids) : bSysRes.pids != null) return false;
        if (available != null ? !available.equals(bSysRes.available) : bSysRes.available != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = resId != null ? resId.hashCode() : 0;
        result = 31 * result + (resName != null ? resName.hashCode() : 0);
        result = 31 * result + (resType != null ? resType.hashCode() : 0);
        result = 31 * result + (orderNum != null ? orderNum.hashCode() : 0);
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (pids != null ? pids.hashCode() : 0);
        result = 31 * result + (available != null ? available.hashCode() : 0);
        return result;
    }
}
