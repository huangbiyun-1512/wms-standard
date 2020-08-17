# POC APIs

## Table of Contents

### API Specification

#### API Standard

Follow the RESTful API standard.
eg:
1. GET /wms/api/v1/inbound/asn/{asnId}
--> 200 OK.
2. GET /wms/api/v1/inbound/asn?wh_id={whId}&page_no={pageNo}&page_size={pageSize}
--> 200 OK.
3. POST /wms/api/v1/inbound/asn
--> 201 Created.
4. PUT /wms/api/v1/inbound/asn/{asnId}
--> 200 OK.
5. DELETE /wms/api/v1/inbound/asn/{asnId}
--> 204 No Content.

#### Version Control

By mixing the version number into the URL.
eg:
1. GET /wms/api/v1/inbound/asn/{asnId}
2. GET /wms/api/v2/inbound/asn/{asnId}

#### Domain Name Management

eg:
1. dev.xxx.com.cn
2. test.xxx.com.cn
3. uat.xxx.com.cn
4. prod.xxx.com.cn

#### Documentation

Swagger via OpenAPI 3

#### API Management

Follow the global standard and integrate into the global uniform API management platform.
eg:
1. gravitee.io

### APM

#### Logging

eg:
1. ELK

#### Monitoring

eg:
1. Prometheus & Grafana

#### Service Chain Tracing

eg:
1. Zipkin
2. Jaeger

### Coding Guideline

Style Guide
1. Google Java Style Guide
https://google.github.io/styleguide/javaguide.html

Java Coding Guideline
1. Alibaba Java Coding Guideline

#### Project Structure

root
 |--- xxx-api           API of the business service.
        |--- src/main
                |--- java
 |--- xxx-provider      Implementation of the business service.
        |--- src/main
                |--- java
                |--- resources
 |--- .gitignore        Git management configuration.
 |--- deployment.yml    K8s deployment yaml.
 |--- Dockerfile        Docker related configuration.
 |--- pom.xml           Maven related configuration.
 |--- README.md         Description of the project.

#### Parameter Validation

Follow the Spring Boot Validation Guideline.

#### Exception Handling

GlobalExceptionHandler via controller advice.

#### i18n

Follow the Spring Boot i18n Guideline.

### CICD

1. Maven
2. Sonar
3. Nexus
4. Jenkins

### Deployment

#### Docker

1. Dockerfile

#### K8s

1. ConfigMap
2. Deployment
3. Service
4. Ingress related