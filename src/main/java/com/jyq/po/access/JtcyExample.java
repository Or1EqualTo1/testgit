package com.jyq.po.access;

public class JtcyExample {

    private String slid;
    private Integer oid;
    private Integer oid1;
    private Integer cyoid;

    private String xm;
    private Integer xb;
    private String ycbfdbgx;
    private String sfzhm;
    private String djkid;




    public JtcyExample(String slid, Integer oid, Integer oid1,Integer cyoid, String djkid) {
        this.slid = slid;
        this.oid = oid;
        this.oid1 = oid1;
        this.cyoid = cyoid;
        this.djkid = djkid;

    }

    public JtcyExample() {
    }


    @Override
    public String toString() {
        return "JtcyExample{" +
                "slid='" + slid + '\'' +
                ", oid='" + oid + '\'' +
                ", xm='" + xm + '\'' +
                ", xb='" + xb + '\'' +
                ", ycbfdbgx='" + ycbfdbgx + '\'' +
                ", sfzhm='" + sfzhm + '\'' +
                '}';
    }

    public Integer getCyoid() {
        return cyoid;
    }

    public void setCyoid(Integer cyoid) {
        this.cyoid = cyoid;
    }

    public Integer getOid1() {
        return oid1;
    }

    public void setOid1(Integer oid1) {
        this.oid1 = oid1;
    }
    public String getDjkid() {
        return djkid;
    }

    public void setDjkid(String djkid) {
        this.djkid = djkid;
    }

    public String getSlid() {
        return slid;
    }

    public void setSlid(String slid) {
        this.slid = slid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public Integer getXb() {
        return xb;
    }

    public void setXb(Integer xb) {
        this.xb = xb;
    }

    public String getYcbfdbgx() {
        return ycbfdbgx;
    }

    public void setYcbfdbgx(String ycbfdbgx) {
        this.ycbfdbgx = ycbfdbgx;
    }

    public String getSfzhm() {
        return sfzhm;
    }

    public void setSfzhm(String sfzhm) {
        this.sfzhm = sfzhm;
    }

    public JtcyExample(String slid, Integer oid, String xm, Integer xb, String ycbfdbgx, String sfzhm, String djkid) {
        this.slid = slid;
        this.oid = oid;
        this.xm = xm;
        this.xb = xb;
        this.ycbfdbgx = ycbfdbgx;
        this.sfzhm = sfzhm;
        this.djkid = djkid;
    }
}
