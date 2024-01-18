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
@TableName("TB_YB2010G_MXXMXF")
public class TbYb2010gMxxmxf implements Serializable {

    private static final long serialVersionUID = 1L;

    private String fYljgdm;

    private String fJysj;

    private Integer rowNo;

    private String docNo;

    private String zxjylsh;

    private String jzlsh;

    private String bxxmbm;

    private String mxxmxflsh;

    private String mxxmbmZl;

    private String mxxmmcZl;

    private String mxxmdwZl;

    private String mxxmdjZl;

    private Integer mxxmslZl;

    private Long mxxmjeZl;

    private Short bxbz;

    private String yptym;

    private String zczh;

    private String mxxmggZl;

    private String stfbz;

    private String mxxmsyrq;

    private Short warFlag;

    private String warNote;

    private LocalDateTime jlgxsj;

    private Integer llbz;

    private Short chkFlag;

    private Short sedBz;

    private String jlscrq;

    public String getfYljgdm() {
        return fYljgdm;
    }

    public void setfYljgdm(String fYljgdm) {
        this.fYljgdm = fYljgdm;
    }

    public String getfJysj() {
        return fJysj;
    }

    public void setfJysj(String fJysj) {
        this.fJysj = fJysj;
    }

    public Integer getRowNo() {
        return rowNo;
    }

    public void setRowNo(Integer rowNo) {
        this.rowNo = rowNo;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public String getZxjylsh() {
        return zxjylsh;
    }

    public void setZxjylsh(String zxjylsh) {
        this.zxjylsh = zxjylsh;
    }

    public String getJzlsh() {
        return jzlsh;
    }

    public void setJzlsh(String jzlsh) {
        this.jzlsh = jzlsh;
    }

    public String getBxxmbm() {
        return bxxmbm;
    }

    public void setBxxmbm(String bxxmbm) {
        this.bxxmbm = bxxmbm;
    }

    public String getMxxmxflsh() {
        return mxxmxflsh;
    }

    public void setMxxmxflsh(String mxxmxflsh) {
        this.mxxmxflsh = mxxmxflsh;
    }

    public String getMxxmbmZl() {
        return mxxmbmZl;
    }

    public void setMxxmbmZl(String mxxmbmZl) {
        this.mxxmbmZl = mxxmbmZl;
    }

    public String getMxxmmcZl() {
        return mxxmmcZl;
    }

    public void setMxxmmcZl(String mxxmmcZl) {
        this.mxxmmcZl = mxxmmcZl;
    }

    public String getMxxmdwZl() {
        return mxxmdwZl;
    }

    public void setMxxmdwZl(String mxxmdwZl) {
        this.mxxmdwZl = mxxmdwZl;
    }

    public String getMxxmdjZl() {
        return mxxmdjZl;
    }

    public void setMxxmdjZl(String mxxmdjZl) {
        this.mxxmdjZl = mxxmdjZl;
    }

    public Integer getMxxmslZl() {
        return mxxmslZl;
    }

    public void setMxxmslZl(Integer mxxmslZl) {
        this.mxxmslZl = mxxmslZl;
    }

    public Long getMxxmjeZl() {
        return mxxmjeZl;
    }

    public void setMxxmjeZl(Long mxxmjeZl) {
        this.mxxmjeZl = mxxmjeZl;
    }

    public Short getBxbz() {
        return bxbz;
    }

    public void setBxbz(Short bxbz) {
        this.bxbz = bxbz;
    }

    public String getYptym() {
        return yptym;
    }

    public void setYptym(String yptym) {
        this.yptym = yptym;
    }

    public String getZczh() {
        return zczh;
    }

    public void setZczh(String zczh) {
        this.zczh = zczh;
    }

    public String getMxxmggZl() {
        return mxxmggZl;
    }

    public void setMxxmggZl(String mxxmggZl) {
        this.mxxmggZl = mxxmggZl;
    }

    public String getStfbz() {
        return stfbz;
    }

    public void setStfbz(String stfbz) {
        this.stfbz = stfbz;
    }

    public String getMxxmsyrq() {
        return mxxmsyrq;
    }

    public void setMxxmsyrq(String mxxmsyrq) {
        this.mxxmsyrq = mxxmsyrq;
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
        return "TbYb2010gMxxmxf{" +
        "fYljgdm = " + fYljgdm +
        ", fJysj = " + fJysj +
        ", rowNo = " + rowNo +
        ", docNo = " + docNo +
        ", zxjylsh = " + zxjylsh +
        ", jzlsh = " + jzlsh +
        ", bxxmbm = " + bxxmbm +
        ", mxxmxflsh = " + mxxmxflsh +
        ", mxxmbmZl = " + mxxmbmZl +
        ", mxxmmcZl = " + mxxmmcZl +
        ", mxxmdwZl = " + mxxmdwZl +
        ", mxxmdjZl = " + mxxmdjZl +
        ", mxxmslZl = " + mxxmslZl +
        ", mxxmjeZl = " + mxxmjeZl +
        ", bxbz = " + bxbz +
        ", yptym = " + yptym +
        ", zczh = " + zczh +
        ", mxxmggZl = " + mxxmggZl +
        ", stfbz = " + stfbz +
        ", mxxmsyrq = " + mxxmsyrq +
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
