package com.dataquality.shanghai.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author TomCatHe
 * @since 2024-01-18
 */
@TableName("TB_JG_APPOINTMENT")
public class TbJgAppointment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String orderid;

    private String wsjgdm;

    private String orderstatus;

    private String fjWsjgdm;

    private String yljgdm;

    private String numsourceid;

    private String platformtype;

    private LocalDateTime applydate;

    private String medicardid;

    private String medicardtype;

    private String username;

    private Short xgbz;

    private String ylyl1;

    private String ylyl2;

    private Short warFlag;

    private String warNote;

    private LocalDateTime jlgxsj;

    private Integer llbz;

    private Short chkFlag;

    private Short sedBz;

    private String jlscrq;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getWsjgdm() {
        return wsjgdm;
    }

    public void setWsjgdm(String wsjgdm) {
        this.wsjgdm = wsjgdm;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getFjWsjgdm() {
        return fjWsjgdm;
    }

    public void setFjWsjgdm(String fjWsjgdm) {
        this.fjWsjgdm = fjWsjgdm;
    }

    public String getYljgdm() {
        return yljgdm;
    }

    public void setYljgdm(String yljgdm) {
        this.yljgdm = yljgdm;
    }

    public String getNumsourceid() {
        return numsourceid;
    }

    public void setNumsourceid(String numsourceid) {
        this.numsourceid = numsourceid;
    }

    public String getPlatformtype() {
        return platformtype;
    }

    public void setPlatformtype(String platformtype) {
        this.platformtype = platformtype;
    }

    public LocalDateTime getApplydate() {
        return applydate;
    }

    public void setApplydate(LocalDateTime applydate) {
        this.applydate = applydate;
    }

    public String getMedicardid() {
        return medicardid;
    }

    public void setMedicardid(String medicardid) {
        this.medicardid = medicardid;
    }

    public String getMedicardtype() {
        return medicardtype;
    }

    public void setMedicardtype(String medicardtype) {
        this.medicardtype = medicardtype;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Short getXgbz() {
        return xgbz;
    }

    public void setXgbz(Short xgbz) {
        this.xgbz = xgbz;
    }

    public String getYlyl1() {
        return ylyl1;
    }

    public void setYlyl1(String ylyl1) {
        this.ylyl1 = ylyl1;
    }

    public String getYlyl2() {
        return ylyl2;
    }

    public void setYlyl2(String ylyl2) {
        this.ylyl2 = ylyl2;
    }

    public Short getWarFlag() {
        return warFlag;
    }

    public void setWarFlag(Short warFlag) {
        this.warFlag = warFlag;
    }

    public String getWarNote() {
        return warNote;
    }

    public void setWarNote(String warNote) {
        this.warNote = warNote;
    }

    public LocalDateTime getJlgxsj() {
        return jlgxsj;
    }

    public void setJlgxsj(LocalDateTime jlgxsj) {
        this.jlgxsj = jlgxsj;
    }

    public Integer getLlbz() {
        return llbz;
    }

    public void setLlbz(Integer llbz) {
        this.llbz = llbz;
    }

    public Short getChkFlag() {
        return chkFlag;
    }

    public void setChkFlag(Short chkFlag) {
        this.chkFlag = chkFlag;
    }

    public Short getSedBz() {
        return sedBz;
    }

    public void setSedBz(Short sedBz) {
        this.sedBz = sedBz;
    }

    public String getJlscrq() {
        return jlscrq;
    }

    public void setJlscrq(String jlscrq) {
        this.jlscrq = jlscrq;
    }

    @Override
    public String toString() {
        return "TbJgAppointment{" +
        "orderid = " + orderid +
        ", wsjgdm = " + wsjgdm +
        ", orderstatus = " + orderstatus +
        ", fjWsjgdm = " + fjWsjgdm +
        ", yljgdm = " + yljgdm +
        ", numsourceid = " + numsourceid +
        ", platformtype = " + platformtype +
        ", applydate = " + applydate +
        ", medicardid = " + medicardid +
        ", medicardtype = " + medicardtype +
        ", username = " + username +
        ", xgbz = " + xgbz +
        ", ylyl1 = " + ylyl1 +
        ", ylyl2 = " + ylyl2 +
        ", warFlag = " + warFlag +
        ", warNote = " + warNote +
        ", jlgxsj = " + jlgxsj +
        ", llbz = " + llbz +
        ", chkFlag = " + chkFlag +
        ", sedBz = " + sedBz +
        ", jlscrq = " + jlscrq +
        "}";
    }
}
