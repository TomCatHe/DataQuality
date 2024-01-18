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
@TableName("TB_TJ_MXBG")
public class TbTjMxbg implements Serializable {

    private static final long serialVersionUID = 1L;

    private String xmmxid;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private String bglsh;

    private String xmdm;

    private String xmmc;

    private String xmjcjg;

    private String jcycbz;

    private LocalDateTime sjscsj;

    private Short xgbz;

    private Short warFlag;

    private String warNote;

    private LocalDateTime jlgxsj;

    private Integer llbz;

    private Short chkFlag;

    private Short sedBz;

    private String jlscrq;

    public String getXmmxid() {
        return xmmxid;
    }

    public void setXmmxid(String xmmxid) {
        this.xmmxid = xmmxid;
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

    public String getBglsh() {
        return bglsh;
    }

    public void setBglsh(String bglsh) {
        this.bglsh = bglsh;
    }

    public String getXmdm() {
        return xmdm;
    }

    public void setXmdm(String xmdm) {
        this.xmdm = xmdm;
    }

    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public String getXmjcjg() {
        return xmjcjg;
    }

    public void setXmjcjg(String xmjcjg) {
        this.xmjcjg = xmjcjg;
    }

    public String getJcycbz() {
        return jcycbz;
    }

    public void setJcycbz(String jcycbz) {
        this.jcycbz = jcycbz;
    }

    public LocalDateTime getSjscsj() {
        return sjscsj;
    }

    public void setSjscsj(LocalDateTime sjscsj) {
        this.sjscsj = sjscsj;
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
        return "TbTjMxbg{" +
        "xmmxid = " + xmmxid +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", bglsh = " + bglsh +
        ", xmdm = " + xmdm +
        ", xmmc = " + xmmc +
        ", xmjcjg = " + xmjcjg +
        ", jcycbz = " + jcycbz +
        ", sjscsj = " + sjscsj +
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
