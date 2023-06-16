package com.example.webapp.resource;

import jakarta.json.bind.annotation.JsonbNillable;

@JsonbNillable
public class HeaderResult {

    private String resourceConstructorHeader;
    private String resourceFieldHeader;
    private String resourcePropertyHeader;
    private String beanParamConstructorHeader;
    private String beanParamFieldHeader;
    private String beanParamPropertyHeader;

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

}
