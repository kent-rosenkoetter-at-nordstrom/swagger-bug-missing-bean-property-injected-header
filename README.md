# swagger-bug-missing-bean-property-injected-header

A repro case for a swagger.io bug.

```shell
curl -H "Resource-Constructor-Header: foo" -H "Resource-Field-Header: foo" -H "Resource-Property-Header: foo" -H "BeanParam-Constructor-Header: foo" -H "BeanParam-Field-Header: foo" -H "BeanParam-Property-Header: foo" http://localhost:8080/swagger-bug-1.0.0-SNAPSHOT/example/api
curl http://localhost:8080/swagger-bug-1.0.0-SNAPSHOT/example/openapi.yaml
```
