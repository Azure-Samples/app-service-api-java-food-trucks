---
services: app-service\api
platforms: java
author: pkefal
---
#FoodTrucks - Java API App for Azure App Service

1. Download as zip or clone the repository. 
2. Go to the folder where you unzipped or cloned the repository
3. To just build the .war for deployment:
```
./gradlew war
```
4. To run it locally:
```
./gradlew jettyRunWar
```
It will be accessible at: http://localhost:8080/JavaAPIApp
