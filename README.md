# ManageViolation_APP_Spring_MS
# Project Schema 
![image](https://github.com/Elma-dev/ManageViolation_APP_Spring_MS/assets/67378945/aaa02330-718e-496d-957b-9d88037a8baf)

# Web Services Schema
There are five services in all, as stated in the project schema. Every one has a building plan.
## Registration Services
```
├───src
│   ├───main
│   │   ├───java
│   │   │   └───dev
│   │   │       └───elma
│   │   │           └───immatriculation_ms
│   │   │               ├───entities
│   │   │               ├───projections
│   │   │               ├───repositories
│   │   │               └───web
│   │   └───resources
│   └───test
│       └───java
│           └───dev
│               └───elma
│                   └───immatriculation_ms
└───target
    ├───classes
    │   └───dev
    │       └───elma
    │           └───immatriculation_ms
    │               ├───entities
    │               ├───projections
    │               ├───repositories
    │               └───web
    └───generated-sources
        └───annotations

```
## Radar Services
```
├───src
│   ├───main
│   │   ├───java
│   │   │   └───dev
│   │   │       └───elma
│   │   │           └───radar_ms
│   │   │               ├───entities
│   │   │               ├───feign
│   │   │               ├───models
│   │   │               ├───repositories
│   │   │               └───web
│   │   └───resources
│   └───test
│       └───java
│           └───dev
│               └───elma
│                   └───radar_ms
└───target
    ├───classes
    │   └───dev
    │       └───elma
    │           └───radar_ms
    │               ├───entities
    │               ├───feign
    │               ├───models
    │               ├───repositories
    │               └───web
    ├───generated-sources
    │   └───annotations
    └───maven-status
        └───maven-compiler-plugin
            └───compile
                └───default-compile

```
## Violation Services
```
├───src
│   ├───main
│   │   ├───java
│   │   │   └───dev
│   │   │       └───elma
│   │   │           └───infractin_ms
│   │   │               ├───entities
│   │   │               ├───feignApi
│   │   │               ├───models
│   │   │               ├───repositories
│   │   │               └───web
│   │   └───resources
│   └───test
│       └───java
│           └───dev
│               └───elma
│                   └───infractin_ms
└───target
    ├───classes
    │   └───dev
    │       └───elma
    │           └───infractin_ms
    │               ├───entities
    │               ├───feignApi
    │               ├───models
    │               ├───repositories
    │               └───web
    ├───generated-sources
    │   └───annotations
    ├───generated-test-sources
    │   └───test-annotations
    └───test-classes
        └───dev
            └───elma
                └───infractin_ms
```  
## Gateway Service
```
├───src
│   ├───main
│   │   ├───java
│   │   │   └───dev
│   │   │       └───elma
│   │   │           └───gateway_ms
│   │   └───resources
│   └───test
│       └───java
│           └───dev
│               └───elma
│                   └───gateway_ms
└───target
    ├───classes
    │   └───dev
    │       └───elma
    │           └───gateway_ms
    └───generated-sources
        └───annotations
```
## Eureka Service
```
├───src
│   ├───main
│   │   ├───java
│   │   │   └───dev
│   │   │       └───elma
│   │   │           └───eureka_discovery_ms
│   │   └───resources
│   └───test
│       └───java
│           └───dev
│               └───elma
│                   └───eureka_discovery_ms
└───target
    ├───classes
    │   └───dev
    │       └───elma
    │           └───eureka_discovery_ms
    └───generated-sources
        └───annotations
```
# Project Dependencies
<table>
    <tr>
        <th>Registration</th>
        <th>Radar</th>
        <th>Violation</th>
        <th>Gateway</th>
        <th>Eureka</th>
    </tr>
    <tr>
        <td><a href="https://github.com/Elma-dev/ManageViolation_APP_Spring_MS/blob/0fb916ac00e878670dec15f81df851d5f1ec9340/Immatriculation_MS/pom.xml"><img src="https://upload.wikimedia.org/wikipedia/commons/5/52/Apache_Maven_logo.svg"/></a></td>
        <td><a href="https://github.com/Elma-dev/ManageViolation_APP_Spring_MS/blob/d69ccf2cc6d23ee1d80212006e9dc7b5a86e6b44/RadarSimulation/pom.xml"><img src="https://upload.wikimedia.org/wikipedia/commons/5/52/Apache_Maven_logo.svg"/></a></td>
        <td><a href="https://github.com/Elma-dev/ManageViolation_APP_Spring_MS/blob/3f7db6a29bbc6196781d8276c4fa50a8dbdcdfe1/Infractin_MS/pom.xml"><img src="https://upload.wikimedia.org/wikipedia/commons/5/52/Apache_Maven_logo.svg"/></a></td>
        <td><a href="https://github.com/Elma-dev/ManageViolation_APP_Spring_MS/blob/ba99886a1363a60883e0777ec16314e44aab1a10/Gateway_MS/pom.xml"><img src="https://upload.wikimedia.org/wikipedia/commons/5/52/Apache_Maven_logo.svg"/></a></td>
        <td><a href="https://github.com/Elma-dev/ManageViolation_APP_Spring_MS/blob/0ed98d3561a8a89379ba6113a4d38eac443187d9/Eureka_Discovery_MS/pom.xml"><img src="https://upload.wikimedia.org/wikipedia/commons/5/52/Apache_Maven_logo.svg"/></a></td>
    </tr>
</table>

