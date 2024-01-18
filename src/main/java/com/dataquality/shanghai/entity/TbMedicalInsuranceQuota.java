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
@TableName("TB_MEDICAL_INSURANCE_QUOTA")
public class TbMedicalInsuranceQuota implements Serializable {

    private static final long serialVersionUID = 1L;

    private String yljgdm;

    private String zrnd;

    private String edsygjdm;

    private String ybzknd;

    private String yjksj;

    private BigDecimal ybzffyzed;

    private BigDecimal ybyped;

    private BigDecimal zedjsjs;

    private Short zejsfdbfb;

    private BigDecimal ybjsfyzed;

    private BigDecimal mjzjcfyzb;

    private BigDecimal crjfyzb;

    private BigDecimal pjzytszb;

    private BigDecimal yzbzb;

    private String ylyl1;

    private String ylyl2;

    private String ylyl3;

    private String ylyl4;

    private Short warFlag;

    private String warNote;

    private LocalDateTime jlgxsj;

    private Integer llbz;

    private Short chkFlag;

    private Short sedBz;

    private String jlscrq;

    public String getYljgdm() {
        return yljgdm;
    }

    public void setYljgdm(String yljgdm) {
        this.yljgdm = yljgdm;
    }

    public String getZrnd() {
        return zrnd;
    }

    public void setZrnd(String zrnd) {
        this.zrnd = zrnd;
    }

    public String getEdsygjdm() {
        return edsygjdm;
    }

    public void setEdsygjdm(String edsygjdm) {
        this.edsygjdm = edsygjdm;
    }

    public String getYbzknd() {
        return ybzknd;
    }

    public void setYbzknd(String ybzknd) {
        this.ybzknd = ybzknd;
    }

    public String getYjksj() {
        return yjksj;
    }

    public void setYjksj(String yjksj) {
        this.yjksj = yjksj;
    }

    public BigDecimal getYbzffyzed() {
        return ybzffyzed;
    }

    public void setYbzffyzed(BigDecimal ybzffyzed) {
        this.ybzffyzed = ybzffyzed;
    }

    public BigDecimal getYbyped() {
        return ybyped;
    }

    public void setYbyped(BigDecimal ybyped) {
        this.ybyped = ybyped;
    }

    public BigDecimal getZedjsjs() {
        return zedjsjs;
    }

    public void setZedjsjs(BigDecimal zedjsjs) {
        this.zedjsjs = zedjsjs;
    }

    public Short getZejsfdbfb() {
        return zejsfdbfb;
    }

    public void setZejsfdbfb(Short zejsfdbfb) {
        this.zejsfdbfb = zejsfdbfb;
    }

    public BigDecimal getYbjsfyzed() {
        return ybjsfyzed;
    }

    public void setYbjsfyzed(BigDecimal ybjsfyzed) {
        this.ybjsfyzed = ybjsfyzed;
    }

    public BigDecimal getMjzjcfyzb() {
        return mjzjcfyzb;
    }

    public void setMjzjcfyzb(BigDecimal mjzjcfyzb) {
        this.mjzjcfyzb = mjzjcfyzb;
    }

    public BigDecimal getCrjfyzb() {
        return crjfyzb;
    }

    public void setCrjfyzb(BigDecimal crjfyzb) {
        this.crjfyzb = crjfyzb;
    }

    public BigDecimal getPjzytszb() {
        return pjzytszb;
    }

    public void setPjzytszb(BigDecimal pjzytszb) {
        this.pjzytszb = pjzytszb;
    }

    public BigDecimal getYzbzb() {
        return yzbzb;
    }

    public void setYzbzb(BigDecimal yzbzb) {
        this.yzbzb = yzbzb;
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

    public String getYlyl3() {
        return ylyl3;
    }

    public void setYlyl3(String ylyl3) {
        this.ylyl3 = ylyl3;
    }

    public String getYlyl4() {
        return ylyl4;
    }

    public void setYlyl4(String ylyl4) {
        this.ylyl4 = ylyl4;
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
        return "TbMedicalInsuranceQuota{" +
        "yljgdm = " + yljgdm +
        ", zrnd = " + zrnd +
        ", edsygjdm = " + edsygjdm +
        ", ybzknd = " + ybzknd +
        ", yjksj = " + yjksj +
        ", ybzffyzed = " + ybzffyzed +
        ", ybyped = " + ybyped +
        ", zedjsjs = " + zedjsjs +
        ", zejsfdbfb = " + zejsfdbfb +
        ", ybjsfyzed = " + ybjsfyzed +
        ", mjzjcfyzb = " + mjzjcfyzb +
        ", crjfyzb = " + crjfyzb +
        ", pjzytszb = " + pjzytszb +
        ", yzbzb = " + yzbzb +
        ", ylyl1 = " + ylyl1 +
        ", ylyl2 = " + ylyl2 +
        ", ylyl3 = " + ylyl3 +
        ", ylyl4 = " + ylyl4 +
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
