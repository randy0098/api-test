# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        MyTask task = new MyTask(); // MyTask | 审批任务信息
        try {
            MyTask result = apiInstance.auditLeaveUsingPOST(task);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#auditLeaveUsingPOST");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8091*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**auditLeaveUsingPOST**](docs/DefaultApi.md#auditLeaveUsingPOST) | **POST** /auditLeave | 审批请假申请
*DefaultApi* | [**claimLeaveTaskUsingPOST**](docs/DefaultApi.md#claimLeaveTaskUsingPOST) | **POST** /claimLeaveTask | 认领请假申请任务
*DefaultApi* | [**createLeaveUsingPOST**](docs/DefaultApi.md#createLeaveUsingPOST) | **POST** /createLeave | 请假申请
*DefaultApi* | [**createPersonUsingPOST**](docs/DefaultApi.md#createPersonUsingPOST) | **POST** /person/createPerson | 创建人员信息
*DefaultApi* | [**createUserGroupUsingPOST**](docs/DefaultApi.md#createUserGroupUsingPOST) | **POST** /createUserGroup | 创建用户组信息
*DefaultApi* | [**createUserUsingPOST**](docs/DefaultApi.md#createUserUsingPOST) | **POST** /createUser | 创建用户信息
*DefaultApi* | [**deletePersonUsingGET**](docs/DefaultApi.md#deletePersonUsingGET) | **GET** /person/deletePerson/{name} | 删除人员信息
*DefaultApi* | [**deleteUserByIdUsingGET**](docs/DefaultApi.md#deleteUserByIdUsingGET) | **GET** /deleteUserById/{id} | 删除用户信息
*DefaultApi* | [**deleteUserGroupUsingGET**](docs/DefaultApi.md#deleteUserGroupUsingGET) | **GET** /deleteUserGroup/{groupName} | 删除用户组信息
*DefaultApi* | [**deleteUserGroupUsingGET1**](docs/DefaultApi.md#deleteUserGroupUsingGET1) | **GET** /deleteUserGroupById/{id} | 删除用户组信息
*DefaultApi* | [**deleteUserUsingGET**](docs/DefaultApi.md#deleteUserUsingGET) | **GET** /deleteUser/{userName} | 删除用户信息
*DefaultApi* | [**getCandidateTasksUsingGET**](docs/DefaultApi.md#getCandidateTasksUsingGET) | **GET** /getCandidateTasks/{userName} | 查询代办任务列表
*DefaultApi* | [**getLeaveInfoUsingGET**](docs/DefaultApi.md#getLeaveInfoUsingGET) | **GET** /getLeaveInfo/{id} | 查询单个请假任务
*DefaultApi* | [**getLeaveLogsUsingGET**](docs/DefaultApi.md#getLeaveLogsUsingGET) | **GET** /getLeaveLogs/{processId} | 查询审批日志信息
*DefaultApi* | [**getLeaveTasksUsingGET**](docs/DefaultApi.md#getLeaveTasksUsingGET) | **GET** /getLeaveTasks/{userName} | 查询自己的任务列表
*DefaultApi* | [**getPersonUsingGET**](docs/DefaultApi.md#getPersonUsingGET) | **GET** /person/getPerson/{name} | 查询单个人员信息
*DefaultApi* | [**getUserByIdUsingGET**](docs/DefaultApi.md#getUserByIdUsingGET) | **GET** /getUserById/{id} | 查询单个用户信息
*DefaultApi* | [**getUserGroupByIdUsingGET**](docs/DefaultApi.md#getUserGroupByIdUsingGET) | **GET** /getUserGroupById/{id} | 查询单个用户组信息
*DefaultApi* | [**getUserGroupUsingGET**](docs/DefaultApi.md#getUserGroupUsingGET) | **GET** /getUserGroup/{groupName} | 查询单个用户组信息
*DefaultApi* | [**getUserUsingGET**](docs/DefaultApi.md#getUserUsingGET) | **GET** /getUser/{userName} | 查询单个用户信息
*DefaultApi* | [**listPersonUsingGET**](docs/DefaultApi.md#listPersonUsingGET) | **GET** /person/listPerson | 查询所有人员信息
*DefaultApi* | [**listUserGroupUsingGET**](docs/DefaultApi.md#listUserGroupUsingGET) | **GET** /listUserGroup | 查询所有用户组信息
*DefaultApi* | [**listUserUsingGET**](docs/DefaultApi.md#listUserUsingGET) | **GET** /listUser | 查询所有用户信息
*DefaultApi* | [**loginUsingPOST**](docs/DefaultApi.md#loginUsingPOST) | **POST** /login | 用户验证
*DefaultApi* | [**test2UsingGET**](docs/DefaultApi.md#test2UsingGET) | **GET** /test2/{p1} | test2
*DefaultApi* | [**testUsingGET**](docs/DefaultApi.md#testUsingGET) | **GET** /leavetest | test
*DefaultApi* | [**testUsingGET1**](docs/DefaultApi.md#testUsingGET1) | **GET** /test/{p1} | test
*DefaultApi* | [**updateUserUsingPOST**](docs/DefaultApi.md#updateUserUsingPOST) | **POST** /updateUser | 修改单个用户信息
*DefaultApi* | [**updateUserUsingPOST1**](docs/DefaultApi.md#updateUserUsingPOST1) | **POST** /updateUserGroup | 修改单个用户组信息
*DefaultApi* | [**uploadTest2UsingPOST**](docs/DefaultApi.md#uploadTest2UsingPOST) | **POST** /uploadTest2 | uploadTest2
*DefaultApi* | [**uploadTestUsingPOST**](docs/DefaultApi.md#uploadTestUsingPOST) | **POST** /uploadTest | uploadTest
*ImageControllerApi* | [**downloadUsingGET**](docs/ImageControllerApi.md#downloadUsingGET) | **GET** /downloadTest | download
*ImageControllerApi* | [**uploadTest3UsingPOST**](docs/ImageControllerApi.md#uploadTest3UsingPOST) | **POST** /uploadTest3 | uploadTest3
*ImageControllerApi* | [**uploadTest4UsingPOST**](docs/ImageControllerApi.md#uploadTest4UsingPOST) | **POST** /uploadTest4 | uploadTest4


## Documentation for Models

 - [Group](docs/Group.md)
 - [Leave](docs/Leave.md)
 - [MyTask](docs/MyTask.md)
 - [Person](docs/Person.md)
 - [User](docs/User.md)
 - [UserGroup](docs/UserGroup.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

randy@163.com

