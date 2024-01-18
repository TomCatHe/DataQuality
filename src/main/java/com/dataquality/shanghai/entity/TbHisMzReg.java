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
@TableName("TB_HIS_MZ_REG")
public class TbHisMzReg implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ghrq;

    private String ghbm;

    private String gthbz;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private String stfbh;

    private LocalDateTime gthsj;

    private String ghlb;

    private String bxlx;

    private String ybzhbz;

    private String ssjybz;

    private String ksbm;

    private String txbz;

    private String wdbz;

    private BigDecimal jmZfzlf;

    private BigDecimal jmZlf;

    private String kh;

    private String klx;

    private String zjhm;

    private String zjlx;

    private String sfyy;

    private String orderid;

    private String yygdfs;

    private String ghrcbs;

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

    public String getGhrq() {
        return ghrq;
    }

    public void setGhrq(String ghrq) {
        this.ghrq = ghrq;
    }

    public String getGhbm() {
        return ghbm;
    }

    public void setGhbm(String ghbm) {
        this.ghbm = ghbm;
    }

    public String getGthbz() {
        return gthbz;
    }

    public void setGthbz(String gthbz) {
        this.gthbz = gthbz;
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

    public String getStfbh() {
        return stfbh;
    }

    public void setStfbh(String stfbh) {
        this.stfbh = stfbh;
    }

    public LocalDateTime getGthsj() {
        return gthsj;
    }

    public void setGthsj(LocalDateTime gthsj) {
        this.gthsj = gthsj;
    }

    public String getGhlb() {
        return ghlb;
    }

    public void setGhlb(String ghlb) {
        this.ghlb = ghlb;
    }

    public String getBxlx() {
        return bxlx;
    }

    public void setBxlx(String bxlx) {
        this.bxlx = bxlx;
    }

    public String getYbzhbz() {
        return ybzhbz;
    }

    public void setYbzhbz(String ybzhbz) {
        this.ybzhbz = ybzhbz;
    }

    public String getSsjybz() {
        return ssjybz;
    }

    public void setSsjybz(String ssjybz) {
        this.ssjybz = ssjybz;
    }

    public String getKsbm() {
        return ksbm;
    }

    public void setKsbm(String ksbm) {
        this.ksbm = ksbm;
    }

    public String getTxbz() {
        return txbz;
    }

    public void setTxbz(String txbz) {
        this.txbz = txbz;
    }

    public String getWdbz() {
        return wdbz;
    }

    public void setWdbz(String wdbz) {
        this.wdbz = wdbz;
    }

    public BigDecimal getJmZfzlf() {
        return jmZfzlf;
    }

    public void setJmZfzlf(BigDecimal jmZfzlf) {
        this.jmZfzlf = jmZfzlf;
    }

    public BigDecimal getJmZlf() {
        return jmZlf;
    }

    public void setJmZlf(BigDecimal jmZlf) {
        this.jmZlf = jmZlf;
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

    public String getSfyy() {
        return sfyy;
    }

    public void setSfyy(String sfyy) {
        this.sfyy = sfyy;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getYygdfs() {
        return yygdfs;
    }

    public void setYygdfs(String yygdfs) {
        this.yygdfs = yygdfs;
    }

    public String getGhrcbs() {
        return ghrcbs;
    }

    public void setGhrcbs(String ghrcbs) {
        this.ghrcbs = ghrcbs;
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
        return "TbHisMzReg{" +
        "ghrq = " + ghrq +
        ", ghbm = " + ghbm +
        ", gthbz = " + gthbz +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", stfbh = " + stfbh +
        ", gthsj = " + gthsj +
        ", ghlb = " + ghlb +
        ", bxlx = " + bxlx +
        ", ybzhbz = " + ybzhbz +
        ", ssjybz = " + ssjybz +
        ", ksbm = " + ksbm +
        ", txbz = " + txbz +
        ", wdbz = " + wdbz +
        ", jmZfzlf = " + jmZfzlf +
        ", jmZlf = " + jmZlf +
        ", kh = " + kh +
        ", klx = " + klx +
        ", zjhm = " + zjhm +
        ", zjlx = " + zjlx +
        ", sfyy = " + sfyy +
        ", orderid = " + orderid +
        ", yygdfs = " + yygdfs +
        ", ghrcbs = " + ghrcbs +
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
