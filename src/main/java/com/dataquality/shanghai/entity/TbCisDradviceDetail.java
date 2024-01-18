package com.dataquality.shanghai.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author TomCatHe
 * @since 2024-01-18
 */
@TableName("TB_CIS_DRADVICE_DETAIL")
public class TbCisDradviceDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private String yzid;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private String zjhm;

    private String zjlx;

    private String jzlsh;

    private String cxbz;

    private String jzlx;

    private String kh;

    private String klx;

    private String bq;

    private String xdksbm;

    private String xdksmc;

    private String xdrgh;

    private String xdrxm;

    private String yzxdsfz;

    private LocalDateTime yzxdsj;

    private String zxksbm;

    private String zxksmc;

    private String zxrgh;

    private String zxrxm;

    private String yzzxsfz;

    private LocalDateTime yzzxsj;

    private LocalDateTime yzzzsj;

    private String yzsm;

    private String yzzh;

    private String yzlb;

    private String yzmxbm;

    private String yzmxbmyb;

    private String scph;

    private String yxqz;

    private String yzmxmc;

    private String yzlx;

    private String ypgg;

    private String ypyf;

    private String yypddm;

    private String yypd;

    private BigDecimal jl;

    private String dw;

    private String yf;

    private BigDecimal yyts;

    private String sfps;

    private BigDecimal ypsl;

    private String ypdw;

    private String jydm;

    private String jcbw;

    private String bz;

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

    public String getYzid() {
        return yzid;
    }

    public void setYzid(String yzid) {
        this.yzid = yzid;
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

    public String getCxbz() {
        return cxbz;
    }

    public void setCxbz(String cxbz) {
        this.cxbz = cxbz;
    }

    public String getJzlx() {
        return jzlx;
    }

    public void setJzlx(String jzlx) {
        this.jzlx = jzlx;
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

    public String getBq() {
        return bq;
    }

    public void setBq(String bq) {
        this.bq = bq;
    }

    public String getXdksbm() {
        return xdksbm;
    }

    public void setXdksbm(String xdksbm) {
        this.xdksbm = xdksbm;
    }

    public String getXdksmc() {
        return xdksmc;
    }

    public void setXdksmc(String xdksmc) {
        this.xdksmc = xdksmc;
    }

    public String getXdrgh() {
        return xdrgh;
    }

    public void setXdrgh(String xdrgh) {
        this.xdrgh = xdrgh;
    }

    public String getXdrxm() {
        return xdrxm;
    }

    public void setXdrxm(String xdrxm) {
        this.xdrxm = xdrxm;
    }

    public String getYzxdsfz() {
        return yzxdsfz;
    }

    public void setYzxdsfz(String yzxdsfz) {
        this.yzxdsfz = yzxdsfz;
    }

    public LocalDateTime getYzxdsj() {
        return yzxdsj;
    }

    public void setYzxdsj(LocalDateTime yzxdsj) {
        this.yzxdsj = yzxdsj;
    }

    public String getZxksbm() {
        return zxksbm;
    }

    public void setZxksbm(String zxksbm) {
        this.zxksbm = zxksbm;
    }

    public String getZxksmc() {
        return zxksmc;
    }

    public void setZxksmc(String zxksmc) {
        this.zxksmc = zxksmc;
    }

    public String getZxrgh() {
        return zxrgh;
    }

    public void setZxrgh(String zxrgh) {
        this.zxrgh = zxrgh;
    }

    public String getZxrxm() {
        return zxrxm;
    }

    public void setZxrxm(String zxrxm) {
        this.zxrxm = zxrxm;
    }

    public String getYzzxsfz() {
        return yzzxsfz;
    }

    public void setYzzxsfz(String yzzxsfz) {
        this.yzzxsfz = yzzxsfz;
    }

    public LocalDateTime getYzzxsj() {
        return yzzxsj;
    }

    public void setYzzxsj(LocalDateTime yzzxsj) {
        this.yzzxsj = yzzxsj;
    }

    public LocalDateTime getYzzzsj() {
        return yzzzsj;
    }

    public void setYzzzsj(LocalDateTime yzzzsj) {
        this.yzzzsj = yzzzsj;
    }

    public String getYzsm() {
        return yzsm;
    }

    public void setYzsm(String yzsm) {
        this.yzsm = yzsm;
    }

    public String getYzzh() {
        return yzzh;
    }

    public void setYzzh(String yzzh) {
        this.yzzh = yzzh;
    }

    public String getYzlb() {
        return yzlb;
    }

    public void setYzlb(String yzlb) {
        this.yzlb = yzlb;
    }

    public String getYzmxbm() {
        return yzmxbm;
    }

    public void setYzmxbm(String yzmxbm) {
        this.yzmxbm = yzmxbm;
    }

    public String getYzmxbmyb() {
        return yzmxbmyb;
    }

    public void setYzmxbmyb(String yzmxbmyb) {
        this.yzmxbmyb = yzmxbmyb;
    }

    public String getScph() {
        return scph;
    }

    public void setScph(String scph) {
        this.scph = scph;
    }

    public String getYxqz() {
        return yxqz;
    }

    public void setYxqz(String yxqz) {
        this.yxqz = yxqz;
    }

    public String getYzmxmc() {
        return yzmxmc;
    }

    public void setYzmxmc(String yzmxmc) {
        this.yzmxmc = yzmxmc;
    }

    public String getYzlx() {
        return yzlx;
    }

    public void setYzlx(String yzlx) {
        this.yzlx = yzlx;
    }

    public String getYpgg() {
        return ypgg;
    }

    public void setYpgg(String ypgg) {
        this.ypgg = ypgg;
    }

    public String getYpyf() {
        return ypyf;
    }

    public void setYpyf(String ypyf) {
        this.ypyf = ypyf;
    }

    public String getYypddm() {
        return yypddm;
    }

    public void setYypddm(String yypddm) {
        this.yypddm = yypddm;
    }

    public String getYypd() {
        return yypd;
    }

    public void setYypd(String yypd) {
        this.yypd = yypd;
    }

    public BigDecimal getJl() {
        return jl;
    }

    public void setJl(BigDecimal jl) {
        this.jl = jl;
    }

    public String getDw() {
        return dw;
    }

    public void setDw(String dw) {
        this.dw = dw;
    }

    public String getYf() {
        return yf;
    }

    public void setYf(String yf) {
        this.yf = yf;
    }

    public BigDecimal getYyts() {
        return yyts;
    }

    public void setYyts(BigDecimal yyts) {
        this.yyts = yyts;
    }

    public String getSfps() {
        return sfps;
    }

    public void setSfps(String sfps) {
        this.sfps = sfps;
    }

    public BigDecimal getYpsl() {
        return ypsl;
    }

    public void setYpsl(BigDecimal ypsl) {
        this.ypsl = ypsl;
    }

    public String getYpdw() {
        return ypdw;
    }

    public void setYpdw(String ypdw) {
        this.ypdw = ypdw;
    }

    public String getJydm() {
        return jydm;
    }

    public void setJydm(String jydm) {
        this.jydm = jydm;
    }

    public String getJcbw() {
        return jcbw;
    }

    public void setJcbw(String jcbw) {
        this.jcbw = jcbw;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
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
        return "TbCisDradviceDetail{" +
        "yzid = " + yzid +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", zjhm = " + zjhm +
        ", zjlx = " + zjlx +
        ", jzlsh = " + jzlsh +
        ", cxbz = " + cxbz +
        ", jzlx = " + jzlx +
        ", kh = " + kh +
        ", klx = " + klx +
        ", bq = " + bq +
        ", xdksbm = " + xdksbm +
        ", xdksmc = " + xdksmc +
        ", xdrgh = " + xdrgh +
        ", xdrxm = " + xdrxm +
        ", yzxdsfz = " + yzxdsfz +
        ", yzxdsj = " + yzxdsj +
        ", zxksbm = " + zxksbm +
        ", zxksmc = " + zxksmc +
        ", zxrgh = " + zxrgh +
        ", zxrxm = " + zxrxm +
        ", yzzxsfz = " + yzzxsfz +
        ", yzzxsj = " + yzzxsj +
        ", yzzzsj = " + yzzzsj +
        ", yzsm = " + yzsm +
        ", yzzh = " + yzzh +
        ", yzlb = " + yzlb +
        ", yzmxbm = " + yzmxbm +
        ", yzmxbmyb = " + yzmxbmyb +
        ", scph = " + scph +
        ", yxqz = " + yxqz +
        ", yzmxmc = " + yzmxmc +
        ", yzlx = " + yzlx +
        ", ypgg = " + ypgg +
        ", ypyf = " + ypyf +
        ", yypddm = " + yypddm +
        ", yypd = " + yypd +
        ", jl = " + jl +
        ", dw = " + dw +
        ", yf = " + yf +
        ", yyts = " + yyts +
        ", sfps = " + sfps +
        ", ypsl = " + ypsl +
        ", ypdw = " + ypdw +
        ", jydm = " + jydm +
        ", jcbw = " + jcbw +
        ", bz = " + bz +
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
