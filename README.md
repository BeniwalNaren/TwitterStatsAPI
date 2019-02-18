![alt text](https://gitlab.ing.net/uploads/system/project/avatar/16600/industrial-robot2.png)

# Welcome to the TwitterStatsAPI repository
![Build Status]()

TwitterStatsAPI is is used to get the stats from Twitter trend API

## Development

```
cd TwitterStatsAPI

mvn spring-boot:run
```
## Building for production

### Release steps
Used mvn release plugin

## Testing
- Application's unit tests and Stubbed integration test, run:

```
cd TwitterStatsAPI
mvn clean test
```

- Cucumber E2E test run:

```
cd TwitterStatsAPITest
mvn clean test -P dev 
# or:
mvn clean test -P test 
```

- Prometheus metrics and endpoint:

```
Test the following endpoin to check all the metrics from Prometheus
https://localhost:8088/metrics
```

## Contact
### Initial committer
* **Name initial committer developer** - narenbeniwal@icloud.com



