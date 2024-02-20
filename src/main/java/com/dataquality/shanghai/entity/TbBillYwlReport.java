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
@TableName("TB_BILL_YWL_REPORT")
public class TbBillYwlReport implements Serializable {

    private static final long serialVersionUID = 1L;

    private String wsjgdm;

    private String ywsj;

    private String fjWsjgdm;

    private String yljgdm;

    private BigDecimal dxpjzs;

    private BigDecimal dzpjmxzs;

    private BigDecimal dzpjchzs;

    private String cxbz;

    private String ylyl1;

    private String ylyl2;

    private String ylyl3;

    private Short warFlag;

    private String warNote;

    private LocalDateTime jlgxsj;

    private Integer llbz;

    private Short chkFlag;

    private Short sedBz;

    private String jlscrq;

    public String getWsjgdm() {
        return wsjgdm;
    }

    public void setWsjgdm(String wsjgdm) {
        this.wsjgdm = wsjgdm;
    }

    public String getYwsj() {
        return ywsj;
    }

    public void setYwsj(String ywsj) {
        this.ywsj = ywsj;
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

    public BigDecimal getDxpjzs() {
        return dxpjzs;
    }

    public void setDxpjzs(BigDecimal dxpjzs) {
        this.dxpjzs = dxpjzs;
    }

    public BigDecimal getDzpjmxzs() {
        return dzpjmxzs;
    }

    public void setDzpjmxzs(BigDecimal dzpjmxzs) {
        this.dzpjmxzs = dzpjmxzs;
    }

    public BigDecimal getDzpjchzs() {
        return dzpjchzs;
    }

    public void setDzpjchzs(BigDecimal dzpjchzs) {
        this.dzpjchzs = dzpjchzs;
    }

    public String getCxbz() {
        return cxbz;
    }

    public void setCxbz(String cxbz) {
        this.cxbz = cxbz;
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
        return "TbBillYwlReport{" +
        "wsjgdm = " + wsjgdm +
        ", ywsj = " + ywsj +
        ", fjWsjgdm = " + fjWsjgdm +
        ", yljgdm = " + yljgdm +
        ", dxpjzs = " + dxpjzs +
        ", dzpjmxzs = " + dzpjmxzs +
        ", dzpjchzs = " + dzpjchzs +
        ", cxbz = " + cxbz +
        ", ylyl1 = " + ylyl1 +
        ", ylyl2 = " + ylyl2 +
        ", ylyl3 = " + ylyl3 +
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
