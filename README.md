# notable

## Running
Currently, this project must be run with Java 8. If you get weird errors trying to start it up, run `java -version`
and make sure it says something like `java version "1.8.0_151"`. If you have changed Java versions (such as going from Java 9 to Java 8), also run `mvn -version` and make sure the Java version in the output matches. If they don't match, set the `JAVA_HOME` environment variable to the path of the correct Java version. See the onboarding Google document for more details.


Run command to start project
```bash
./mvnw spring-boot:run
```

Run command to get war file
```bash
./mvnw package
```


### Local Host

1. project is available on `localhost:9999`
2. time parameter entered like such `11:15:00`
3 [Code](https://github.com/alexliinc/notable/tree/master/test/src/main/java/com/notable/test)


