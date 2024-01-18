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
@TableName("TB_RIS_REPORT")
public class TbRisReport implements Serializable {

    private static final long serialVersionUID = 1L;

    private String studyuid;

    private String instanceuid;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private String zjhm;

    private String zjlx;

    private String jzlsh;

    private String mzzybz;

    private String kh;

    private String klx;

    private String brxm;

    private String brxb;

    private String patientid;

    private String jcxmdm;

    private String jcxmdmyb;

    private String sqdh;

    private LocalDateTime kdsj;

    private LocalDateTime jysj;

    private String examtype;

    private String sbbm;

    private String yqbm;

    private String sqks;

    private String sqksmc;

    private String sqrgh;

    private String sqrxm;

    private String sqrsfz;

    private String jcks;

    private String jcksmc;

    private String jcysgh;

    private String jcys;

    private String jcyssfz;

    private String bgrq;

    private LocalDateTime bgsj;

    private String bgrgh;

    private String bgrxm;

    private String bgrsfz;

    private String shrgh;

    private String shrxm;

    private String shrsfz;

    private String jcbw;

    private String jcff;

    private String bwacr;

    private String jcmc;

    private String zyjcxx1;

    private String zyjcxx2;

    private String yys;

    private String bglczd;

    private String yxbx;

    private String yxzd;

    private String bzhjy;

    private String sfyyy;

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

    public String getStudyuid() {
        return studyuid;
    }

    public void setStudyuid(String studyuid) {
        this.studyuid = studyuid;
    }

    public String getInstanceuid() {
        return instanceuid;
    }

    public void setInstanceuid(String instanceuid) {
        this.instanceuid = instanceuid;
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

    public String getBrxm() {
        return brxm;
    }

    public void setBrxm(String brxm) {
        this.brxm = brxm;
    }

    public String getBrxb() {
        return brxb;
    }

    public void setBrxb(String brxb) {
        this.brxb = brxb;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getJcxmdm() {
        return jcxmdm;
    }

    public void setJcxmdm(String jcxmdm) {
        this.jcxmdm = jcxmdm;
    }

    public String getJcxmdmyb() {
        return jcxmdmyb;
    }

    public void setJcxmdmyb(String jcxmdmyb) {
        this.jcxmdmyb = jcxmdmyb;
    }

    public String getSqdh() {
        return sqdh;
    }

    public void setSqdh(String sqdh) {
        this.sqdh = sqdh;
    }

    public LocalDateTime getKdsj() {
        return kdsj;
    }

    public void setKdsj(LocalDateTime kdsj) {
        this.kdsj = kdsj;
    }

    public LocalDateTime getJysj() {
        return jysj;
    }

    public void setJysj(LocalDateTime jysj) {
        this.jysj = jysj;
    }

    public String getExamtype() {
        return examtype;
    }

    public void setExamtype(String examtype) {
        this.examtype = examtype;
    }

    public String getSbbm() {
        return sbbm;
    }

    public void setSbbm(String sbbm) {
        this.sbbm = sbbm;
    }

    public String getYqbm() {
        return yqbm;
    }

    public void setYqbm(String yqbm) {
        this.yqbm = yqbm;
    }

    public String getSqks() {
        return sqks;
    }

    public void setSqks(String sqks) {
        this.sqks = sqks;
    }

    public String getSqksmc() {
        return sqksmc;
    }

    public void setSqksmc(String sqksmc) {
        this.sqksmc = sqksmc;
    }

    public String getSqrgh() {
        return sqrgh;
    }

    public void setSqrgh(String sqrgh) {
        this.sqrgh = sqrgh;
    }

    public String getSqrxm() {
        return sqrxm;
    }

    public void setSqrxm(String sqrxm) {
        this.sqrxm = sqrxm;
    }

    public String getSqrsfz() {
        return sqrsfz;
    }

    public void setSqrsfz(String sqrsfz) {
        this.sqrsfz = sqrsfz;
    }

    public String getJcks() {
        return jcks;
    }

    public void setJcks(String jcks) {
        this.jcks = jcks;
    }

    public String getJcksmc() {
        return jcksmc;
    }

    public void setJcksmc(String jcksmc) {
        this.jcksmc = jcksmc;
    }

    public String getJcysgh() {
        return jcysgh;
    }

    public void setJcysgh(String jcysgh) {
        this.jcysgh = jcysgh;
    }

    public String getJcys() {
        return jcys;
    }

    public void setJcys(String jcys) {
        this.jcys = jcys;
    }

    public String getJcyssfz() {
        return jcyssfz;
    }

    public void setJcyssfz(String jcyssfz) {
        this.jcyssfz = jcyssfz;
    }

    public String getBgrq() {
        return bgrq;
    }

    public void setBgrq(String bgrq) {
        this.bgrq = bgrq;
    }

    public LocalDateTime getBgsj() {
        return bgsj;
    }

    public void setBgsj(LocalDateTime bgsj) {
        this.bgsj = bgsj;
    }

    public String getBgrgh() {
        return bgrgh;
    }

    public void setBgrgh(String bgrgh) {
        this.bgrgh = bgrgh;
    }

    public String getBgrxm() {
        return bgrxm;
    }

    public void setBgrxm(String bgrxm) {
        this.bgrxm = bgrxm;
    }

    public String getBgrsfz() {
        return bgrsfz;
    }

    public void setBgrsfz(String bgrsfz) {
        this.bgrsfz = bgrsfz;
    }

    public String getShrgh() {
        return shrgh;
    }

    public void setShrgh(String shrgh) {
        this.shrgh = shrgh;
    }

    public String getShrxm() {
        return shrxm;
    }

    public void setShrxm(String shrxm) {
        this.shrxm = shrxm;
    }

    public String getShrsfz() {
        return shrsfz;
    }

    public void setShrsfz(String shrsfz) {
        this.shrsfz = shrsfz;
    }

    public String getJcbw() {
        return jcbw;
    }

    public void setJcbw(String jcbw) {
        this.jcbw = jcbw;
    }

    public String getJcff() {
        return jcff;
    }

    public void setJcff(String jcff) {
        this.jcff = jcff;
    }

    public String getBwacr() {
        return bwacr;
    }

    public void setBwacr(String bwacr) {
        this.bwacr = bwacr;
    }

    public String getJcmc() {
        return jcmc;
    }

    public void setJcmc(String jcmc) {
        this.jcmc = jcmc;
    }

    public String getZyjcxx1() {
        return zyjcxx1;
    }

    public void setZyjcxx1(String zyjcxx1) {
        this.zyjcxx1 = zyjcxx1;
    }

    public String getZyjcxx2() {
        return zyjcxx2;
    }

    public void setZyjcxx2(String zyjcxx2) {
        this.zyjcxx2 = zyjcxx2;
    }

    public String getYys() {
        return yys;
    }

    public void setYys(String yys) {
        this.yys = yys;
    }

    public String getBglczd() {
        return bglczd;
    }

    public void setBglczd(String bglczd) {
        this.bglczd = bglczd;
    }

    public String getYxbx() {
        return yxbx;
    }

    public void setYxbx(String yxbx) {
        this.yxbx = yxbx;
    }

    public String getYxzd() {
        return yxzd;
    }

    public void setYxzd(String yxzd) {
        this.yxzd = yxzd;
    }

    public String getBzhjy() {
        return bzhjy;
    }

    public void setBzhjy(String bzhjy) {
        this.bzhjy = bzhjy;
    }

    public String getSfyyy() {
        return sfyyy;
    }

    public void setSfyyy(String sfyyy) {
        this.sfyyy = sfyyy;
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

    @Override
    public String toString() {
        return "TbRisReport{" +
        "studyuid = " + studyuid +
        ", instanceuid = " + instanceuid +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", zjhm = " + zjhm +
        ", zjlx = " + zjlx +
        ", jzlsh = " + jzlsh +
        ", mzzybz = " + mzzybz +
        ", kh = " + kh +
        ", klx = " + klx +
        ", brxm = " + brxm +
        ", brxb = " + brxb +
        ", patientid = " + patientid +
        ", jcxmdm = " + jcxmdm +
        ", jcxmdmyb = " + jcxmdmyb +
        ", sqdh = " + sqdh +
        ", kdsj = " + kdsj +
        ", jysj = " + jysj +
        ", examtype = " + examtype +
        ", sbbm = " + sbbm +
        ", yqbm = " + yqbm +
        ", sqks = " + sqks +
        ", sqksmc = " + sqksmc +
        ", sqrgh = " + sqrgh +
        ", sqrxm = " + sqrxm +
        ", sqrsfz = " + sqrsfz +
        ", jcks = " + jcks +
        ", jcksmc = " + jcksmc +
        ", jcysgh = " + jcysgh +
        ", jcys = " + jcys +
        ", jcyssfz = " + jcyssfz +
        ", bgrq = " + bgrq +
        ", bgsj = " + bgsj +
        ", bgrgh = " + bgrgh +
        ", bgrxm = " + bgrxm +
        ", bgrsfz = " + bgrsfz +
        ", shrgh = " + shrgh +
        ", shrxm = " + shrxm +
        ", shrsfz = " + shrsfz +
        ", jcbw = " + jcbw +
        ", jcff = " + jcff +
        ", bwacr = " + bwacr +
        ", jcmc = " + jcmc +
        ", zyjcxx1 = " + zyjcxx1 +
        ", zyjcxx2 = " + zyjcxx2 +
        ", yys = " + yys +
        ", bglczd = " + bglczd +
        ", yxbx = " + yxbx +
        ", yxzd = " + yxzd +
        ", bzhjy = " + bzhjy +
        ", sfyyy = " + sfyyy +
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
        "}";
    }
}
