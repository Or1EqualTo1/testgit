package com.jyq.po;

import java.math.BigDecimal;

public class BdcQlrlbKey {
    private String slid;

    private BigDecimal sxh;

    public String getSlid() {
        return slid;
    }

    public void setSlid(String slid) {
        this.slid = slid == null ? null : slid.trim();
    }

    public BigDecimal getSxh() {
        return sxh;
    }

    public void setSxh(BigDecimal sxh) {
        this.sxh = sxh;
    }
}