package com.jyq.po;

import java.math.BigDecimal;

public class BdcRegnCbjyqNydJtcyKey {
    private String slid;

    private BigDecimal oid;

    public String getSlid() {
        return slid;
    }

    public void setSlid(String slid) {
        this.slid = slid == null ? null : slid.trim();
    }

    public BigDecimal getOid() {
        return oid;
    }

    public void setOid(BigDecimal oid) {
        this.oid = oid;
    }
}