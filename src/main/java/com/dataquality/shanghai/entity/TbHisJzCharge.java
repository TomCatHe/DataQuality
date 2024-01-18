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
@TableName("TB_HIS_JZ_CHARGE")
public class TbHisJzCharge implements Serializable {

    private static final long serialVersionUID = 1L;

    private String stfrq;

    private String stfbh;

    private String stfbz;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private String zjhm;

    private String zjlx;

    private String zyid;

    private String bxlx;

    private String ybzhbz;

    private String ssjybz;

    private LocalDateTime stfsj;

    private BigDecimal zfy;

    private BigDecimal ybfwwzf;

    private BigDecimal txfye;

    private BigDecimal txyf;

    private BigDecimal zyf;

    private BigDecimal zyftx;

    private BigDecimal zlf;

    private BigDecimal zlftx;

    private BigDecimal zhf;

    private BigDecimal zhftx;

    private BigDecimal hlf;

    private BigDecimal hlftx;

    private BigDecimal ssclf;

    private BigDecimal ssclftx;

    private BigDecimal jcf;

    private BigDecimal jcftx;

    private BigDecimal hyf;

    private BigDecimal hyftx;

    private BigDecimal tsf;

    private BigDecimal tsftx;

    private BigDecimal spf;

    private BigDecimal spftx;

    private BigDecimal sxf;

    private BigDecimal sxftx;

    private BigDecimal syf;

    private BigDecimal syftx;

    private BigDecimal xyf;

    private BigDecimal xyftx;

    private BigDecimal zcyf;

    private BigDecimal zcyftx;

    private BigDecimal zcaf;

    private BigDecimal zcaftx;

    private BigDecimal qtf;

    private BigDecimal qtftx;

    private String fph;

    private String kh;

    private String klx;

    private String cybz;

    private Short xgbz;

    private String ylyl1;

    private String ylyl2;

    private Short warFlag;

    private String warNote;

    private LocalDateTime jlgxsj;

    private Integer llbz;

    private Short chkFlag;

    private Short sedBz;

    private String jlscrq;

    public String getStfrq() {
        return stfrq;
    }

    public void setStfrq(String stfrq) {
        this.stfrq = stfrq;
    }

    public String getStfbh() {
        return stfbh;
    }

    public void setStfbh(String stfbh) {
        this.stfbh = stfbh;
    }

    public String getStfbz() {
        return stfbz;
    }

    public void setStfbz(String stfbz) {
        this.stfbz = stfbz;
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

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public String getZjlx() {
        return zjlx;
    }

    public void setZjlx(String zjlx) {
        this.zjlx = zjlx;
    }

    public String getZyid() {
        return zyid;
    }

    public void setZyid(String zyid) {
        this.zyid = zyid;
    }

    public String getBxlx() {
        return bxlx;
    }

    public void setBxlx(String bxlx) {
        this.bxlx = bxlx;
    }

    public String getYbzhbz() {
        return ybzhbz;
    }

    public void setYbzhbz(String ybzhbz) {
        this.ybzhbz = ybzhbz;
    }

    public String getSsjybz() {
        return ssjybz;
    }

    public void setSsjybz(String ssjybz) {
        this.ssjybz = ssjybz;
    }

    public LocalDateTime getStfsj() {
        return stfsj;
    }

    public void setStfsj(LocalDateTime stfsj) {
        this.stfsj = stfsj;
    }

    public BigDecimal getZfy() {
        return zfy;
    }

    public void setZfy(BigDecimal zfy) {
        this.zfy = zfy;
    }

    public BigDecimal getYbfwwzf() {
        return ybfwwzf;
    }

    public void setYbfwwzf(BigDecimal ybfwwzf) {
        this.ybfwwzf = ybfwwzf;
    }

    public BigDecimal getTxfye() {
        return txfye;
    }

    public void setTxfye(BigDecimal txfye) {
        this.txfye = txfye;
    }

    public BigDecimal getTxyf() {
        return txyf;
    }

    public void setTxyf(BigDecimal txyf) {
        this.txyf = txyf;
    }

    public BigDecimal getZyf() {
        return zyf;
    }

    public void setZyf(BigDecimal zyf) {
        this.zyf = zyf;
    }

    public BigDecimal getZyftx() {
        return zyftx;
    }

    public void setZyftx(BigDecimal zyftx) {
        this.zyftx = zyftx;
    }

    public BigDecimal getZlf() {
        return zlf;
    }

    public void setZlf(BigDecimal zlf) {
        this.zlf = zlf;
    }

    public BigDecimal getZlftx() {
        return zlftx;
    }

    public void setZlftx(BigDecimal zlftx) {
        this.zlftx = zlftx;
    }

    public BigDecimal getZhf() {
        return zhf;
    }

    public void setZhf(BigDecimal zhf) {
        this.zhf = zhf;
    }

    public BigDecimal getZhftx() {
        return zhftx;
    }

    public void setZhftx(BigDecimal zhftx) {
        this.zhftx = zhftx;
    }

    public BigDecimal getHlf() {
        return hlf;
    }

    public void setHlf(BigDecimal hlf) {
        this.hlf = hlf;
    }

    public BigDecimal getHlftx() {
        return hlftx;
    }

    public void setHlftx(BigDecimal hlftx) {
        this.hlftx = hlftx;
    }

    public BigDecimal getSsclf() {
        return ssclf;
    }

    public void setSsclf(BigDecimal ssclf) {
        this.ssclf = ssclf;
    }

    public BigDecimal getSsclftx() {
        return ssclftx;
    }

    public void setSsclftx(BigDecimal ssclftx) {
        this.ssclftx = ssclftx;
    }

    public BigDecimal getJcf() {
        return jcf;
    }

    public void setJcf(BigDecimal jcf) {
        this.jcf = jcf;
    }

    public BigDecimal getJcftx() {
        return jcftx;
    }

    public void setJcftx(BigDecimal jcftx) {
        this.jcftx = jcftx;
    }

    public BigDecimal getHyf() {
        return hyf;
    }

    public void setHyf(BigDecimal hyf) {
        this.hyf = hyf;
    }

    public BigDecimal getHyftx() {
        return hyftx;
    }

    public void setHyftx(BigDecimal hyftx) {
        this.hyftx = hyftx;
    }

    public BigDecimal getTsf() {
        return tsf;
    }

    public void setTsf(BigDecimal tsf) {
        this.tsf = tsf;
    }

    public BigDecimal getTsftx() {
        return tsftx;
    }

    public void setTsftx(BigDecimal tsftx) {
        this.tsftx = tsftx;
    }

    public BigDecimal getSpf() {
        return spf;
    }

    public void setSpf(BigDecimal spf) {
        this.spf = spf;
    }

    public BigDecimal getSpftx() {
        return spftx;
    }

    public void setSpftx(BigDecimal spftx) {
        this.spftx = spftx;
    }

    public BigDecimal getSxf() {
        return sxf;
    }

    public void setSxf(BigDecimal sxf) {
        this.sxf = sxf;
    }

    public BigDecimal getSxftx() {
        return sxftx;
    }

    public void setSxftx(BigDecimal sxftx) {
        this.sxftx = sxftx;
    }

    public BigDecimal getSyf() {
        return syf;
    }

    public void setSyf(BigDecimal syf) {
        this.syf = syf;
    }

    public BigDecimal getSyftx() {
        return syftx;
    }

    public void setSyftx(BigDecimal syftx) {
        this.syftx = syftx;
    }

    public BigDecimal getXyf() {
        return xyf;
    }

    public void setXyf(BigDecimal xyf) {
        this.xyf = xyf;
    }

    public BigDecimal getXyftx() {
        return xyftx;
    }

    public void setXyftx(BigDecimal xyftx) {
        this.xyftx = xyftx;
    }

    public BigDecimal getZcyf() {
        return zcyf;
    }

    public void setZcyf(BigDecimal zcyf) {
        this.zcyf = zcyf;
    }

    public BigDecimal getZcyftx() {
        return zcyftx;
    }

    public void setZcyftx(BigDecimal zcyftx) {
        this.zcyftx = zcyftx;
    }

    public BigDecimal getZcaf() {
        return zcaf;
    }

    public void setZcaf(BigDecimal zcaf) {
        this.zcaf = zcaf;
    }

    public BigDecimal getZcaftx() {
        return zcaftx;
    }

    public void setZcaftx(BigDecimal zcaftx) {
        this.zcaftx = zcaftx;
    }

    public BigDecimal getQtf() {
        return qtf;
    }

    public void setQtf(BigDecimal qtf) {
        this.qtf = qtf;
    }

    public BigDecimal getQtftx() {
        return qtftx;
    }

    public void setQtftx(BigDecimal qtftx) {
        this.qtftx = qtftx;
    }

    public String getFph() {
        return fph;
    }

    public void setFph(String fph) {
        this.fph = fph;
    }

    public String getKh() {
        return kh;
    }

    public void setKh(String kh) {
        this.kh = kh;
    }

    public String getKlx() {
        return klx;
    }

    public void setKlx(String klx) {
        this.klx = klx;
    }

    public String getCybz() {
        return cybz;
    }

    public void setCybz(String cybz) {
        this.cybz = cybz;
    }

    public Short getXgbz() {
        return xgbz;
    }

    public void setXgbz(Short xgbz) {
        this.xgbz = xgbz;
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
        return "TbHisJzCharge{" +
        "stfrq = " + stfrq +
        ", stfbh = " + stfbh +
        ", stfbz = " + stfbz +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", zjhm = " + zjhm +
        ", zjlx = " + zjlx +
        ", zyid = " + zyid +
        ", bxlx = " + bxlx +
        ", ybzhbz = " + ybzhbz +
        ", ssjybz = " + ssjybz +
        ", stfsj = " + stfsj +
        ", zfy = " + zfy +
        ", ybfwwzf = " + ybfwwzf +
        ", txfye = " + txfye +
        ", txyf = " + txyf +
        ", zyf = " + zyf +
        ", zyftx = " + zyftx +
        ", zlf = " + zlf +
        ", zlftx = " + zlftx +
        ", zhf = " + zhf +
        ", zhftx = " + zhftx +
        ", hlf = " + hlf +
        ", hlftx = " + hlftx +
        ", ssclf = " + ssclf +
        ", ssclftx = " + ssclftx +
        ", jcf = " + jcf +
        ", jcftx = " + jcftx +
        ", hyf = " + hyf +
        ", hyftx = " + hyftx +
        ", tsf = " + tsf +
        ", tsftx = " + tsftx +
        ", spf = " + spf +
        ", spftx = " + spftx +
        ", sxf = " + sxf +
        ", sxftx = " + sxftx +
        ", syf = " + syf +
        ", syftx = " + syftx +
        ", xyf = " + xyf +
        ", xyftx = " + xyftx +
        ", zcyf = " + zcyf +
        ", zcyftx = " + zcyftx +
        ", zcaf = " + zcaf +
        ", zcaftx = " + zcaftx +
        ", qtf = " + qtf +
        ", qtftx = " + qtftx +
        ", fph = " + fph +
        ", kh = " + kh +
        ", klx = " + klx +
        ", cybz = " + cybz +
        ", xgbz = " + xgbz +
        ", ylyl1 = " + ylyl1 +
        ", ylyl2 = " + ylyl2 +
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
