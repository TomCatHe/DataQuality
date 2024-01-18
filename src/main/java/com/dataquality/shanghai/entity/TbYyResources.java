package com.dataquality.shanghai.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author TomCatHe
 * @since 2024-01-18
 */
@TableName("TB_YY_RESOURCES")
public class TbYyResources implements Serializable {

    private static final long serialVersionUID = 1L;

    private String numsourceid;

    private String wsjgdm;

    private String fjWsjgdm;

    private String yljgdm;

    private String ordernumtype;

    private String onedeptcode;

    private String deptcode;

    private String ordertype;

    private String doctorid;

    private String doctorname;

    private BigDecimal visitcost;

    private String scheduledate;

    private String timerange;

    private String starttime;

    private String endtime;

    private Short totalordernum;

    private Short remainnum;

    private Short reserveordernum;

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

    public String getNumsourceid() {
        return numsourceid;
    }

    public void setNumsourceid(String numsourceid) {
        this.numsourceid = numsourceid;
    }

    public String getWsjgdm() {
        return wsjgdm;
    }

    public void setWsjgdm(String wsjgdm) {
        this.wsjgdm = wsjgdm;
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

    public String getOrdernumtype() {
        return ordernumtype;
    }

    public void setOrdernumtype(String ordernumtype) {
        this.ordernumtype = ordernumtype;
    }

    public String getOnedeptcode() {
        return onedeptcode;
    }

    public void setOnedeptcode(String onedeptcode) {
        this.onedeptcode = onedeptcode;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    public String getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(String doctorid) {
        this.doctorid = doctorid;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public BigDecimal getVisitcost() {
        return visitcost;
    }

    public void setVisitcost(BigDecimal visitcost) {
        this.visitcost = visitcost;
    }

    public String getScheduledate() {
        return scheduledate;
    }

    public void setScheduledate(String scheduledate) {
        this.scheduledate = scheduledate;
    }

    public String getTimerange() {
        return timerange;
    }

    public void setTimerange(String timerange) {
        this.timerange = timerange;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public Short getTotalordernum() {
        return totalordernum;
    }

    public void setTotalordernum(Short totalordernum) {
        this.totalordernum = totalordernum;
    }

    public Short getRemainnum() {
        return remainnum;
    }

    public void setRemainnum(Short remainnum) {
        this.remainnum = remainnum;
    }

    public Short getReserveordernum() {
        return reserveordernum;
    }

    public void setReserveordernum(Short reserveordernum) {
        this.reserveordernum = reserveordernum;
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
        return "TbYyResources{" +
        "numsourceid = " + numsourceid +
        ", wsjgdm = " + wsjgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", yljgdm = " + yljgdm +
        ", ordernumtype = " + ordernumtype +
        ", onedeptcode = " + onedeptcode +
        ", deptcode = " + deptcode +
        ", ordertype = " + ordertype +
        ", doctorid = " + doctorid +
        ", doctorname = " + doctorname +
        ", visitcost = " + visitcost +
        ", scheduledate = " + scheduledate +
        ", timerange = " + timerange +
        ", starttime = " + starttime +
        ", endtime = " + endtime +
        ", totalordernum = " + totalordernum +
        ", remainnum = " + remainnum +
        ", reserveordernum = " + reserveordernum +
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
