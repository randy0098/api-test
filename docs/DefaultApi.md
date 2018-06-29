# DefaultApi

All URIs are relative to *https://localhost:8091*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auditLeaveUsingPOST**](DefaultApi.md#auditLeaveUsingPOST) | **POST** /auditLeave | 审批请假申请
[**claimLeaveTaskUsingPOST**](DefaultApi.md#claimLeaveTaskUsingPOST) | **POST** /claimLeaveTask | 认领请假申请任务
[**createLeaveUsingPOST**](DefaultApi.md#createLeaveUsingPOST) | **POST** /createLeave | 请假申请
[**createPersonUsingPOST**](DefaultApi.md#createPersonUsingPOST) | **POST** /person/createPerson | 创建人员信息
[**createUserGroupUsingPOST**](DefaultApi.md#createUserGroupUsingPOST) | **POST** /createUserGroup | 创建用户组信息
[**createUserUsingPOST**](DefaultApi.md#createUserUsingPOST) | **POST** /createUser | 创建用户信息
[**deletePersonUsingGET**](DefaultApi.md#deletePersonUsingGET) | **GET** /person/deletePerson/{name} | 删除人员信息
[**deleteUserByIdUsingGET**](DefaultApi.md#deleteUserByIdUsingGET) | **GET** /deleteUserById/{id} | 删除用户信息
[**deleteUserGroupUsingGET**](DefaultApi.md#deleteUserGroupUsingGET) | **GET** /deleteUserGroup/{groupName} | 删除用户组信息
[**deleteUserGroupUsingGET1**](DefaultApi.md#deleteUserGroupUsingGET1) | **GET** /deleteUserGroupById/{id} | 删除用户组信息
[**deleteUserUsingGET**](DefaultApi.md#deleteUserUsingGET) | **GET** /deleteUser/{userName} | 删除用户信息
[**getCandidateTasksUsingGET**](DefaultApi.md#getCandidateTasksUsingGET) | **GET** /getCandidateTasks/{userName} | 查询代办任务列表
[**getLeaveInfoUsingGET**](DefaultApi.md#getLeaveInfoUsingGET) | **GET** /getLeaveInfo/{id} | 查询单个请假任务
[**getLeaveLogsUsingGET**](DefaultApi.md#getLeaveLogsUsingGET) | **GET** /getLeaveLogs/{processId} | 查询审批日志信息
[**getLeaveTasksUsingGET**](DefaultApi.md#getLeaveTasksUsingGET) | **GET** /getLeaveTasks/{userName} | 查询自己的任务列表
[**getPersonUsingGET**](DefaultApi.md#getPersonUsingGET) | **GET** /person/getPerson/{name} | 查询单个人员信息
[**getUserByIdUsingGET**](DefaultApi.md#getUserByIdUsingGET) | **GET** /getUserById/{id} | 查询单个用户信息
[**getUserGroupByIdUsingGET**](DefaultApi.md#getUserGroupByIdUsingGET) | **GET** /getUserGroupById/{id} | 查询单个用户组信息
[**getUserGroupUsingGET**](DefaultApi.md#getUserGroupUsingGET) | **GET** /getUserGroup/{groupName} | 查询单个用户组信息
[**getUserUsingGET**](DefaultApi.md#getUserUsingGET) | **GET** /getUser/{userName} | 查询单个用户信息
[**listPersonUsingGET**](DefaultApi.md#listPersonUsingGET) | **GET** /person/listPerson | 查询所有人员信息
[**listUserGroupUsingGET**](DefaultApi.md#listUserGroupUsingGET) | **GET** /listUserGroup | 查询所有用户组信息
[**listUserUsingGET**](DefaultApi.md#listUserUsingGET) | **GET** /listUser | 查询所有用户信息
[**loginUsingPOST**](DefaultApi.md#loginUsingPOST) | **POST** /login | 用户验证
[**test2UsingGET**](DefaultApi.md#test2UsingGET) | **GET** /test2/{p1} | test2
[**testUsingGET**](DefaultApi.md#testUsingGET) | **GET** /leavetest | test
[**testUsingGET1**](DefaultApi.md#testUsingGET1) | **GET** /test/{p1} | test
[**updateUserUsingPOST**](DefaultApi.md#updateUserUsingPOST) | **POST** /updateUser | 修改单个用户信息
[**updateUserUsingPOST1**](DefaultApi.md#updateUserUsingPOST1) | **POST** /updateUserGroup | 修改单个用户组信息
[**uploadTest2UsingPOST**](DefaultApi.md#uploadTest2UsingPOST) | **POST** /uploadTest2 | uploadTest2
[**uploadTestUsingPOST**](DefaultApi.md#uploadTestUsingPOST) | **POST** /uploadTest | uploadTest


<a name="auditLeaveUsingPOST"></a>
# **auditLeaveUsingPOST**
> MyTask auditLeaveUsingPOST(task)

审批请假申请

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
MyTask task = new MyTask(); // MyTask | 审批任务信息
try {
    MyTask result = apiInstance.auditLeaveUsingPOST(task);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#auditLeaveUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task** | [**MyTask**](MyTask.md)| 审批任务信息 |

### Return type

[**MyTask**](MyTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="claimLeaveTaskUsingPOST"></a>
# **claimLeaveTaskUsingPOST**
> String claimLeaveTaskUsingPOST(task)

认领请假申请任务

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
MyTask task = new MyTask(); // MyTask | 认领请假申请任务
try {
    String result = apiInstance.claimLeaveTaskUsingPOST(task);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#claimLeaveTaskUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task** | [**MyTask**](MyTask.md)| 认领请假申请任务 |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createLeaveUsingPOST"></a>
# **createLeaveUsingPOST**
> String createLeaveUsingPOST(leave)

请假申请

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Leave leave = new Leave(); // Leave | 请假信息
try {
    String result = apiInstance.createLeaveUsingPOST(leave);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createLeaveUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leave** | [**Leave**](Leave.md)| 请假信息 |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createPersonUsingPOST"></a>
# **createPersonUsingPOST**
> Person createPersonUsingPOST(person)

创建人员信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Person person = new Person(); // Person | 用户信息
try {
    Person result = apiInstance.createPersonUsingPOST(person);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createPersonUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **person** | [**Person**](Person.md)| 用户信息 |

### Return type

[**Person**](Person.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createUserGroupUsingPOST"></a>
# **createUserGroupUsingPOST**
> UserGroup createUserGroupUsingPOST(userGroup)

创建用户组信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UserGroup userGroup = new UserGroup(); // UserGroup | 用户组信息
try {
    UserGroup result = apiInstance.createUserGroupUsingPOST(userGroup);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createUserGroupUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroup** | [**UserGroup**](UserGroup.md)| 用户组信息 |

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createUserUsingPOST"></a>
# **createUserUsingPOST**
> User createUserUsingPOST(user, user1)

创建用户信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
User user = new User(); // User | user
User user1 = new User(); // User | 用户信息2
try {
    User result = apiInstance.createUserUsingPOST(user, user1);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)| user |
 **user1** | [**User**](User.md)| 用户信息2 |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deletePersonUsingGET"></a>
# **deletePersonUsingGET**
> String deletePersonUsingGET(name)

删除人员信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | 人员姓名
try {
    String result = apiInstance.deletePersonUsingGET(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deletePersonUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| 人员姓名 |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUserByIdUsingGET"></a>
# **deleteUserByIdUsingGET**
> String deleteUserByIdUsingGET(id)

删除用户信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | 用户组Id
try {
    String result = apiInstance.deleteUserByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteUserByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| 用户组Id |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUserGroupUsingGET"></a>
# **deleteUserGroupUsingGET**
> String deleteUserGroupUsingGET(groupName, userGroupName)

删除用户组信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String groupName = "groupName_example"; // String | groupName
String userGroupName = "userGroupName_example"; // String | 用户组名称
try {
    String result = apiInstance.deleteUserGroupUsingGET(groupName, userGroupName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteUserGroupUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**| groupName |
 **userGroupName** | **String**| 用户组名称 |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUserGroupUsingGET1"></a>
# **deleteUserGroupUsingGET1**
> String deleteUserGroupUsingGET1(id)

删除用户组信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | 用户组Id
try {
    String result = apiInstance.deleteUserGroupUsingGET1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteUserGroupUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| 用户组Id |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUserUsingGET"></a>
# **deleteUserUsingGET**
> String deleteUserUsingGET(userName)

删除用户信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userName = "userName_example"; // String | 用户姓名
try {
    String result = apiInstance.deleteUserUsingGET(userName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**| 用户姓名 |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getCandidateTasksUsingGET"></a>
# **getCandidateTasksUsingGET**
> List&lt;MyTask&gt; getCandidateTasksUsingGET(userName)

查询代办任务列表

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userName = "userName_example"; // String | 用户名
try {
    List<MyTask> result = apiInstance.getCandidateTasksUsingGET(userName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getCandidateTasksUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | [**String**](String.md)| 用户名 |

### Return type

[**List&lt;MyTask&gt;**](MyTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getLeaveInfoUsingGET"></a>
# **getLeaveInfoUsingGET**
> MyTask getLeaveInfoUsingGET(id)

查询单个请假任务

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 请假信息id
try {
    MyTask result = apiInstance.getLeaveInfoUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getLeaveInfoUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**String**](String.md)| 请假信息id |

### Return type

[**MyTask**](MyTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getLeaveLogsUsingGET"></a>
# **getLeaveLogsUsingGET**
> List&lt;MyTask&gt; getLeaveLogsUsingGET(processId)

查询审批日志信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String processId = "processId_example"; // String | processId
try {
    List<MyTask> result = apiInstance.getLeaveLogsUsingGET(processId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getLeaveLogsUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processId** | [**String**](String.md)| processId |

### Return type

[**List&lt;MyTask&gt;**](MyTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getLeaveTasksUsingGET"></a>
# **getLeaveTasksUsingGET**
> List&lt;MyTask&gt; getLeaveTasksUsingGET(userName)

查询自己的任务列表

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userName = "userName_example"; // String | 用户名
try {
    List<MyTask> result = apiInstance.getLeaveTasksUsingGET(userName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getLeaveTasksUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | [**String**](String.md)| 用户名 |

### Return type

[**List&lt;MyTask&gt;**](MyTask.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getPersonUsingGET"></a>
# **getPersonUsingGET**
> Person getPersonUsingGET(name)

查询单个人员信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String name = "name_example"; // String | 人员姓名
try {
    Person result = apiInstance.getPersonUsingGET(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getPersonUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| 人员姓名 |

### Return type

[**Person**](Person.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserByIdUsingGET"></a>
# **getUserByIdUsingGET**
> User getUserByIdUsingGET(id)

查询单个用户信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | 用户id
try {
    User result = apiInstance.getUserByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUserByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| 用户id |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserGroupByIdUsingGET"></a>
# **getUserGroupByIdUsingGET**
> UserGroup getUserGroupByIdUsingGET(id)

查询单个用户组信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | 用户组Id
try {
    UserGroup result = apiInstance.getUserGroupByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUserGroupByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| 用户组Id |

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserGroupUsingGET"></a>
# **getUserGroupUsingGET**
> UserGroup getUserGroupUsingGET(groupName)

查询单个用户组信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String groupName = "groupName_example"; // String | 用户组名称
try {
    UserGroup result = apiInstance.getUserGroupUsingGET(groupName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUserGroupUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupName** | **String**| 用户组名称 |

### Return type

[**UserGroup**](UserGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUserUsingGET"></a>
# **getUserUsingGET**
> User getUserUsingGET(userName)

查询单个用户信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userName = "userName_example"; // String | 用户姓名
try {
    User result = apiInstance.getUserUsingGET(userName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getUserUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**| 用户姓名 |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listPersonUsingGET"></a>
# **listPersonUsingGET**
> List&lt;Person&gt; listPersonUsingGET()

查询所有人员信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Person> result = apiInstance.listPersonUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listPersonUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Person&gt;**](Person.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUserGroupUsingGET"></a>
# **listUserGroupUsingGET**
> List&lt;UserGroup&gt; listUserGroupUsingGET()

查询所有用户组信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<UserGroup> result = apiInstance.listUserGroupUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listUserGroupUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserGroup&gt;**](UserGroup.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUserUsingGET"></a>
# **listUserUsingGET**
> List&lt;User&gt; listUserUsingGET()

查询所有用户信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<User> result = apiInstance.listUserUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listUserUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="loginUsingPOST"></a>
# **loginUsingPOST**
> User loginUsingPOST(user)

用户验证

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
User user = new User(); // User | 用户信息
try {
    User result = apiInstance.loginUsingPOST(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#loginUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)| 用户信息 |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="test2UsingGET"></a>
# **test2UsingGET**
> User test2UsingGET(p1)

test2

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String p1 = "p1_example"; // String | p1
try {
    User result = apiInstance.test2UsingGET(p1);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#test2UsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **p1** | **String**| p1 |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="testUsingGET"></a>
# **testUsingGET**
> Group testUsingGET()

test

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    Group result = apiInstance.testUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#testUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Group**](Group.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="testUsingGET1"></a>
# **testUsingGET1**
> testUsingGET1(p1)

test

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String p1 = "p1_example"; // String | p1
try {
    apiInstance.testUsingGET1(p1);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#testUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **p1** | **String**| p1 |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateUserUsingPOST"></a>
# **updateUserUsingPOST**
> updateUserUsingPOST(user)

修改单个用户信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
User user = new User(); // User | 用户信息
try {
    apiInstance.updateUserUsingPOST(user);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)| 用户信息 |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateUserUsingPOST1"></a>
# **updateUserUsingPOST1**
> updateUserUsingPOST1(userGroup)

修改单个用户组信息

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UserGroup userGroup = new UserGroup(); // UserGroup | 用户组信息
try {
    apiInstance.updateUserUsingPOST1(userGroup);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateUserUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userGroup** | [**UserGroup**](UserGroup.md)| 用户组信息 |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="uploadTest2UsingPOST"></a>
# **uploadTest2UsingPOST**
> Object uploadTest2UsingPOST(img)

uploadTest2

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
File img = new File("/path/to/file.txt"); // File | img
try {
    Object result = apiInstance.uploadTest2UsingPOST(img);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#uploadTest2UsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **img** | **File**| img |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="uploadTestUsingPOST"></a>
# **uploadTestUsingPOST**
> String uploadTestUsingPOST(files)

uploadTest

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
File files = new File("/path/to/file.txt"); // File | files
try {
    String result = apiInstance.uploadTestUsingPOST(files);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#uploadTestUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **files** | **File**| files |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

