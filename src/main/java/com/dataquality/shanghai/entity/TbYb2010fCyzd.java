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
@TableName("TB_YB2010F_CYZD")
public class TbYb2010fCyzd implements Serializable {

    private static final long serialVersionUID = 1L;

    private String fYljgdm;

    private String fJysj;

    private Integer rowNo;

    private String docNo;

    private String zxjylsh;

    private String kh;

    private String zyh;

    private String zyjsjsrq;

    private String cyzdbm;

    private String cyzdsm;

    private String jgzybz;

    private String zljgdm;

    private String bz1;

    private String bz2;

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

    public String getZyjsjsrq() {
        return zyjsjsrq;
    }

    public void setZyjsjsrq(String zyjsjsrq) {
        this.zyjsjsrq = zyjsjsrq;
    }

    public String getCyzdbm() {
        return cyzdbm;
    }

    public void setCyzdbm(String cyzdbm) {
        this.cyzdbm = cyzdbm;
    }

    public String getCyzdsm() {
        return cyzdsm;
    }

    public void setCyzdsm(String cyzdsm) {
        this.cyzdsm = cyzdsm;
    }

    public String getJgzybz() {
        return jgzybz;
    }

    public void setJgzybz(String jgzybz) {
        this.jgzybz = jgzybz;
    }

    public String getZljgdm() {
        return zljgdm;
    }

    public void setZljgdm(String zljgdm) {
        this.zljgdm = zljgdm;
    }

    public String getBz1() {
        return bz1;
    }

    public void setBz1(String bz1) {
        this.bz1 = bz1;
    }

    public String getBz2() {
        return bz2;
    }

    public void setBz2(String bz2) {
        this.bz2 = bz2;
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
        return "TbYb2010fCyzd{" +
        "fYljgdm = " + fYljgdm +
        ", fJysj = " + fJysj +
        ", rowNo = " + rowNo +
        ", docNo = " + docNo +
        ", zxjylsh = " + zxjylsh +
        ", kh = " + kh +
        ", zyh = " + zyh +
        ", zyjsjsrq = " + zyjsjsrq +
        ", cyzdbm = " + cyzdbm +
        ", cyzdsm = " + cyzdsm +
        ", jgzybz = " + jgzybz +
        ", zljgdm = " + zljgdm +
        ", bz1 = " + bz1 +
        ", bz2 = " + bz2 +
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
