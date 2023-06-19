package com.example.webapp.resource;

import jakarta.ws.rs.HeaderParam;

public class AdditionalHeader {

    private final String constructorHeader;

    @HeaderParam("BeanParam-Field-Header")
    private String fieldHeader;

    private String propertyHeader;

    private String additionalHeader;

    public AdditionalHeader(@HeaderParam("BeanParam-Constructor-Header") final String constructorHeader) {
        this.constructorHeader = constructorHeader;
    }

    public String getConstructorHeader() {
        return constructorHeader;
    }

    public String getFieldHeader() {
        return fieldHeader;
    }

    public String getPropertyHeader() {
        return propertyHeader;
    }

    @HeaderParam("BeanParam-Property-Header")
    public void setPropertyHeader(final String header) {
        this.propertyHeader = header;
    }

    public String getAdditionalHeader() {
        return additionalHeader;
    }

    @HeaderParam("BeanParam-Additional-Header")
    public void addAdditionalHeader(final String header) {
        this.additionalHeader = header;
    }

}
