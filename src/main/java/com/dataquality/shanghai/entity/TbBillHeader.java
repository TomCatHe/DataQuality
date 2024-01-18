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
@TableName("TB_BILL_HEADER")
public class TbBillHeader implements Serializable {

    private static final long serialVersionUID = 1L;

    private String wsjgdm;

    private String billbatchcode;

    private String billno;

    private String fjWsjgdm;

    private String yljgdm;

    private String busno;

    private String jzlsh;

    private String bustype;

    private String jzrq;

    private String jglx;

    private String payer;

    private LocalDateTime paydate;

    private BigDecimal totalamt;

    private String jzksbm;

    private String jzksmc;

    private String payertype;

    private String idcardno;

    private String medcaretypecode;

    private String medicalinsuranceid;

    private BigDecimal fundpay;

    private BigDecimal accountpay;

    private BigDecimal otherfundpay;

    private BigDecimal fjjjzf;

    private BigDecimal selfpayamt;

    private BigDecimal selfconceitedamt;

    private BigDecimal flzf;

    private BigDecimal ownpay;

    private String cxbz;

    private String ylyl1;

    private String ylyl2;

    private String ylyl3;

    private String remark;

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

    public String getJzlsh() {
        return jzlsh;
    }

    public void setJzlsh(String jzlsh) {
        this.jzlsh = jzlsh;
    }

    public String getBustype() {
        return bustype;
    }

    public void setBustype(String bustype) {
        this.bustype = bustype;
    }

    public String getJzrq() {
        return jzrq;
    }

    public void setJzrq(String jzrq) {
        this.jzrq = jzrq;
    }

    public String getJglx() {
        return jglx;
    }

    public void setJglx(String jglx) {
        this.jglx = jglx;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public LocalDateTime getPaydate() {
        return paydate;
    }

    public void setPaydate(LocalDateTime paydate) {
        this.paydate = paydate;
    }

    public BigDecimal getTotalamt() {
        return totalamt;
    }

    public void setTotalamt(BigDecimal totalamt) {
        this.totalamt = totalamt;
    }

    public String getJzksbm() {
        return jzksbm;
    }

    public void setJzksbm(String jzksbm) {
        this.jzksbm = jzksbm;
    }

    public String getJzksmc() {
        return jzksmc;
    }

    public void setJzksmc(String jzksmc) {
        this.jzksmc = jzksmc;
    }

    public String getPayertype() {
        return payertype;
    }

    public void setPayertype(String payertype) {
        this.payertype = payertype;
    }

    public String getIdcardno() {
        return idcardno;
    }

    public void setIdcardno(String idcardno) {
        this.idcardno = idcardno;
    }

    public String getMedcaretypecode() {
        return medcaretypecode;
    }

    public void setMedcaretypecode(String medcaretypecode) {
        this.medcaretypecode = medcaretypecode;
    }

    public String getMedicalinsuranceid() {
        return medicalinsuranceid;
    }

    public void setMedicalinsuranceid(String medicalinsuranceid) {
        this.medicalinsuranceid = medicalinsuranceid;
    }

    public BigDecimal getFundpay() {
        return fundpay;
    }

    public void setFundpay(BigDecimal fundpay) {
        this.fundpay = fundpay;
    }

    public BigDecimal getAccountpay() {
        return accountpay;
    }

    public void setAccountpay(BigDecimal accountpay) {
        this.accountpay = accountpay;
    }

    public BigDecimal getOtherfundpay() {
        return otherfundpay;
    }

    public void setOtherfundpay(BigDecimal otherfundpay) {
        this.otherfundpay = otherfundpay;
    }

    public BigDecimal getFjjjzf() {
        return fjjjzf;
    }

    public void setFjjjzf(BigDecimal fjjjzf) {
        this.fjjjzf = fjjjzf;
    }

    public BigDecimal getSelfpayamt() {
        return selfpayamt;
    }

    public void setSelfpayamt(BigDecimal selfpayamt) {
        this.selfpayamt = selfpayamt;
    }

    public BigDecimal getSelfconceitedamt() {
        return selfconceitedamt;
    }

    public void setSelfconceitedamt(BigDecimal selfconceitedamt) {
        this.selfconceitedamt = selfconceitedamt;
    }

    public BigDecimal getFlzf() {
        return flzf;
    }

    public void setFlzf(BigDecimal flzf) {
        this.flzf = flzf;
    }

    public BigDecimal getOwnpay() {
        return ownpay;
    }

    public void setOwnpay(BigDecimal ownpay) {
        this.ownpay = ownpay;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return "TbBillHeader{" +
        "wsjgdm = " + wsjgdm +
        ", billbatchcode = " + billbatchcode +
        ", billno = " + billno +
        ", fjWsjgdm = " + fjWsjgdm +
        ", yljgdm = " + yljgdm +
        ", busno = " + busno +
        ", jzlsh = " + jzlsh +
        ", bustype = " + bustype +
        ", jzrq = " + jzrq +
        ", jglx = " + jglx +
        ", payer = " + payer +
        ", paydate = " + paydate +
        ", totalamt = " + totalamt +
        ", jzksbm = " + jzksbm +
        ", jzksmc = " + jzksmc +
        ", payertype = " + payertype +
        ", idcardno = " + idcardno +
        ", medcaretypecode = " + medcaretypecode +
        ", medicalinsuranceid = " + medicalinsuranceid +
        ", fundpay = " + fundpay +
        ", accountpay = " + accountpay +
        ", otherfundpay = " + otherfundpay +
        ", fjjjzf = " + fjjjzf +
        ", selfpayamt = " + selfpayamt +
        ", selfconceitedamt = " + selfconceitedamt +
        ", flzf = " + flzf +
        ", ownpay = " + ownpay +
        ", cxbz = " + cxbz +
        ", ylyl1 = " + ylyl1 +
        ", ylyl2 = " + ylyl2 +
        ", ylyl3 = " + ylyl3 +
        ", remark = " + remark +
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
