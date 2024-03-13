package com.jyq.po;


public class Test1 {
    private Integer jId;

    private String jValue;

    private String jImg;

    private String jW;

    public Test1() {
    }

    @Override
    public String toString() {
        return "Test1{" +
                "jId=" + jId +
                ", jValue='" + jValue + '\'' +
                ", jImg='" + jImg + '\'' +
                ", jW='" + jW + '\'' +
                '}';
    }

    public Integer getjId() {
        return jId;
    }

    public void setjId(Integer jId) {
        this.jId = jId;
    }

    public String getjValue() {
        return jValue;
    }

    public void setjValue(String jValue) {
        this.jValue = jValue;
    }

    public String getjImg() {
        return jImg;
    }

    public void setjImg(String jImg) {
        this.jImg = jImg;
    }

    public String getjW() {
        return jW;
    }

    public void setjW(String jW) {
        this.jW = jW;
    }

    public Test1(Integer jId, String jValue, String jImg, String jW) {
        this.jId = jId;
        this.jValue = jValue;
        this.jImg = jImg;
        this.jW = jW;
    }
}