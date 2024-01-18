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
@TableName("TB_BILL_DETAIL")
public class TbBillDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private String wsjgdm;

    private String billbatchcode;

    private String billno;

    private String infoNo;

    private String fjWsjgdm;

    private String yljgdm;

    private String busno;

    private LocalDateTime paydate;

    private String paycode;

    private String fylb;

    private String payname;

    private String unit;

    private BigDecimal paynumber;

    private BigDecimal price;

    private BigDecimal amt;

    private BigDecimal ownamt;

    private BigDecimal selfamt;

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

    public String getBillbatchcode() {
        return billbatchcode;
    }

    public void setBillbatchcode(String billbatchcode) {
        this.billbatchcode = billbatchcode;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getInfoNo() {
        return infoNo;
    }

    public void setInfoNo(String infoNo) {
        this.infoNo = infoNo;
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

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno;
    }

    public LocalDateTime getPaydate() {
        return paydate;
    }

    public void setPaydate(LocalDateTime paydate) {
        this.paydate = paydate;
    }

    public String getPaycode() {
        return paycode;
    }

    public void setPaycode(String paycode) {
        this.paycode = paycode;
    }

    public String getFylb() {
        return fylb;
    }

    public void setFylb(String fylb) {
        this.fylb = fylb;
    }

    public String getPayname() {
        return payname;
    }

    public void setPayname(String payname) {
        this.payname = payname;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getPaynumber() {
        return paynumber;
    }

    public void setPaynumber(BigDecimal paynumber) {
        this.paynumber = paynumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public BigDecimal getOwnamt() {
        return ownamt;
    }

    public void setOwnamt(BigDecimal ownamt) {
        this.ownamt = ownamt;
    }

    public BigDecimal getSelfamt() {
        return selfamt;
    }

    public void setSelfamt(BigDecimal selfamt) {
        this.selfamt = selfamt;
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
        return "TbBillDetail{" +
        "wsjgdm = " + wsjgdm +
        ", billbatchcode = " + billbatchcode +
        ", billno = " + billno +
        ", infoNo = " + infoNo +
        ", fjWsjgdm = " + fjWsjgdm +
        ", yljgdm = " + yljgdm +
        ", busno = " + busno +
        ", paydate = " + paydate +
        ", paycode = " + paycode +
        ", fylb = " + fylb +
        ", payname = " + payname +
        ", unit = " + unit +
        ", paynumber = " + paynumber +
        ", price = " + price +
        ", amt = " + amt +
        ", ownamt = " + ownamt +
        ", selfamt = " + selfamt +
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
