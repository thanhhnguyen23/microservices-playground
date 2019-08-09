# used to build java application
mvn clean install
# used for debugging
mvn clean install -X
# used to deploy java application
mvn spring-boot:run
# used to test microservice with curl client
curl http://localhost:8080/order/11
# used to retrieve health status of server
curl http://localhost:8080/actuator/health
# used to debug
curl http://localhost:8080/actuator/httptrace
* must have this configured in application.properties file
```
management.endpoints.web.exposure.include=health,info,httptrace
```


