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

    public ExampleResource(@HeaderParam("Resource-Constructor-Header") final String constructorHeader) {
        super();
        this.constructorHeader = constructorHeader;
    }

    @HeaderParam("Resource-Property-Header")
    public void addHeader(final String header) {
        this.propertyHeader = header;
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
        headerResult.setBeanParamConstructorHeader(beanParam.getConstructorHeader());
        headerResult.setBeanParamFieldHeader(beanParam.getFieldHeader());
        headerResult.setBeanParamPropertyHeader(beanParam.getPropertyHeader());
        return Response.ok(headerResult).build();
    }

}
