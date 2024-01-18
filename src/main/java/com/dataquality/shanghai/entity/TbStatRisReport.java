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
@TableName("TB_STAT_RIS_REPORT")
public class TbStatRisReport implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ywrq;

    private String examtype;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private Integer bgdzfs;

    private Integer mzbgdfs;

    private Integer zybgdfs;

    private Integer qtywbgdfs;

    private Integer jcrc;

    private Integer mzjcrc;

    private Integer zyjcrc;

    private Integer qtywjcrc;

    private String ylyl1;

    private String ylyl2;

    private Short xgbz;

    private Short warFlag;

    private String warNote;

    private LocalDateTime jlgxsj;

    private Integer llbz;

    private Short chkFlag;

    private Short sedBz;

    private String jlscrq;

    public String getYwrq() {
        return ywrq;
    }

    public void setYwrq(String ywrq) {
        this.ywrq = ywrq;
    }

    public String getExamtype() {
        return examtype;
    }

    public void setExamtype(String examtype) {
        this.examtype = examtype;
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

    public Integer getBgdzfs() {
        return bgdzfs;
    }

    public void setBgdzfs(Integer bgdzfs) {
        this.bgdzfs = bgdzfs;
    }

    public Integer getMzbgdfs() {
        return mzbgdfs;
    }

    public void setMzbgdfs(Integer mzbgdfs) {
        this.mzbgdfs = mzbgdfs;
    }

    public Integer getZybgdfs() {
        return zybgdfs;
    }

    public void setZybgdfs(Integer zybgdfs) {
        this.zybgdfs = zybgdfs;
    }

    public Integer getQtywbgdfs() {
        return qtywbgdfs;
    }

    public void setQtywbgdfs(Integer qtywbgdfs) {
        this.qtywbgdfs = qtywbgdfs;
    }

    public Integer getJcrc() {
        return jcrc;
    }

    public void setJcrc(Integer jcrc) {
        this.jcrc = jcrc;
    }

    public Integer getMzjcrc() {
        return mzjcrc;
    }

    public void setMzjcrc(Integer mzjcrc) {
        this.mzjcrc = mzjcrc;
    }

    public Integer getZyjcrc() {
        return zyjcrc;
    }

    public void setZyjcrc(Integer zyjcrc) {
        this.zyjcrc = zyjcrc;
    }

    public Integer getQtywjcrc() {
        return qtywjcrc;
    }

    public void setQtywjcrc(Integer qtywjcrc) {
        this.qtywjcrc = qtywjcrc;
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
        return "TbStatRisReport{" +
        "ywrq = " + ywrq +
        ", examtype = " + examtype +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", bgdzfs = " + bgdzfs +
        ", mzbgdfs = " + mzbgdfs +
        ", zybgdfs = " + zybgdfs +
        ", qtywbgdfs = " + qtywbgdfs +
        ", jcrc = " + jcrc +
        ", mzjcrc = " + mzjcrc +
        ", zyjcrc = " + zyjcrc +
        ", qtywjcrc = " + qtywjcrc +
        ", ylyl1 = " + ylyl1 +
        ", ylyl2 = " + ylyl2 +
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
