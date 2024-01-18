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
@TableName("TB_STAT_YWL_REPORT")
public class TbStatYwlReport implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ksbm;

    private String ywsj;

    private String wsjgdm;

    private String yljgdm;

    private String fjWsjgdm;

    private Long mzrc;

    private Long jzrc;

    private Long etbjrc;

    private Long jhmyrc;

    private Long lnrtjrc;

    private Long ryrc;

    private BigDecimal cyrc;

    private BigDecimal zyrs;

    private Long cgrc;

    private Long jtbcs;

    private Long ssls;

    private BigDecimal tjyl1;

    private BigDecimal tjyl2;

    private BigDecimal tjyl3;

    private BigDecimal tjyl4;

    private BigDecimal tjyl5;

    private BigDecimal tjyl6;

    private BigDecimal tjyl7;

    private BigDecimal tjyl8;

    private Short xgbz;

    private Short warFlag;

    private String warNote;

    private LocalDateTime jlgxsj;

    private Integer llbz;

    private Short chkFlag;

    private Short sedBz;

    private String jlscrq;

    public String getKsbm() {
        return ksbm;
    }

    public void setKsbm(String ksbm) {
        this.ksbm = ksbm;
    }

    public String getYwsj() {
        return ywsj;
    }

    public void setYwsj(String ywsj) {
        this.ywsj = ywsj;
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

    public Long getMzrc() {
        return mzrc;
    }

    public void setMzrc(Long mzrc) {
        this.mzrc = mzrc;
    }

    public Long getJzrc() {
        return jzrc;
    }

    public void setJzrc(Long jzrc) {
        this.jzrc = jzrc;
    }

    public Long getEtbjrc() {
        return etbjrc;
    }

    public void setEtbjrc(Long etbjrc) {
        this.etbjrc = etbjrc;
    }

    public Long getJhmyrc() {
        return jhmyrc;
    }

    public void setJhmyrc(Long jhmyrc) {
        this.jhmyrc = jhmyrc;
    }

    public Long getLnrtjrc() {
        return lnrtjrc;
    }

    public void setLnrtjrc(Long lnrtjrc) {
        this.lnrtjrc = lnrtjrc;
    }

    public Long getRyrc() {
        return ryrc;
    }

    public void setRyrc(Long ryrc) {
        this.ryrc = ryrc;
    }

    public BigDecimal getCyrc() {
        return cyrc;
    }

    public void setCyrc(BigDecimal cyrc) {
        this.cyrc = cyrc;
    }

    public BigDecimal getZyrs() {
        return zyrs;
    }

    public void setZyrs(BigDecimal zyrs) {
        this.zyrs = zyrs;
    }

    public Long getCgrc() {
        return cgrc;
    }

    public void setCgrc(Long cgrc) {
        this.cgrc = cgrc;
    }

    public Long getJtbcs() {
        return jtbcs;
    }

    public void setJtbcs(Long jtbcs) {
        this.jtbcs = jtbcs;
    }

    public Long getSsls() {
        return ssls;
    }

    public void setSsls(Long ssls) {
        this.ssls = ssls;
    }

    public BigDecimal getTjyl1() {
        return tjyl1;
    }

    public void setTjyl1(BigDecimal tjyl1) {
        this.tjyl1 = tjyl1;
    }

    public BigDecimal getTjyl2() {
        return tjyl2;
    }

    public void setTjyl2(BigDecimal tjyl2) {
        this.tjyl2 = tjyl2;
    }

    public BigDecimal getTjyl3() {
        return tjyl3;
    }

    public void setTjyl3(BigDecimal tjyl3) {
        this.tjyl3 = tjyl3;
    }

    public BigDecimal getTjyl4() {
        return tjyl4;
    }

    public void setTjyl4(BigDecimal tjyl4) {
        this.tjyl4 = tjyl4;
    }

    public BigDecimal getTjyl5() {
        return tjyl5;
    }

    public void setTjyl5(BigDecimal tjyl5) {
        this.tjyl5 = tjyl5;
    }

    public BigDecimal getTjyl6() {
        return tjyl6;
    }

    public void setTjyl6(BigDecimal tjyl6) {
        this.tjyl6 = tjyl6;
    }

    public BigDecimal getTjyl7() {
        return tjyl7;
    }

    public void setTjyl7(BigDecimal tjyl7) {
        this.tjyl7 = tjyl7;
    }

    public BigDecimal getTjyl8() {
        return tjyl8;
    }

    public void setTjyl8(BigDecimal tjyl8) {
        this.tjyl8 = tjyl8;
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
        return "TbStatYwlReport{" +
        "ksbm = " + ksbm +
        ", ywsj = " + ywsj +
        ", wsjgdm = " + wsjgdm +
        ", yljgdm = " + yljgdm +
        ", fjWsjgdm = " + fjWsjgdm +
        ", mzrc = " + mzrc +
        ", jzrc = " + jzrc +
        ", etbjrc = " + etbjrc +
        ", jhmyrc = " + jhmyrc +
        ", lnrtjrc = " + lnrtjrc +
        ", ryrc = " + ryrc +
        ", cyrc = " + cyrc +
        ", zyrs = " + zyrs +
        ", cgrc = " + cgrc +
        ", jtbcs = " + jtbcs +
        ", ssls = " + ssls +
        ", tjyl1 = " + tjyl1 +
        ", tjyl2 = " + tjyl2 +
        ", tjyl3 = " + tjyl3 +
        ", tjyl4 = " + tjyl4 +
        ", tjyl5 = " + tjyl5 +
        ", tjyl6 = " + tjyl6 +
        ", tjyl7 = " + tjyl7 +
        ", tjyl8 = " + tjyl8 +
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
