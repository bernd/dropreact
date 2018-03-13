# drop-react - Example Dropwizard & React application

A simple example application to show how to use dropwizard with a react UI.

## How to start the DropReact application

1. Run `mvn clean package` to build your application
1. Start application with `java -jar target/dropreact-1-SNAPSHOT.jar server config.yml`
1. To check that your application is running enter url `http://localhost:8080`

## Development

1. Run `mvn clean package` to build your application
1. Start application with `java -jar target/dropreact-1-SNAPSHOT.jar server config.yml`
1. Start the development web server with `cd src/web && yarn start`
1. Access your application via `http://localhost:3000`

The react dev webserver will proxy all requests to the dropwizard API server
at `http://localhost:8080`.
