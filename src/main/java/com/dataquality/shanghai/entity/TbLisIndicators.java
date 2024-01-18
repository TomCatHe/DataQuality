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
@TableName("TB_LIS_INDICATORS")
public class TbLisIndicators implements Serializable {

    private static final long serialVersionUID = 1L;

    private String jyzblsh;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private String zjhm;

    private String zjlx;

    private String bgdh;

    private String bgrq;

    private String ybsfdm;

    private String ybsfdmyb;

    private String jczbdm;

    private String jcff;

    private String jczbmc;

    private String jczbjg;

    private String loinc;

    private String sbbm;

    private String yqbh;

    private String yqmc;

    private String ckz;

    private String jldw;

    private String ycts;

    private String sfwjz;

    private String wjzcz;

    private String yzid;

    private Short dyxh;

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

    public String getJyzblsh() {
        return jyzblsh;
    }

    public void setJyzblsh(String jyzblsh) {
        this.jyzblsh = jyzblsh;
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

    public String getBgdh() {
        return bgdh;
    }

    public void setBgdh(String bgdh) {
        this.bgdh = bgdh;
    }

    public String getBgrq() {
        return bgrq;
    }

    public void setBgrq(String bgrq) {
        this.bgrq = bgrq;
    }

    public String getYbsfdm() {
        return ybsfdm;
    }

    public void setYbsfdm(String ybsfdm) {
        this.ybsfdm = ybsfdm;
    }

    public String getYbsfdmyb() {
        return ybsfdmyb;
    }

    public void setYbsfdmyb(String ybsfdmyb) {
        this.ybsfdmyb = ybsfdmyb;
    }

    public String getJczbdm() {
        return jczbdm;
    }

    public void setJczbdm(String jczbdm) {
        this.jczbdm = jczbdm;
    }

    public String getJcff() {
        return jcff;
    }

    public void setJcff(String jcff) {
        this.jcff = jcff;
    }

    public String getJczbmc() {
        return jczbmc;
    }

    public void setJczbmc(String jczbmc) {
        this.jczbmc = jczbmc;
    }

    public String getJczbjg() {
        return jczbjg;
    }

    public void setJczbjg(String jczbjg) {
        this.jczbjg = jczbjg;
    }

    public String getLoinc() {
        return loinc;
    }

    public void setLoinc(String loinc) {
        this.loinc = loinc;
    }

    public String getSbbm() {
        return sbbm;
    }

    public void setSbbm(String sbbm) {
        this.sbbm = sbbm;
    }

    public String getYqbh() {
        return yqbh;
    }

    public void setYqbh(String yqbh) {
        this.yqbh = yqbh;
    }

    public String getYqmc() {
        return yqmc;
    }

    public void setYqmc(String yqmc) {
        this.yqmc = yqmc;
    }

    public String getCkz() {
        return ckz;
    }

    public void setCkz(String ckz) {
        this.ckz = ckz;
    }

    public String getJldw() {
        return jldw;
    }

    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    public String getYcts() {
        return ycts;
    }

    public void setYcts(String ycts) {
        this.ycts = ycts;
    }

    public String getSfwjz() {
        return sfwjz;
    }

    public void setSfwjz(String sfwjz) {
        this.sfwjz = sfwjz;
    }

    public String getWjzcz() {
        return wjzcz;
    }

    public void setWjzcz(String wjzcz) {
        this.wjzcz = wjzcz;
    }

    public String getYzid() {
        return yzid;
    }

    public void setYzid(String yzid) {
        this.yzid = yzid;
    }

    public Short getDyxh() {
        return dyxh;
    }

    public void setDyxh(Short dyxh) {
        this.dyxh = dyxh;
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
        return "TbLisIndicators{" +
        "jyzblsh = " + jyzblsh +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", zjhm = " + zjhm +
        ", zjlx = " + zjlx +
        ", bgdh = " + bgdh +
        ", bgrq = " + bgrq +
        ", ybsfdm = " + ybsfdm +
        ", ybsfdmyb = " + ybsfdmyb +
        ", jczbdm = " + jczbdm +
        ", jcff = " + jcff +
        ", jczbmc = " + jczbmc +
        ", jczbjg = " + jczbjg +
        ", loinc = " + loinc +
        ", sbbm = " + sbbm +
        ", yqbh = " + yqbh +
        ", yqmc = " + yqmc +
        ", ckz = " + ckz +
        ", jldw = " + jldw +
        ", ycts = " + ycts +
        ", sfwjz = " + sfwjz +
        ", wjzcz = " + wjzcz +
        ", yzid = " + yzid +
        ", dyxh = " + dyxh +
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
