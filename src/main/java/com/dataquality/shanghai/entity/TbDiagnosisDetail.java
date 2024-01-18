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
@TableName("TB_DIAGNOSIS_DETAIL")
public class TbDiagnosisDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private String zyzdlsh;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private String zjhm;

    private String zjlx;

    private String jzlsh;

    private String mzzybz;

    private String kh;

    private String klx;

    private String zdlxqf;

    private String zdlb;

    private LocalDateTime zdsj;

    private String zdbm;

    private String bmlx;

    private String zdsm;

    private String cyzdbz;

    private String yzdbz;

    private String rybq;

    private String cyqkbm;

    private String mj;

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

    public String getZyzdlsh() {
        return zyzdlsh;
    }

    public void setZyzdlsh(String zyzdlsh) {
        this.zyzdlsh = zyzdlsh;
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

    public String getJzlsh() {
        return jzlsh;
    }

    public void setJzlsh(String jzlsh) {
        this.jzlsh = jzlsh;
    }

    public String getMzzybz() {
        return mzzybz;
    }

    public void setMzzybz(String mzzybz) {
        this.mzzybz = mzzybz;
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

    public String getZdlxqf() {
        return zdlxqf;
    }

    public void setZdlxqf(String zdlxqf) {
        this.zdlxqf = zdlxqf;
    }

    public String getZdlb() {
        return zdlb;
    }

    public void setZdlb(String zdlb) {
        this.zdlb = zdlb;
    }

    public LocalDateTime getZdsj() {
        return zdsj;
    }

    public void setZdsj(LocalDateTime zdsj) {
        this.zdsj = zdsj;
    }

    public String getZdbm() {
        return zdbm;
    }

    public void setZdbm(String zdbm) {
        this.zdbm = zdbm;
    }

    public String getBmlx() {
        return bmlx;
    }

    public void setBmlx(String bmlx) {
        this.bmlx = bmlx;
    }

    public String getZdsm() {
        return zdsm;
    }

    public void setZdsm(String zdsm) {
        this.zdsm = zdsm;
    }

    public String getCyzdbz() {
        return cyzdbz;
    }

    public void setCyzdbz(String cyzdbz) {
        this.cyzdbz = cyzdbz;
    }

    public String getYzdbz() {
        return yzdbz;
    }

    public void setYzdbz(String yzdbz) {
        this.yzdbz = yzdbz;
    }

    public String getRybq() {
        return rybq;
    }

    public void setRybq(String rybq) {
        this.rybq = rybq;
    }

    public String getCyqkbm() {
        return cyqkbm;
    }

    public void setCyqkbm(String cyqkbm) {
        this.cyqkbm = cyqkbm;
    }

    public String getMj() {
        return mj;
    }

    public void setMj(String mj) {
        this.mj = mj;
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
        return "TbDiagnosisDetail{" +
        "zyzdlsh = " + zyzdlsh +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", zjhm = " + zjhm +
        ", zjlx = " + zjlx +
        ", jzlsh = " + jzlsh +
        ", mzzybz = " + mzzybz +
        ", kh = " + kh +
        ", klx = " + klx +
        ", zdlxqf = " + zdlxqf +
        ", zdlb = " + zdlb +
        ", zdsj = " + zdsj +
        ", zdbm = " + zdbm +
        ", bmlx = " + bmlx +
        ", zdsm = " + zdsm +
        ", cyzdbz = " + cyzdbz +
        ", yzdbz = " + yzdbz +
        ", rybq = " + rybq +
        ", cyqkbm = " + cyqkbm +
        ", mj = " + mj +
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
