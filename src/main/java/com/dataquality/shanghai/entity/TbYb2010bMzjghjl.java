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
@TableName("TB_YB2010B_MZJGHJL")
public class TbYb2010bMzjghjl implements Serializable {

    private static final long serialVersionUID = 1L;

    private String fYljgdm;

    private String fJysj;

    private Integer rowNo;

    private String docNo;

    private String zxjylsh;

    private String kh;

    private String ksbm;

    private String ksmc;

    private BigDecimal ghf;

    private BigDecimal zlf;

    private BigDecimal jyfyje;

    private BigDecimal ybjsfwje;

    private BigDecimal fybjsfwgrzf;

    private String jyqrydzxdfhsj;

    private String syybbf;

    private String jslxbz;

    private String stfbz;

    private String jzlsh;

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

    public String getKh() {
        return kh;
    }

    public void setKh(String kh) {
        this.kh = kh;
    }

    public String getKsbm() {
        return ksbm;
    }

    public void setKsbm(String ksbm) {
        this.ksbm = ksbm;
    }

    public String getKsmc() {
        return ksmc;
    }

    public void setKsmc(String ksmc) {
        this.ksmc = ksmc;
    }

    public BigDecimal getGhf() {
        return ghf;
    }

    public void setGhf(BigDecimal ghf) {
        this.ghf = ghf;
    }

    public BigDecimal getZlf() {
        return zlf;
    }

    public void setZlf(BigDecimal zlf) {
        this.zlf = zlf;
    }

    public BigDecimal getJyfyje() {
        return jyfyje;
    }

    public void setJyfyje(BigDecimal jyfyje) {
        this.jyfyje = jyfyje;
    }

    public BigDecimal getYbjsfwje() {
        return ybjsfwje;
    }

    public void setYbjsfwje(BigDecimal ybjsfwje) {
        this.ybjsfwje = ybjsfwje;
    }

    public BigDecimal getFybjsfwgrzf() {
        return fybjsfwgrzf;
    }

    public void setFybjsfwgrzf(BigDecimal fybjsfwgrzf) {
        this.fybjsfwgrzf = fybjsfwgrzf;
    }

    public String getJyqrydzxdfhsj() {
        return jyqrydzxdfhsj;
    }

    public void setJyqrydzxdfhsj(String jyqrydzxdfhsj) {
        this.jyqrydzxdfhsj = jyqrydzxdfhsj;
    }

    public String getSyybbf() {
        return syybbf;
    }

    public void setSyybbf(String syybbf) {
        this.syybbf = syybbf;
    }

    public String getJslxbz() {
        return jslxbz;
    }

    public void setJslxbz(String jslxbz) {
        this.jslxbz = jslxbz;
    }

    public String getStfbz() {
        return stfbz;
    }

    public void setStfbz(String stfbz) {
        this.stfbz = stfbz;
    }

    public String getJzlsh() {
        return jzlsh;
    }

    public void setJzlsh(String jzlsh) {
        this.jzlsh = jzlsh;
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
        return "TbYb2010bMzjghjl{" +
        "fYljgdm = " + fYljgdm +
        ", fJysj = " + fJysj +
        ", rowNo = " + rowNo +
        ", docNo = " + docNo +
        ", zxjylsh = " + zxjylsh +
        ", kh = " + kh +
        ", ksbm = " + ksbm +
        ", ksmc = " + ksmc +
        ", ghf = " + ghf +
        ", zlf = " + zlf +
        ", jyfyje = " + jyfyje +
        ", ybjsfwje = " + ybjsfwje +
        ", fybjsfwgrzf = " + fybjsfwgrzf +
        ", jyqrydzxdfhsj = " + jyqrydzxdfhsj +
        ", syybbf = " + syybbf +
        ", jslxbz = " + jslxbz +
        ", stfbz = " + stfbz +
        ", jzlsh = " + jzlsh +
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
