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
@TableName("TB_YB2010A_JYJL")
public class TbYb2010aJyjl implements Serializable {

    private static final long serialVersionUID = 1L;

    private String fYljgdm;

    private String fJysj;

    private Integer rowNo;

    private String docNo;

    private String zxjylsh;

    private String yljgdm;

    private String kh;

    private String zhbz;

    private String brlx;

    private BigDecimal jzcs;

    private String jzzxfhsj;

    private String zslxbz;

    private BigDecimal jyfyze;

    private BigDecimal dnzhzfs;

    private BigDecimal lnzhzfs;

    private BigDecimal zfdxjzfs;

    private BigDecimal qfdxjzfs;

    private BigDecimal qfdzhzfs;

    private BigDecimal tcdxjzfs;

    private BigDecimal tcdzhzfs;

    private BigDecimal tczfs;

    private BigDecimal fjdxjzfs;

    private BigDecimal fjdzhzfs;

    private BigDecimal dffjzfs;

    private BigDecimal ybjsfwfy;

    private BigDecimal fybjsfwgrzf;

    private String syybbf;

    private String dyfpbh;

    private String stfbz;

    private String jsksrq;

    private String jfbz;

    private Long jfxmylfyze;

    private Short warFlag;

    private String warNote;

    private LocalDateTime jlgxsj;

    private Integer llbz;

    private Short chkFlag;

    private Short sedBz;

    private String jlscrq;

    public String getfYljgdm() {
        return fYljgdm;
    }

    public void setfYljgdm(String fYljgdm) {
        this.fYljgdm = fYljgdm;
    }

    public String getfJysj() {
        return fJysj;
    }

    public void setfJysj(String fJysj) {
        this.fJysj = fJysj;
    }

    public Integer getRowNo() {
        return rowNo;
    }

    public void setRowNo(Integer rowNo) {
        this.rowNo = rowNo;
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    public String getZxjylsh() {
        return zxjylsh;
    }

    public void setZxjylsh(String zxjylsh) {
        this.zxjylsh = zxjylsh;
    }

    public String getYljgdm() {
        return yljgdm;
    }

    public void setYljgdm(String yljgdm) {
        this.yljgdm = yljgdm;
    }

    public String getKh() {
        return kh;
    }

    public void setKh(String kh) {
        this.kh = kh;
    }

    public String getZhbz() {
        return zhbz;
    }

    public void setZhbz(String zhbz) {
        this.zhbz = zhbz;
    }

    public String getBrlx() {
        return brlx;
    }

    public void setBrlx(String brlx) {
        this.brlx = brlx;
    }

    public BigDecimal getJzcs() {
        return jzcs;
    }

    public void setJzcs(BigDecimal jzcs) {
        this.jzcs = jzcs;
    }

    public String getJzzxfhsj() {
        return jzzxfhsj;
    }

    public void setJzzxfhsj(String jzzxfhsj) {
        this.jzzxfhsj = jzzxfhsj;
    }

    public String getZslxbz() {
        return zslxbz;
    }

    public void setZslxbz(String zslxbz) {
        this.zslxbz = zslxbz;
    }

    public BigDecimal getJyfyze() {
        return jyfyze;
    }

    public void setJyfyze(BigDecimal jyfyze) {
        this.jyfyze = jyfyze;
    }

    public BigDecimal getDnzhzfs() {
        return dnzhzfs;
    }

    public void setDnzhzfs(BigDecimal dnzhzfs) {
        this.dnzhzfs = dnzhzfs;
    }

    public BigDecimal getLnzhzfs() {
        return lnzhzfs;
    }

    public void setLnzhzfs(BigDecimal lnzhzfs) {
        this.lnzhzfs = lnzhzfs;
    }

    public BigDecimal getZfdxjzfs() {
        return zfdxjzfs;
    }

    public void setZfdxjzfs(BigDecimal zfdxjzfs) {
        this.zfdxjzfs = zfdxjzfs;
    }

    public BigDecimal getQfdxjzfs() {
        return qfdxjzfs;
    }

    public void setQfdxjzfs(BigDecimal qfdxjzfs) {
        this.qfdxjzfs = qfdxjzfs;
    }

    public BigDecimal getQfdzhzfs() {
        return qfdzhzfs;
    }

    public void setQfdzhzfs(BigDecimal qfdzhzfs) {
        this.qfdzhzfs = qfdzhzfs;
    }

    public BigDecimal getTcdxjzfs() {
        return tcdxjzfs;
    }

    public void setTcdxjzfs(BigDecimal tcdxjzfs) {
        this.tcdxjzfs = tcdxjzfs;
    }

    public BigDecimal getTcdzhzfs() {
        return tcdzhzfs;
    }

    public void setTcdzhzfs(BigDecimal tcdzhzfs) {
        this.tcdzhzfs = tcdzhzfs;
    }

    public BigDecimal getTczfs() {
        return tczfs;
    }

    public void setTczfs(BigDecimal tczfs) {
        this.tczfs = tczfs;
    }

    public BigDecimal getFjdxjzfs() {
        return fjdxjzfs;
    }

    public void setFjdxjzfs(BigDecimal fjdxjzfs) {
        this.fjdxjzfs = fjdxjzfs;
    }

    public BigDecimal getFjdzhzfs() {
        return fjdzhzfs;
    }

    public void setFjdzhzfs(BigDecimal fjdzhzfs) {
        this.fjdzhzfs = fjdzhzfs;
    }

    public BigDecimal getDffjzfs() {
        return dffjzfs;
    }

    public void setDffjzfs(BigDecimal dffjzfs) {
        this.dffjzfs = dffjzfs;
    }

    public BigDecimal getYbjsfwfy() {
        return ybjsfwfy;
    }

    public void setYbjsfwfy(BigDecimal ybjsfwfy) {
        this.ybjsfwfy = ybjsfwfy;
    }

    public BigDecimal getFybjsfwgrzf() {
        return fybjsfwgrzf;
    }

    public void setFybjsfwgrzf(BigDecimal fybjsfwgrzf) {
        this.fybjsfwgrzf = fybjsfwgrzf;
    }

    public String getSyybbf() {
        return syybbf;
    }

    public void setSyybbf(String syybbf) {
        this.syybbf = syybbf;
    }

    public String getDyfpbh() {
        return dyfpbh;
    }

    public void setDyfpbh(String dyfpbh) {
        this.dyfpbh = dyfpbh;
    }

    public String getStfbz() {
        return stfbz;
    }

    public void setStfbz(String stfbz) {
        this.stfbz = stfbz;
    }

    public String getJsksrq() {
        return jsksrq;
    }

    public void setJsksrq(String jsksrq) {
        this.jsksrq = jsksrq;
    }

    public String getJfbz() {
        return jfbz;
    }

    public void setJfbz(String jfbz) {
        this.jfbz = jfbz;
    }

    public Long getJfxmylfyze() {
        return jfxmylfyze;
    }

    public void setJfxmylfyze(Long jfxmylfyze) {
        this.jfxmylfyze = jfxmylfyze;
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
        return "TbYb2010aJyjl{" +
        "fYljgdm = " + fYljgdm +
        ", fJysj = " + fJysj +
        ", rowNo = " + rowNo +
        ", docNo = " + docNo +
        ", zxjylsh = " + zxjylsh +
        ", yljgdm = " + yljgdm +
        ", kh = " + kh +
        ", zhbz = " + zhbz +
        ", brlx = " + brlx +
        ", jzcs = " + jzcs +
        ", jzzxfhsj = " + jzzxfhsj +
        ", zslxbz = " + zslxbz +
        ", jyfyze = " + jyfyze +
        ", dnzhzfs = " + dnzhzfs +
        ", lnzhzfs = " + lnzhzfs +
        ", zfdxjzfs = " + zfdxjzfs +
        ", qfdxjzfs = " + qfdxjzfs +
        ", qfdzhzfs = " + qfdzhzfs +
        ", tcdxjzfs = " + tcdxjzfs +
        ", tcdzhzfs = " + tcdzhzfs +
        ", tczfs = " + tczfs +
        ", fjdxjzfs = " + fjdxjzfs +
        ", fjdzhzfs = " + fjdzhzfs +
        ", dffjzfs = " + dffjzfs +
        ", ybjsfwfy = " + ybjsfwfy +
        ", fybjsfwgrzf = " + fybjsfwgrzf +
        ", syybbf = " + syybbf +
        ", dyfpbh = " + dyfpbh +
        ", stfbz = " + stfbz +
        ", jsksrq = " + jsksrq +
        ", jfbz = " + jfbz +
        ", jfxmylfyze = " + jfxmylfyze +
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
