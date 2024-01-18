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
@TableName("TB_DIC_PRACTITIONER")
public class TbDicPractitioner implements Serializable {

    private static final long serialVersionUID = 1L;

    private String gh;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private String ryztbz;

    private String zcm;

    private String xm;

    private String sfzh;

    private String ssks;

    private String zwdm;

    private String zhiw;

    private String zcdm;

    private String zhic;

    private String csrq;

    private String lb;

    private String zylb;

    private String qkbz;

    private String whcd;

    private String zhuany;

    private String ysjj;

    private String ystc;

    private String sfkzyy;

    private Short xgbz;

    private Short warFlag;

    private String warNote;

    private LocalDateTime jlgxsj;

    private Integer llbz;

    private Short chkFlag;

    private Short sedBz;

    private String jlscrq;

    public String getGh() {
        return gh;
    }

    public void setGh(String gh) {
        this.gh = gh;
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

    public String getRyztbz() {
        return ryztbz;
    }

    public void setRyztbz(String ryztbz) {
        this.ryztbz = ryztbz;
    }

    public String getZcm() {
        return zcm;
    }

    public void setZcm(String zcm) {
        this.zcm = zcm;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh;
    }

    public String getSsks() {
        return ssks;
    }

    public void setSsks(String ssks) {
        this.ssks = ssks;
    }

    public String getZwdm() {
        return zwdm;
    }

    public void setZwdm(String zwdm) {
        this.zwdm = zwdm;
    }

    public String getZhiw() {
        return zhiw;
    }

    public void setZhiw(String zhiw) {
        this.zhiw = zhiw;
    }

    public String getZcdm() {
        return zcdm;
    }

    public void setZcdm(String zcdm) {
        this.zcdm = zcdm;
    }

    public String getZhic() {
        return zhic;
    }

    public void setZhic(String zhic) {
        this.zhic = zhic;
    }

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public String getLb() {
        return lb;
    }

    public void setLb(String lb) {
        this.lb = lb;
    }

    public String getZylb() {
        return zylb;
    }

    public void setZylb(String zylb) {
        this.zylb = zylb;
    }

    public String getQkbz() {
        return qkbz;
    }

    public void setQkbz(String qkbz) {
        this.qkbz = qkbz;
    }

    public String getWhcd() {
        return whcd;
    }

    public void setWhcd(String whcd) {
        this.whcd = whcd;
    }

    public String getZhuany() {
        return zhuany;
    }

    public void setZhuany(String zhuany) {
        this.zhuany = zhuany;
    }

    public String getYsjj() {
        return ysjj;
    }

    public void setYsjj(String ysjj) {
        this.ysjj = ysjj;
    }

    public String getYstc() {
        return ystc;
    }

    public void setYstc(String ystc) {
        this.ystc = ystc;
    }

    public String getSfkzyy() {
        return sfkzyy;
    }

    public void setSfkzyy(String sfkzyy) {
        this.sfkzyy = sfkzyy;
    }

    public Short getXgbz() {
        return xgbz;
    }

    public void setXgbz(Short xgbz) {
        this.xgbz = xgbz;
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
        return "TbDicPractitioner{" +
        "gh = " + gh +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", ryztbz = " + ryztbz +
        ", zcm = " + zcm +
        ", xm = " + xm +
        ", sfzh = " + sfzh +
        ", ssks = " + ssks +
        ", zwdm = " + zwdm +
        ", zhiw = " + zhiw +
        ", zcdm = " + zcdm +
        ", zhic = " + zhic +
        ", csrq = " + csrq +
        ", lb = " + lb +
        ", zylb = " + zylb +
        ", qkbz = " + qkbz +
        ", whcd = " + whcd +
        ", zhuany = " + zhuany +
        ", ysjj = " + ysjj +
        ", ystc = " + ystc +
        ", sfkzyy = " + sfkzyy +
        ", xgbz = " + xgbz +
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
