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
@TableName("TB_YL_MZ_MEDICAL_RECORD")
public class TbYlMzMedicalRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    private String jzlsh;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private String zjhm;

    private String zjlx;

    private String cisid;

    private String kh;

    private String klx;

    private String hzxm;

    private String jzlx;

    private String bxlx;

    private String txbz;

    private String ybzhbz;

    private String wdbz;

    private String jzksbm;

    private String jzksmc;

    private LocalDateTime jzksrq;

    private String zzysgh;

    private String zzysxm;

    private String zzyssfz;

    private String zs;

    private String zzms;

    private Short xgbz;

    private String mj;

    private String ylyl1;

    private String ylyl2;

    private Short warFlag;

    private String warNote;

    private LocalDateTime jlgxsj;

    private Integer llbz;

    private Short chkFlag;

    private Short sedBz;

    private String jlscrq;

    private String jzzdbm;

    private String jzzdsm;

    public String getJzlsh() {
        return jzlsh;
    }

    public void setJzlsh(String jzlsh) {
        this.jzlsh = jzlsh;
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

    public String getCisid() {
        return cisid;
    }

    public void setCisid(String cisid) {
        this.cisid = cisid;
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

    public String getHzxm() {
        return hzxm;
    }

    public void setHzxm(String hzxm) {
        this.hzxm = hzxm;
    }

    public String getJzlx() {
        return jzlx;
    }

    public void setJzlx(String jzlx) {
        this.jzlx = jzlx;
    }

    public String getBxlx() {
        return bxlx;
    }

    public void setBxlx(String bxlx) {
        this.bxlx = bxlx;
    }

    public String getTxbz() {
        return txbz;
    }

    public void setTxbz(String txbz) {
        this.txbz = txbz;
    }

    public String getYbzhbz() {
        return ybzhbz;
    }

    public void setYbzhbz(String ybzhbz) {
        this.ybzhbz = ybzhbz;
    }

    public String getWdbz() {
        return wdbz;
    }

    public void setWdbz(String wdbz) {
        this.wdbz = wdbz;
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

    public LocalDateTime getJzksrq() {
        return jzksrq;
    }

    public void setJzksrq(LocalDateTime jzksrq) {
        this.jzksrq = jzksrq;
    }

    public String getZzysgh() {
        return zzysgh;
    }

    public void setZzysgh(String zzysgh) {
        this.zzysgh = zzysgh;
    }

    public String getZzysxm() {
        return zzysxm;
    }

    public void setZzysxm(String zzysxm) {
        this.zzysxm = zzysxm;
    }

    public String getZzyssfz() {
        return zzyssfz;
    }

    public void setZzyssfz(String zzyssfz) {
        this.zzyssfz = zzyssfz;
    }

    public String getZs() {
        return zs;
    }

    public void setZs(String zs) {
        this.zs = zs;
    }

    public String getZzms() {
        return zzms;
    }

    public void setZzms(String zzms) {
        this.zzms = zzms;
    }

    public Short getXgbz() {
        return xgbz;
    }

    public void setXgbz(Short xgbz) {
        this.xgbz = xgbz;
    }

    public String getMj() {
        return mj;
    }

    public void setMj(String mj) {
        this.mj = mj;
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

    public String getJzzdbm() {
        return jzzdbm;
    }

    public void setJzzdbm(String jzzdbm) {
        this.jzzdbm = jzzdbm;
    }

    public String getJzzdsm() {
        return jzzdsm;
    }

    public void setJzzdsm(String jzzdsm) {
        this.jzzdsm = jzzdsm;
    }

    @Override
    public String toString() {
        return "TbYlMzMedicalRecord{" +
        "jzlsh = " + jzlsh +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", zjhm = " + zjhm +
        ", zjlx = " + zjlx +
        ", cisid = " + cisid +
        ", kh = " + kh +
        ", klx = " + klx +
        ", hzxm = " + hzxm +
        ", jzlx = " + jzlx +
        ", bxlx = " + bxlx +
        ", txbz = " + txbz +
        ", ybzhbz = " + ybzhbz +
        ", wdbz = " + wdbz +
        ", jzksbm = " + jzksbm +
        ", jzksmc = " + jzksmc +
        ", jzksrq = " + jzksrq +
        ", zzysgh = " + zzysgh +
        ", zzysxm = " + zzysxm +
        ", zzyssfz = " + zzyssfz +
        ", zs = " + zs +
        ", zzms = " + zzms +
        ", xgbz = " + xgbz +
        ", mj = " + mj +
        ", ylyl1 = " + ylyl1 +
        ", ylyl2 = " + ylyl2 +
        ", warFlag = " + warFlag +
        ", warNote = " + warNote +
        ", jlgxsj = " + jlgxsj +
        ", llbz = " + llbz +
        ", chkFlag = " + chkFlag +
        ", sedBz = " + sedBz +
        ", jlscrq = " + jlscrq +
        ", jzzdbm = " + jzzdbm +
        ", jzzdsm = " + jzzdsm +
        "}";
    }
}
