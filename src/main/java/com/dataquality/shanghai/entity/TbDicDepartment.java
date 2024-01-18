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
@TableName("TB_DIC_DEPARTMENT")
public class TbDicDepartment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String yyksdm;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private String yyksmc;

    private String kstybz;

    private String wsjdm;

    private String ybdm;

    private String ksxz;

    private String ksflbz;

    private String ksjj;

    private String sfkzyy;

    private Short xgbz;

    private String sm;

    private Short warFlag;

    private String warNote;

    private LocalDateTime jlgxsj;

    private Integer llbz;

    private Short chkFlag;

    private Short sedBz;

    private String jlscrq;

    public String getYyksdm() {
        return yyksdm;
    }

    public void setYyksdm(String yyksdm) {
        this.yyksdm = yyksdm;
    }

    public String getWsjgdm() {
        return wsjgdm;
    }

    public void setWsjgdm(String wsjgdm) {
        this.wsjgdm = wsjgdm;
    }

    public String getYljgdm() {
        return yljgdm;
    }

    public void setYljgdm(String yljgdm) {
        this.yljgdm = yljgdm;
    }

    public String getFjWsjgdm() {
        return fjWsjgdm;
    }

    public void setFjWsjgdm(String fjWsjgdm) {
        this.fjWsjgdm = fjWsjgdm;
    }

    public String getYyksmc() {
        return yyksmc;
    }

    public void setYyksmc(String yyksmc) {
        this.yyksmc = yyksmc;
    }

    public String getKstybz() {
        return kstybz;
    }

    public void setKstybz(String kstybz) {
        this.kstybz = kstybz;
    }

    public String getWsjdm() {
        return wsjdm;
    }

    public void setWsjdm(String wsjdm) {
        this.wsjdm = wsjdm;
    }

    public String getYbdm() {
        return ybdm;
    }

    public void setYbdm(String ybdm) {
        this.ybdm = ybdm;
    }

    public String getKsxz() {
        return ksxz;
    }

    public void setKsxz(String ksxz) {
        this.ksxz = ksxz;
    }

    public String getKsflbz() {
        return ksflbz;
    }

    public void setKsflbz(String ksflbz) {
        this.ksflbz = ksflbz;
    }

    public String getKsjj() {
        return ksjj;
    }

    public void setKsjj(String ksjj) {
        this.ksjj = ksjj;
    }

    public String getSfkzyy() {
        return sfkzyy;
    }

    public void setSfkzyy(String sfkzyy) {
        this.sfkzyy = sfkzyy;
    }

    public Short getXgbz() {
        return xgbz;
    }

    public void setXgbz(Short xgbz) {
        this.xgbz = xgbz;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
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
        return "TbDicDepartment{" +
        "yyksdm = " + yyksdm +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", yyksmc = " + yyksmc +
        ", kstybz = " + kstybz +
        ", wsjdm = " + wsjdm +
        ", ybdm = " + ybdm +
        ", ksxz = " + ksxz +
        ", ksflbz = " + ksflbz +
        ", ksjj = " + ksjj +
        ", sfkzyy = " + sfkzyy +
        ", xgbz = " + xgbz +
        ", sm = " + sm +
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
