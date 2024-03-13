package com.jyq.po.access;

public class QlrlbExample {
    private String slid;
    private String zjzl;
    private Integer xh;
    private String bdclx;
    private String zjhm;
    private String qlrmc;
    private String cbfbm;
    private String qlrtz;
    private String qlrlx;
    private Integer qllx;
    private String fbfbm;
    private String dz;
    private String gj;
    private String dh;
    private String yb;

    private Integer sxh;
    private Integer bz;
    private String qlrid;
    private String qxdm;
    private String dkdm;
    private String cbsyqmj;

    public QlrlbExample(String qlrid,String zjzl,
                        String gj, String zjhm, String qlrmc, String yb, String qlrlx, String dz, String dh,  String qxdm) {
        this.zjzl = zjzl;
        this.zjhm = zjhm;
        this.qlrmc = qlrmc;
        this.qlrlx = qlrlx;
        this.dz = dz;
        this.gj = gj;
        this.dh = dh;
        this.yb = yb;
        this.qlrid = qlrid;
        this.qxdm = qxdm;
    }

    public QlrlbExample( String cbsyqmj,String dkdm, String cbfbm, Integer sxh, Integer bz, String qlrid, String qxdm ) {
        this.cbsyqmj = cbsyqmj;
        this.dkdm = dkdm;
        this.cbfbm = cbfbm;
        this.sxh = sxh;
        this.bz = bz;
        this.qlrid = qlrid;
        this.qxdm = qxdm;

    }
    public QlrlbExample(String cbfbm, Integer sxh, Integer bz, String qlrid, String qxdm, String fbfbm ) {
        this.cbfbm = cbfbm;
        this.sxh = sxh;
        this.bz = bz;
        this.qlrid = qlrid;
        this.qxdm = qxdm;
        this.fbfbm = fbfbm;

    }
    public QlrlbExample(String cbsyqmj ,String dkdm,String slid, String zjzl, Integer xh, String bdclx, String zjhm, String qlrmc, String cbfbm, String qlrtz, String qlrlx, Integer qllx, String fbfbm, String dz, String gj, String dh, String yb, Integer sxh, Integer bz, String qlrid, String qxdm ) {
        this.cbsyqmj = cbsyqmj;
        this.dkdm = dkdm;
        this.slid = slid;
        this.zjzl = zjzl;
        this.xh = xh;
        this.bdclx = bdclx;
        this.zjhm = zjhm;
        this.qlrmc = qlrmc;
        this.cbfbm = cbfbm;
        this.qlrtz = qlrtz;
        this.qlrlx = qlrlx;
        this.qllx = qllx;
        this.fbfbm = fbfbm;
        this.dz = dz;
        this.gj = gj;
        this.dh = dh;
        this.yb = yb;
        this.sxh = sxh;
        this.bz = bz;
        this.qlrid = qlrid;
        this.qxdm = qxdm;

    }





    public Integer getSxh() {
        return sxh;
    }

    public void setSxh(Integer sxh) {
        this.sxh = sxh;
    }

    public Integer getBz() {
        return bz;
    }

    public void setBz(Integer bz) {
        this.bz = bz;
    }

    public String getQlrid() {
        return qlrid;
    }

    public void setQlrid(String qlrid) {
        this.qlrid = qlrid;
    }

    public String getQxdm() {
        return qxdm;
    }

    public void setQxdm(String qxdm) {
        this.qxdm = qxdm;
    }

    @Override
    public String toString() {
        return "QlrlbExample{" +
                "slid='" + slid + '\'' +
                ", zjzl='" + zjzl + '\'' +
                ", xh=" + xh +
                ", bdclx='" + bdclx + '\'' +
                ", zjhm='" + zjhm + '\'' +
                ", qlrmc='" + qlrmc + '\'' +
                ", cbfbm='" + cbfbm + '\'' +
                ", qlrtz='" + qlrtz + '\'' +
                ", qlrlx='" + qlrlx + '\'' +
                ", qllx=" + qllx +
                ", fbfbm='" + fbfbm + '\'' +
                ", dz='" + dz + '\'' +
                ", gj='" + gj + '\'' +
                ", dh='" + dh + '\'' +
                ", yb='" + yb + '\'' +
                ", sxh=" + sxh +
                ", bz=" + bz +
                ", qlrid='" + qlrid + '\'' +
                ", qxdm='" + qxdm + '\'' +

                '}';
    }

    public String getSlid() {
        return slid;
    }

    public void setSlid(String slid) {
        this.slid = slid;
    }

    public String getZjzl() {
        return zjzl;
    }

    public void setZjzl(String zjzl) {
        this.zjzl = zjzl;
    }

    public Integer getXh() {
        return xh;
    }

    public void setXh(Integer xh) {
        this.xh = xh;
    }

    public String getBdclx() {
        return bdclx;
    }

    public void setBdclx(String bdclx) {
        this.bdclx = bdclx;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public String getQlrmc() {
        return qlrmc;
    }

    public void setQlrmc(String qlrmc) {
        this.qlrmc = qlrmc;
    }

    public String getCbfbm() {
        return cbfbm;
    }

    public void setCbfbm(String cbfbm) {
        this.cbfbm = cbfbm;
    }

    public String getQlrtz() {
        return qlrtz;
    }

    public void setQlrtz(String qlrtz) {
        this.qlrtz = qlrtz;
    }

    public String getQlrlx() {
        return qlrlx;
    }

    public void setQlrlx(String qlrlx) {
        this.qlrlx = qlrlx;
    }

    public Integer getQllx() {
        return qllx;
    }

    public void setQllx(Integer qllx) {
        this.qllx = qllx;
    }

    public String getFbfbm() {
        return fbfbm;
    }

    public void setFbfbm(String fbfbm) {
        this.fbfbm = fbfbm;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }



    public String getGj() {
        return gj;
    }

    public void setGj(String gj) {
        this.gj = gj;
    }

    public String getDh() {
        return dh;
    }

    public void setDh(String dh) {
        this.dh = dh;
    }

    public String getYb() {
        return yb;
    }

    public void setYb(String yb) {
        this.yb = yb;
    }

    public QlrlbExample() {
    }

    public QlrlbExample(String cbsyqmj ,String slid, String zjzl, Integer xh, String bdclx, String zjhm, String qlrmc, String cbfbm, String qlrtz, String qlrlx, Integer qllx, String fbfbm, String dz,  String gj, String dh, String yb) {
        this.cbsyqmj = cbsyqmj;
        this.slid = slid;
        this.zjzl = zjzl;
        this.xh = xh;
        this.bdclx = bdclx;
        this.zjhm = zjhm;
        this.qlrmc = qlrmc;
        this.cbfbm = cbfbm;
        this.qlrtz = qlrtz;
        this.qlrlx = qlrlx;
        this.qllx = qllx;
        this.fbfbm = fbfbm;
        this.dz = dz;

        this.gj = gj;
        this.dh = dh;
        this.yb = yb;
    }
}
