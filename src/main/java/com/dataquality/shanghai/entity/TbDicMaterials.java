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
@TableName("TB_DIC_MATERIALS")
public class TbDicMaterials implements Serializable {

    private static final long serialVersionUID = 1L;

    private String yyzbdm;

    private String wsjgdm;

    private String ybmlbm;

    private String yljgdm;

    private String fjWsjgdm;

    private String xmwsdm;

    private String xmmc;

    private String sfdw;

    private BigDecimal sfdj;

    private String sfxdlb;

    private String gzhcbz;

    private String zrclbz;

    private String sybz;

    private String ynzjbz;

    private String tbsm;

    private String bzsm;

    private Short warFlag;

    private String warNote;

    private LocalDateTime jlgxsj;

    private Integer llbz;

    private Short chkFlag;

    private Short sedBz;

    private String jlscrq;

    public String getYyzbdm() {
        return yyzbdm;
    }

    public void setYyzbdm(String yyzbdm) {
        this.yyzbdm = yyzbdm;
    }

    public String getWsjgdm() {
        return wsjgdm;
    }

    public void setWsjgdm(String wsjgdm) {
        this.wsjgdm = wsjgdm;
    }

    public String getYbmlbm() {
        return ybmlbm;
    }

    public void setYbmlbm(String ybmlbm) {
        this.ybmlbm = ybmlbm;
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

    public String getXmwsdm() {
        return xmwsdm;
    }

    public void setXmwsdm(String xmwsdm) {
        this.xmwsdm = xmwsdm;
    }

    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public String getSfdw() {
        return sfdw;
    }

    public void setSfdw(String sfdw) {
        this.sfdw = sfdw;
    }

    public BigDecimal getSfdj() {
        return sfdj;
    }

    public void setSfdj(BigDecimal sfdj) {
        this.sfdj = sfdj;
    }

    public String getSfxdlb() {
        return sfxdlb;
    }

    public void setSfxdlb(String sfxdlb) {
        this.sfxdlb = sfxdlb;
    }

    public String getGzhcbz() {
        return gzhcbz;
    }

    public void setGzhcbz(String gzhcbz) {
        this.gzhcbz = gzhcbz;
    }

    public String getZrclbz() {
        return zrclbz;
    }

    public void setZrclbz(String zrclbz) {
        this.zrclbz = zrclbz;
    }

    public String getSybz() {
        return sybz;
    }

    public void setSybz(String sybz) {
        this.sybz = sybz;
    }

    public String getYnzjbz() {
        return ynzjbz;
    }

    public void setYnzjbz(String ynzjbz) {
        this.ynzjbz = ynzjbz;
    }

    public String getTbsm() {
        return tbsm;
    }

    public void setTbsm(String tbsm) {
        this.tbsm = tbsm;
    }

    public String getBzsm() {
        return bzsm;
    }

    public void setBzsm(String bzsm) {
        this.bzsm = bzsm;
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
        return "TbDicMaterials{" +
        "yyzbdm = " + yyzbdm +
        ", wsjgdm = " + wsjgdm +
        ", ybmlbm = " + ybmlbm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", xmwsdm = " + xmwsdm +
        ", xmmc = " + xmmc +
        ", sfdw = " + sfdw +
        ", sfdj = " + sfdj +
        ", sfxdlb = " + sfxdlb +
        ", gzhcbz = " + gzhcbz +
        ", zrclbz = " + zrclbz +
        ", sybz = " + sybz +
        ", ynzjbz = " + ynzjbz +
        ", tbsm = " + tbsm +
        ", bzsm = " + bzsm +
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
