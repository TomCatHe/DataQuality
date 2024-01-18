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
@TableName("TB_LIS_ALLERGY_RESULT")
public class TbLisAllergyResult implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ymjglsh;

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

    private Short dyxh;

    private String ymdm;

    private String ymmc;

    private String jcjg;

    private String zphyl;

    private String yjnd;

    private String yjhzj;

    private String ckzfy;

    private String jldw;

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

    public String getYmjglsh() {
        return ymjglsh;
    }

    public void setYmjglsh(String ymjglsh) {
        this.ymjglsh = ymjglsh;
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

    public Short getDyxh() {
        return dyxh;
    }

    public void setDyxh(Short dyxh) {
        this.dyxh = dyxh;
    }

    public String getYmdm() {
        return ymdm;
    }

    public void setYmdm(String ymdm) {
        this.ymdm = ymdm;
    }

    public String getYmmc() {
        return ymmc;
    }

    public void setYmmc(String ymmc) {
        this.ymmc = ymmc;
    }

    public String getJcjg() {
        return jcjg;
    }

    public void setJcjg(String jcjg) {
        this.jcjg = jcjg;
    }

    public String getZphyl() {
        return zphyl;
    }

    public void setZphyl(String zphyl) {
        this.zphyl = zphyl;
    }

    public String getYjnd() {
        return yjnd;
    }

    public void setYjnd(String yjnd) {
        this.yjnd = yjnd;
    }

    public String getYjhzj() {
        return yjhzj;
    }

    public void setYjhzj(String yjhzj) {
        this.yjhzj = yjhzj;
    }

    public String getCkzfy() {
        return ckzfy;
    }

    public void setCkzfy(String ckzfy) {
        this.ckzfy = ckzfy;
    }

    public String getJldw() {
        return jldw;
    }

    public void setJldw(String jldw) {
        this.jldw = jldw;
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
        return "TbLisAllergyResult{" +
        "ymjglsh = " + ymjglsh +
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
        ", dyxh = " + dyxh +
        ", ymdm = " + ymdm +
        ", ymmc = " + ymmc +
        ", jcjg = " + jcjg +
        ", zphyl = " + zphyl +
        ", yjnd = " + yjnd +
        ", yjhzj = " + yjhzj +
        ", ckzfy = " + ckzfy +
        ", jldw = " + jldw +
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
