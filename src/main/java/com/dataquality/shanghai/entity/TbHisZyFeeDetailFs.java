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
@TableName("TB_HIS_ZY_FEE_DETAIL_FS")
public class TbHisZyFeeDetailFs implements Serializable {

    private static final long serialVersionUID = 1L;

    private String mxfsid;

    private Short xgbz;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private String jzlsh;

    private String kh;

    private String klx;

    private String zjhm;

    private String zjlx;

    private String yzid;

    private String bxlx;

    private String mxfylb;

    private LocalDateTime fyfssj;

    private String xmbm;

    private String ybmlbm;

    private String mxxmmc;

    private String mxxmdw;

    private BigDecimal mxxmdj;

    private BigDecimal mxxmsl;

    private BigDecimal mxxmje;

    private String ylyl1;

    private String ylyl2;

    private Short warFlag;

    private String warNote;

    private LocalDateTime jlgxsj;

    private Integer llbz;

    private Short chkFlag;

    private Short sedBz;

    private String jlscrq;

    public String getMxfsid() {
        return mxfsid;
    }

    public void setMxfsid(String mxfsid) {
        this.mxfsid = mxfsid;
    }

    public Short getXgbz() {
        return xgbz;
    }

    public void setXgbz(Short xgbz) {
        this.xgbz = xgbz;
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

    public String getJzlsh() {
        return jzlsh;
    }

    public void setJzlsh(String jzlsh) {
        this.jzlsh = jzlsh;
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

    public String getYzid() {
        return yzid;
    }

    public void setYzid(String yzid) {
        this.yzid = yzid;
    }

    public String getBxlx() {
        return bxlx;
    }

    public void setBxlx(String bxlx) {
        this.bxlx = bxlx;
    }

    public String getMxfylb() {
        return mxfylb;
    }

    public void setMxfylb(String mxfylb) {
        this.mxfylb = mxfylb;
    }

    public LocalDateTime getFyfssj() {
        return fyfssj;
    }

    public void setFyfssj(LocalDateTime fyfssj) {
        this.fyfssj = fyfssj;
    }

    public String getXmbm() {
        return xmbm;
    }

    public void setXmbm(String xmbm) {
        this.xmbm = xmbm;
    }

    public String getYbmlbm() {
        return ybmlbm;
    }

    public void setYbmlbm(String ybmlbm) {
        this.ybmlbm = ybmlbm;
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
        return "TbHisZyFeeDetailFs{" +
        "mxfsid = " + mxfsid +
        ", xgbz = " + xgbz +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", jzlsh = " + jzlsh +
        ", kh = " + kh +
        ", klx = " + klx +
        ", zjhm = " + zjhm +
        ", zjlx = " + zjlx +
        ", yzid = " + yzid +
        ", bxlx = " + bxlx +
        ", mxfylb = " + mxfylb +
        ", fyfssj = " + fyfssj +
        ", xmbm = " + xmbm +
        ", ybmlbm = " + ybmlbm +
        ", mxxmmc = " + mxxmmc +
        ", mxxmdw = " + mxxmdw +
        ", mxxmdj = " + mxxmdj +
        ", mxxmsl = " + mxxmsl +
        ", mxxmje = " + mxxmje +
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
