package com.example.webapp.resource;

import jakarta.json.bind.annotation.JsonbNillable;

@JsonbNillable
public class HeaderResult {

    private String resourceConstructorHeader;
    private String resourceFieldHeader;
    private String resourcePropertyHeader;
    private String resourceAdditionalHeader;
    private String beanParamConstructorHeader;
    private String beanParamFieldHeader;
    private String beanParamPropertyHeader;
    private String beanParamAdditionalHeader;

    public String getResourceConstructorHeader() {
        return resourceConstructorHeader;
    }

    public void setResourceConstructorHeader(final String resourceConstructorHeader) {
        this.resourceConstructorHeader = resourceConstructorHeader;
    }

    public String getResourceFieldHeader() {
        return resourceFieldHeader;
    }

    public void setResourceFieldHeader(final String resourceFieldHeader) {
        this.resourceFieldHeader = resourceFieldHeader;
    }

    public String getResourcePropertyHeader() {
        return resourcePropertyHeader;
    }

    public void setResourcePropertyHeader(final String resourcePropertyHeader) {
        this.resourcePropertyHeader = resourcePropertyHeader;
    }

    public String getResourceAdditionalHeader() {
        return resourceAdditionalHeader;
    }

    public void setResourceAdditionalHeader(final String resourceAdditionalHeader) {
        this.resourceAdditionalHeader = resourceAdditionalHeader;
    }

    public String getBeanParamConstructorHeader() {
        return beanParamConstructorHeader;
    }

    public void setBeanParamConstructorHeader(final String beanParamConstructorHeader) {
        this.beanParamConstructorHeader = beanParamConstructorHeader;
    }

    public String getBeanParamFieldHeader() {
        return beanParamFieldHeader;
    }

    public void setBeanParamFieldHeader(final String beanParamFieldHeader) {
        this.beanParamFieldHeader = beanParamFieldHeader;
    }

    public String getBeanParamPropertyHeader() {
        return beanParamPropertyHeader;
    }

    public void setBeanParamPropertyHeader(final String beanParamPropertyHeader) {
        this.beanParamPropertyHeader = beanParamPropertyHeader;
    }

    public String getBeanParamAdditionalHeader() {
        return beanParamAdditionalHeader;
    }

    public void setBeanParamAdditionalHeader(final String beanParamAdditionalHeader) {
        this.beanParamAdditionalHeader = beanParamAdditionalHeader;
    }
}
