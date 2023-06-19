package com.example.webapp.resource;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("api")
public class ExampleResource {

    private final String constructorHeader;

    @HeaderParam("Resource-Field-Header")
    private String fieldHeader;

    private String propertyHeader;

    private String additionalHeader;

    public ExampleResource(@HeaderParam("Resource-Constructor-Header") final String constructorHeader) {
        super();
        this.constructorHeader = constructorHeader;
    }

    @HeaderParam("Resource-Property-Header")
    public void setPropertyHeader(final String header) {
        this.propertyHeader = header;
    }

    @HeaderParam("Resource-Additional-Header")
    public void addAdditionalHeader(final String header) {
        this.additionalHeader = header;
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getResponse(
            @HeaderParam("Resource-Parameter-Header") final String header,
            @BeanParam final AdditionalHeader beanParam) {
        final HeaderResult headerResult = new HeaderResult();
        headerResult.setResourceConstructorHeader(constructorHeader);
        headerResult.setResourceFieldHeader(fieldHeader);
        headerResult.setResourcePropertyHeader(propertyHeader);
        headerResult.setResourceAdditionalHeader(additionalHeader);
        headerResult.setBeanParamConstructorHeader(beanParam.getConstructorHeader());
        headerResult.setBeanParamFieldHeader(beanParam.getFieldHeader());
        headerResult.setBeanParamPropertyHeader(beanParam.getPropertyHeader());
        headerResult.setBeanParamAdditionalHeader(beanParam.getAdditionalHeader());
        return Response.ok(headerResult).build();
    }

}
