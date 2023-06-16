package com.example.webapp.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.HeaderParam;

public class AdditionalHeader {

    private final String constructorHeader;

    @HeaderParam("BeanParam-Field-Header")
    private String fieldHeader;

    private String propertyHeader;

    @Inject
    public AdditionalHeader(@HeaderParam("BeanParam-Constructor-Header") final String constructorHeader) {
        this.constructorHeader = constructorHeader;
    }

    public String getConstructorHeader() {
        return constructorHeader;
    }

    public String getFieldHeader() {
        return fieldHeader;
    }

    @HeaderParam("BeanParam-Property-Header")
    public void addHeader(final String header) {
        this.propertyHeader = header;
    }

    public String getPropertyHeader() {
        return propertyHeader;
    }

}
