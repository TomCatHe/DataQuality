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
@TableName("TB_HIS_ZY_ADM_REG")
public class TbHisZyAdmReg implements Serializable {

    private static final long serialVersionUID = 1L;

    private String zyid;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private String cisid;

    private String zjhm;

    private String zjlx;

    private String ryks;

    private LocalDateTime rysj;

    private String lgbz;

    private String kh;

    private String klx;

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

    public String getZyid() {
        return zyid;
    }

    public void setZyid(String zyid) {
        this.zyid = zyid;
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

    public String getCisid() {
        return cisid;
    }

    public void setCisid(String cisid) {
        this.cisid = cisid;
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

    public String getRyks() {
        return ryks;
    }

    public void setRyks(String ryks) {
        this.ryks = ryks;
    }

    public LocalDateTime getRysj() {
        return rysj;
    }

    public void setRysj(LocalDateTime rysj) {
        this.rysj = rysj;
    }

    public String getLgbz() {
        return lgbz;
    }

    public void setLgbz(String lgbz) {
        this.lgbz = lgbz;
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
        return "TbHisZyAdmReg{" +
        "zyid = " + zyid +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", cisid = " + cisid +
        ", zjhm = " + zjhm +
        ", zjlx = " + zjlx +
        ", ryks = " + ryks +
        ", rysj = " + rysj +
        ", lgbz = " + lgbz +
        ", kh = " + kh +
        ", klx = " + klx +
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
