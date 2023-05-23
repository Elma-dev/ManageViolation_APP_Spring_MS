# ManageViolation_APP_Spring_MS
# Getting Started
## 📚Prerequisite
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Angular](https://img.shields.io/badge/angular-%23DD0031.svg?style=for-the-badge&logo=angular&logoColor=white)
![Bootstrap](https://img.shields.io/badge/bootstrap-%238511FA.svg?style=for-the-badge&logo=bootstrap&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)
``` 
* Spring Cloud
* Eureka Descovery
* H2DataBase
* BloomRPC
```

## Installation
```
1. Clone this repo
git clon <!--links of repo-->
2. Install all the dependencies
npm install
3. run all services (after install maven dependencies in intellijIDE)
4. run front project
ng serve
``` 
## Project Dependencies
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



# Project: General Schema 
![image](https://github.com/Elma-dev/ManageViolation_APP_Spring_MS/assets/67378945/aaa02330-718e-496d-957b-9d88037a8baf)
# Class Diagram
![DiagramApp](https://github.com/Elma-dev/ManageViolation_APP_Spring_MS/assets/67378945/57fe2516-d0c4-4bbd-9149-318dbedb00f1)

# Web Services  Structure (Backend)
There are five services in all, as stated in the project schema. Every one has a building plan.
## Registration Services
```
The micro-registration service that allows the management of vehicles belonging to the
and owners. Each vehicle belongs to one owner. A owner is defined by his id, name, date of birth, email and email.
A vehicle is defined by its ID, registration number, brand, tax power and model.
```

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
the radar management microservice The ID of a radar identifies it.
Latitude and Longitude are the coordinates and maximum speed
```
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
The micro-service that helps to deal with infringements. Each offence is defined by its ID, its date,
the radar number that detected the exceeding, vehicle registration, vehicle speed,maximum radar speed
and the amount of the infringement.
```
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
API gateway is a software application between a client and a set of backend microservices.
The API Gateway serves as a reverse proxy to accept API calls from the client application, forwarding this traffic to the appropriate servic
```
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
The Eureka server is nothing but an implementation of service discovery pattern, where microservices can register themselves so others can discover them. 
This server holds information about the client service applications.
```
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
# Web Services Test
<table align="center">
    <tr>
        <th>Eureka Discovery</th>
    </tr>
    <tr>
        <td><img src="images/eureka.jpg"/></td>
    </tr>
</table>

<table align="center">
    <tr>
        <th>Registration WS</th>
        <th>Radars WS</th>
        <th>Volation WS</th>
    </tr>
    <tr>
        <td><img src="images/vehTest.jpg"/></td>
        <td><img src="images/radars.jpg"/></td>
        <td><img src="images/infractions.jpg"/></td>
    </tr>
</table>

# Radar Simulator
```
a java application that simulates a radar that randomly generates
speed excesses and send them, via GRPC, to Radar-Service
```
![controlSd2](https://github.com/Elma-dev/ManageViolation_APP_Spring_MS/assets/67378945/d51c6615-4b3b-4793-95f9-83cbf1da753f)

## Radar Simulator Project Structure
```
├───src
│   ├───main
│   │   ├───java
│   │   │   └───dev
│   │   │       └───elma
│   │   │           └───radarsimulation
│   │   │               ├───configuration
│   │   │               ├───dtos
│   │   │               └───services
│   │   └───resources
│   │       ├───static
│   │       └───templates
│   └───test
│       └───java
│           └───dev
│               └───elma
│                   └───radarsimulation
└───target
    ├───classes
    │   └───dev
    │       └───elma
    │           └───radarsimulation
    │               ├───configuration
    │               ├───dtos
    │               └───services
    └───generated-sources
        └───annotations
```
## Radar Simulator Test
![image](https://github.com/Elma-dev/ManageViolation_APP_Spring_MS/assets/67378945/6f095535-f8b2-4077-9cde-900c7d07116d)
# Project Results ![Angular](https://img.shields.io/badge/angular-%23DD0031.svg?style=for-the-badge&logo=angular&logoColor=white)

<table align="center">
    <tr>
        <th>Authentication Page</th>
        <th>Home Page</th>
    </tr>
    <tr>
        <td><img src="images/auth.jpg"/></td>
         <td><img src="images/home.jpg"/></td>
    </tr>
</table>

<table align="center">
    <tr>
        <th>Registration Page</th>
        <th>Radars Page</th>
    </tr>
    <tr>
        <td><img src="images/vehiclesPage.jpg"/></td>
         <td><img src="images/radarsPage.jpg"/></td>
    </tr>
</table>

<table align="center">
    <tr>
        <th>Violations Page</th>
    </tr>
    <tr>
        <td><img src="images/violationPages.jpg"/></td>
    </tr>
</table>

