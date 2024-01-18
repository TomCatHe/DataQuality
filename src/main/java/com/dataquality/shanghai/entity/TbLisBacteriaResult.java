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
@TableName("TB_LIS_BACTERIA_RESULT")
public class TbLisBacteriaResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private String xjjglsh;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private String zjhm;

    private String zjlx;

    private String ybsfdm;

    private String ybsfdmyb;

    private String bgdh;

    private String bgrq;

    private String xjdh;

    private String xjmc;

    private String jljs;

    private String byj;

    private String bysj;

    private String pytj;

    private String fxfs;

    private String jcjg;

    private String jcjgwz;

    private String sbbm;

    private String yqbh;

    private String yqmc;

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

    public String getXjjglsh() {
        return xjjglsh;
    }

    public void setXjjglsh(String xjjglsh) {
        this.xjjglsh = xjjglsh;
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

    public String getXjdh() {
        return xjdh;
    }

    public void setXjdh(String xjdh) {
        this.xjdh = xjdh;
    }

    public String getXjmc() {
        return xjmc;
    }

    public void setXjmc(String xjmc) {
        this.xjmc = xjmc;
    }

    public String getJljs() {
        return jljs;
    }

    public void setJljs(String jljs) {
        this.jljs = jljs;
    }

    public String getByj() {
        return byj;
    }

    public void setByj(String byj) {
        this.byj = byj;
    }

    public String getBysj() {
        return bysj;
    }

    public void setBysj(String bysj) {
        this.bysj = bysj;
    }

    public String getPytj() {
        return pytj;
    }

    public void setPytj(String pytj) {
        this.pytj = pytj;
    }

    public String getFxfs() {
        return fxfs;
    }

    public void setFxfs(String fxfs) {
        this.fxfs = fxfs;
    }

    public String getJcjg() {
        return jcjg;
    }

    public void setJcjg(String jcjg) {
        this.jcjg = jcjg;
    }

    public String getJcjgwz() {
        return jcjgwz;
    }

    public void setJcjgwz(String jcjgwz) {
        this.jcjgwz = jcjgwz;
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
        return "TbLisBacteriaResult{" +
        "xjjglsh = " + xjjglsh +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", zjhm = " + zjhm +
        ", zjlx = " + zjlx +
        ", ybsfdm = " + ybsfdm +
        ", ybsfdmyb = " + ybsfdmyb +
        ", bgdh = " + bgdh +
        ", bgrq = " + bgrq +
        ", xjdh = " + xjdh +
        ", xjmc = " + xjmc +
        ", jljs = " + jljs +
        ", byj = " + byj +
        ", bysj = " + bysj +
        ", pytj = " + pytj +
        ", fxfs = " + fxfs +
        ", jcjg = " + jcjg +
        ", jcjgwz = " + jcjgwz +
        ", sbbm = " + sbbm +
        ", yqbh = " + yqbh +
        ", yqmc = " + yqmc +
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
