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
@TableName("TB_TJ_FZBG")
public class TbTjFzbg implements Serializable {

    private static final long serialVersionUID = 1L;

    private String bglsh;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private String tjbh;

    private String ksbm;

    private String ksmc;

    private String zhmc;

    private String tjxj;

    private LocalDateTime bgrq;

    private String bgysgh;

    private String bgysxm;

    private String bgrsfz;

    private Short xgbz;

    private Short warFlag;

    private String warNote;

    private LocalDateTime jlgxsj;

    private Integer llbz;

    private Short chkFlag;

    private Short sedBz;

    private String jlscrq;

    public String getBglsh() {
        return bglsh;
    }

    public void setBglsh(String bglsh) {
        this.bglsh = bglsh;
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

    public String getTjbh() {
        return tjbh;
    }

    public void setTjbh(String tjbh) {
        this.tjbh = tjbh;
    }

    public String getKsbm() {
        return ksbm;
    }

    public void setKsbm(String ksbm) {
        this.ksbm = ksbm;
    }

    public String getKsmc() {
        return ksmc;
    }

    public void setKsmc(String ksmc) {
        this.ksmc = ksmc;
    }

    public String getZhmc() {
        return zhmc;
    }

    public void setZhmc(String zhmc) {
        this.zhmc = zhmc;
    }

    public String getTjxj() {
        return tjxj;
    }

    public void setTjxj(String tjxj) {
        this.tjxj = tjxj;
    }

    public LocalDateTime getBgrq() {
        return bgrq;
    }

    public void setBgrq(LocalDateTime bgrq) {
        this.bgrq = bgrq;
    }

    public String getBgysgh() {
        return bgysgh;
    }

    public void setBgysgh(String bgysgh) {
        this.bgysgh = bgysgh;
    }

    public String getBgysxm() {
        return bgysxm;
    }

    public void setBgysxm(String bgysxm) {
        this.bgysxm = bgysxm;
    }

    public String getBgrsfz() {
        return bgrsfz;
    }

    public void setBgrsfz(String bgrsfz) {
        this.bgrsfz = bgrsfz;
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
        return "TbTjFzbg{" +
        "bglsh = " + bglsh +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", tjbh = " + tjbh +
        ", ksbm = " + ksbm +
        ", ksmc = " + ksmc +
        ", zhmc = " + zhmc +
        ", tjxj = " + tjxj +
        ", bgrq = " + bgrq +
        ", bgysgh = " + bgysgh +
        ", bgysxm = " + bgysxm +
        ", bgrsfz = " + bgrsfz +
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
