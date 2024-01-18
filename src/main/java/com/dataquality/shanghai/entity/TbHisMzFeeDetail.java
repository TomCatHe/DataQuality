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
@TableName("TB_HIS_MZ_FEE_DETAIL")
public class TbHisMzFeeDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private String sfmxid;

    private String tfbz;

    private String wsjgdm;

    private String fjWsjgdm;

    private String yljgdm;

    private String zjhm;

    private String zjlx;

    private String jzlsh;

    private String stfbh;

    private String kh;

    private String klx;

    private String zllx;

    private String bxlx;

    private String cfidh;

    private String fph;

    private String mxfylb;

    private LocalDateTime stfsj;

    private String mxxmbm;

    private String mxxmbmyb;

    private String scph;

    private String yxqz;

    private String mxxmmc;

    private String mxxmdw;

    private BigDecimal mxxmdj;

    private BigDecimal mxxmsl;

    private BigDecimal mxxmje;

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

    public String getSfmxid() {
        return sfmxid;
    }

    public void setSfmxid(String sfmxid) {
        this.sfmxid = sfmxid;
    }

    public String getTfbz() {
        return tfbz;
    }

    public void setTfbz(String tfbz) {
        this.tfbz = tfbz;
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

    public String getJzlsh() {
        return jzlsh;
    }

    public void setJzlsh(String jzlsh) {
        this.jzlsh = jzlsh;
    }

    public String getStfbh() {
        return stfbh;
    }

    public void setStfbh(String stfbh) {
        this.stfbh = stfbh;
    }

    public String getKh() {
        return kh;
    }

    public void setKh(String kh) {
        this.kh = kh;
    }

    public String getKlx() {
        return klx;
    }

    public void setKlx(String klx) {
        this.klx = klx;
    }

    public String getZllx() {
        return zllx;
    }

    public void setZllx(String zllx) {
        this.zllx = zllx;
    }

    public String getBxlx() {
        return bxlx;
    }

    public void setBxlx(String bxlx) {
        this.bxlx = bxlx;
    }

    public String getCfidh() {
        return cfidh;
    }

    public void setCfidh(String cfidh) {
        this.cfidh = cfidh;
    }

    public String getFph() {
        return fph;
    }

    public void setFph(String fph) {
        this.fph = fph;
    }

    public String getMxfylb() {
        return mxfylb;
    }

    public void setMxfylb(String mxfylb) {
        this.mxfylb = mxfylb;
    }

    public LocalDateTime getStfsj() {
        return stfsj;
    }

    public void setStfsj(LocalDateTime stfsj) {
        this.stfsj = stfsj;
    }

    public String getMxxmbm() {
        return mxxmbm;
    }

    public void setMxxmbm(String mxxmbm) {
        this.mxxmbm = mxxmbm;
    }

    public String getMxxmbmyb() {
        return mxxmbmyb;
    }

    public void setMxxmbmyb(String mxxmbmyb) {
        this.mxxmbmyb = mxxmbmyb;
    }

    public String getScph() {
        return scph;
    }

    public void setScph(String scph) {
        this.scph = scph;
    }

    public String getYxqz() {
        return yxqz;
    }

    public void setYxqz(String yxqz) {
        this.yxqz = yxqz;
    }

    public String getMxxmmc() {
        return mxxmmc;
    }

    public void setMxxmmc(String mxxmmc) {
        this.mxxmmc = mxxmmc;
    }

    public String getMxxmdw() {
        return mxxmdw;
    }

    public void setMxxmdw(String mxxmdw) {
        this.mxxmdw = mxxmdw;
    }

    public BigDecimal getMxxmdj() {
        return mxxmdj;
    }

    public void setMxxmdj(BigDecimal mxxmdj) {
        this.mxxmdj = mxxmdj;
    }

    public BigDecimal getMxxmsl() {
        return mxxmsl;
    }

    public void setMxxmsl(BigDecimal mxxmsl) {
        this.mxxmsl = mxxmsl;
    }

    public BigDecimal getMxxmje() {
        return mxxmje;
    }

    public void setMxxmje(BigDecimal mxxmje) {
        this.mxxmje = mxxmje;
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
        return "TbHisMzFeeDetail{" +
        "sfmxid = " + sfmxid +
        ", tfbz = " + tfbz +
        ", wsjgdm = " + wsjgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", yljgdm = " + yljgdm +
        ", zjhm = " + zjhm +
        ", zjlx = " + zjlx +
        ", jzlsh = " + jzlsh +
        ", stfbh = " + stfbh +
        ", kh = " + kh +
        ", klx = " + klx +
        ", zllx = " + zllx +
        ", bxlx = " + bxlx +
        ", cfidh = " + cfidh +
        ", fph = " + fph +
        ", mxfylb = " + mxfylb +
        ", stfsj = " + stfsj +
        ", mxxmbm = " + mxxmbm +
        ", mxxmbmyb = " + mxxmbmyb +
        ", scph = " + scph +
        ", yxqz = " + yxqz +
        ", mxxmmc = " + mxxmmc +
        ", mxxmdw = " + mxxmdw +
        ", mxxmdj = " + mxxmdj +
        ", mxxmsl = " + mxxmsl +
        ", mxxmje = " + mxxmje +
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
