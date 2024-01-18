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
@TableName("MED_BED_INFO")
public class MedBedInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String bedId;

    private String yljgdm;

    private String wsjgdm;

    private String fjWsjgdm;

    private String kh;

    private String zjhm;

    private String zjlx;

    private String klx;

    private Short serial;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String endReason;

    private String zzysgh;

    private String zzysxm;

    private String zdbm;

    private String bmlx;

    private String diagnosisDesc;

    private String subjectNo;

    private String refSpecial;

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

    public String getBedId() {
        return bedId;
    }

    public void setBedId(String bedId) {
        this.bedId = bedId;
    }

    public String getYljgdm() {
        return yljgdm;
    }

    public void setYljgdm(String yljgdm) {
        this.yljgdm = yljgdm;
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

    public String getKh() {
        return kh;
    }

    public void setKh(String kh) {
        this.kh = kh;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public String getZjlx() {
        return zjlx;
    }

    public void setZjlx(String zjlx) {
        this.zjlx = zjlx;
    }

    public String getKlx() {
        return klx;
    }

    public void setKlx(String klx) {
        this.klx = klx;
    }

    public Short getSerial() {
        return serial;
    }

    public void setSerial(Short serial) {
        this.serial = serial;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getEndReason() {
        return endReason;
    }

    public void setEndReason(String endReason) {
        this.endReason = endReason;
    }

    public String getZzysgh() {
        return zzysgh;
    }

    public void setZzysgh(String zzysgh) {
        this.zzysgh = zzysgh;
    }

    public String getZzysxm() {
        return zzysxm;
    }

    public void setZzysxm(String zzysxm) {
        this.zzysxm = zzysxm;
    }

    public String getZdbm() {
        return zdbm;
    }

    public void setZdbm(String zdbm) {
        this.zdbm = zdbm;
    }

    public String getBmlx() {
        return bmlx;
    }

    public void setBmlx(String bmlx) {
        this.bmlx = bmlx;
    }

    public String getDiagnosisDesc() {
        return diagnosisDesc;
    }

    public void setDiagnosisDesc(String diagnosisDesc) {
        this.diagnosisDesc = diagnosisDesc;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getRefSpecial() {
        return refSpecial;
    }

    public void setRefSpecial(String refSpecial) {
        this.refSpecial = refSpecial;
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
        return "MedBedInfo{" +
        "bedId = " + bedId +
        ", yljgdm = " + yljgdm +
        ", wsjgdm = " + wsjgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", kh = " + kh +
        ", zjhm = " + zjhm +
        ", zjlx = " + zjlx +
        ", klx = " + klx +
        ", serial = " + serial +
        ", startDate = " + startDate +
        ", endDate = " + endDate +
        ", endReason = " + endReason +
        ", zzysgh = " + zzysgh +
        ", zzysxm = " + zzysxm +
        ", zdbm = " + zdbm +
        ", bmlx = " + bmlx +
        ", diagnosisDesc = " + diagnosisDesc +
        ", subjectNo = " + subjectNo +
        ", refSpecial = " + refSpecial +
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
