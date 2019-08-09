# configuration server

# annotation must appear in the main app
@EnableConfigServer 


# application.properties
* example
```
server.port=9000

# configurations are loaded fromt helocal filesystem, not from Git
spring.profiles.active=native
```

# configure database connection for exampledb.properties
```
database.connection = jdbc:mysql://localhost:3306/sample01
```

# load all the configuration related to sampel01 microservice
curl http://localhost:9000/sample01/default

