# swagger-bug-missing-bean-property-injected-header

A repro case for a swagger.io bug.

## Using Maven

Edit your `~/.m2/toolchains.xml` file:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<toolchains
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns="http://maven.apache.org/TOOLCHAINS/1.1.0"
    xsi:schemaLocation="http://maven.apache.org/TOOLCHAINS/1.1.0 https://maven.apache.org/xsd/toolchains-1.1.0.xsd ">
    <toolchain>
        <type>jdk</type>
        <provides>
            <version>20</version>
            <vendor>Amazon</vendor>
        </provides>
        <configuration>
            <jdkHome>/Users/xxxx/Library/Java/JavaVirtualMachines/corretto-20/Contents/Home</jdkHome>
        </configuration>
    </toolchain>
</toolchains>
```

Run:

```shell
mvn clean verify
```

## Deploying to GlassFish directly

When deployed to GlassFish with default configuration, the base path will be `http://localhost:8080/swagger-bug-1.0.0-SNAPSHOT`.

```shell
curl -H "Resource-Constructor-Header: one" -H "Resource-Field-Header: two" -H "Resource-Property-Header: three" -H "Resource-Additional-Header: four" -H "BeanParam-Constructor-Header: five" -H "BeanParam-Field-Header: six" -H "BeanParam-Property-Header: seven" -H "BeanParam-Additional-Header: eight" http://localhost:8080/swagger-bug-1.0.0-SNAPSHOT/example/api
curl http://localhost:8080/swagger-bug-1.0.0-SNAPSHOT/example/openapi.yaml
```
