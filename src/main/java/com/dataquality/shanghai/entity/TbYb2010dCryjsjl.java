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
@TableName("TB_YB2010D_CRYJSJL")
public class TbYb2010dCryjsjl implements Serializable {

    private static final long serialVersionUID = 1L;

    private String fYljgdm;

    private String fJysj;

    private Integer rowNo;

    private String docNo;

    private String zxjylsh;

    private String kh;

    private String zyh;

    private Integer bcjszyts;

    private String zyjsksrq;

    private String ryzdbm;

    private String ryzdsm;

    private String zyjsjssj;

    private String jgzybz;

    private String cybz;

    private String jyqrydzxdfhsj;

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

    public String getZyh() {
        return zyh;
    }

    public void setZyh(String zyh) {
        this.zyh = zyh;
    }

    public Integer getBcjszyts() {
        return bcjszyts;
    }

    public void setBcjszyts(Integer bcjszyts) {
        this.bcjszyts = bcjszyts;
    }

    public String getZyjsksrq() {
        return zyjsksrq;
    }

    public void setZyjsksrq(String zyjsksrq) {
        this.zyjsksrq = zyjsksrq;
    }

    public String getRyzdbm() {
        return ryzdbm;
    }

    public void setRyzdbm(String ryzdbm) {
        this.ryzdbm = ryzdbm;
    }

    public String getRyzdsm() {
        return ryzdsm;
    }

    public void setRyzdsm(String ryzdsm) {
        this.ryzdsm = ryzdsm;
    }

    public String getZyjsjssj() {
        return zyjsjssj;
    }

    public void setZyjsjssj(String zyjsjssj) {
        this.zyjsjssj = zyjsjssj;
    }

    public String getJgzybz() {
        return jgzybz;
    }

    public void setJgzybz(String jgzybz) {
        this.jgzybz = jgzybz;
    }

    public String getCybz() {
        return cybz;
    }

    public void setCybz(String cybz) {
        this.cybz = cybz;
    }

    public String getJyqrydzxdfhsj() {
        return jyqrydzxdfhsj;
    }

    public void setJyqrydzxdfhsj(String jyqrydzxdfhsj) {
        this.jyqrydzxdfhsj = jyqrydzxdfhsj;
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
        return "TbYb2010dCryjsjl{" +
        "fYljgdm = " + fYljgdm +
        ", fJysj = " + fJysj +
        ", rowNo = " + rowNo +
        ", docNo = " + docNo +
        ", zxjylsh = " + zxjylsh +
        ", kh = " + kh +
        ", zyh = " + zyh +
        ", bcjszyts = " + bcjszyts +
        ", zyjsksrq = " + zyjsksrq +
        ", ryzdbm = " + ryzdbm +
        ", ryzdsm = " + ryzdsm +
        ", zyjsjssj = " + zyjsjssj +
        ", jgzybz = " + jgzybz +
        ", cybz = " + cybz +
        ", jyqrydzxdfhsj = " + jyqrydzxdfhsj +
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
