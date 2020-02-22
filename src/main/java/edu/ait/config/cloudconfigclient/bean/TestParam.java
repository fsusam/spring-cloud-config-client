package edu.ait.config.cloudconfigclient.bean;

public class TestParam {
    private String dummyProperty1;
    private String dummyProperty2;

    public TestParam(final String dummyProperty1, final String dummyProperty2) {
        this.dummyProperty1 = dummyProperty1;
        this.dummyProperty2 = dummyProperty2;
    }

    public String getDummyProperty1() {
        return dummyProperty1;
    }

    public void setDummyProperty1(final String dummyProperty1) {
        this.dummyProperty1 = dummyProperty1;
    }

    public String getDummyProperty2() {
        return dummyProperty2;
    }

    public void setDummyProperty2(final String dummyProperty2) {
        this.dummyProperty2 = dummyProperty2;
    }
}
