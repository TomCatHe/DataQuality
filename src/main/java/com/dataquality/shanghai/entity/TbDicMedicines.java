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
@TableName("TB_DIC_MEDICINES")
public class TbDicMedicines implements Serializable {

    private static final long serialVersionUID = 1L;

    private String yyzbdm;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private String ybmlbm;

    private String sybz;

    private String tymc;

    private String ywmc;

    private String jxda;

    private String yppzwh;

    private String bzjx;

    private String ynzjbz;

    private String tbsm;

    private String jybz;

    private String kssbz;

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

    public String getYbmlbm() {
        return ybmlbm;
    }

    public void setYbmlbm(String ybmlbm) {
        this.ybmlbm = ybmlbm;
    }

    public String getSybz() {
        return sybz;
    }

    public void setSybz(String sybz) {
        this.sybz = sybz;
    }

    public String getTymc() {
        return tymc;
    }

    public void setTymc(String tymc) {
        this.tymc = tymc;
    }

    public String getYwmc() {
        return ywmc;
    }

    public void setYwmc(String ywmc) {
        this.ywmc = ywmc;
    }

    public String getJxda() {
        return jxda;
    }

    public void setJxda(String jxda) {
        this.jxda = jxda;
    }

    public String getYppzwh() {
        return yppzwh;
    }

    public void setYppzwh(String yppzwh) {
        this.yppzwh = yppzwh;
    }

    public String getBzjx() {
        return bzjx;
    }

    public void setBzjx(String bzjx) {
        this.bzjx = bzjx;
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

    public String getJybz() {
        return jybz;
    }

    public void setJybz(String jybz) {
        this.jybz = jybz;
    }

    public String getKssbz() {
        return kssbz;
    }

    public void setKssbz(String kssbz) {
        this.kssbz = kssbz;
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
        return "TbDicMedicines{" +
        "yyzbdm = " + yyzbdm +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", ybmlbm = " + ybmlbm +
        ", sybz = " + sybz +
        ", tymc = " + tymc +
        ", ywmc = " + ywmc +
        ", jxda = " + jxda +
        ", yppzwh = " + yppzwh +
        ", bzjx = " + bzjx +
        ", ynzjbz = " + ynzjbz +
        ", tbsm = " + tbsm +
        ", jybz = " + jybz +
        ", kssbz = " + kssbz +
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
