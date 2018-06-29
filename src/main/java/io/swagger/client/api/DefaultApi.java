package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import javax.ws.rs.core.GenericType;

import java.io.File;
import io.swagger.client.model.Group;
import io.swagger.client.model.Leave;
import io.swagger.client.model.MyTask;
import io.swagger.client.model.Person;
import io.swagger.client.model.User;
import io.swagger.client.model.UserGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-29T18:21:08.489+08:00")
public class DefaultApi {
  private ApiClient apiClient;

  public DefaultApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DefaultApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 审批请假申请
   * 
   * @param task 审批任务信息 (required)
   * @return MyTask
   * @throws ApiException if fails to make API call
   */
  public MyTask auditLeaveUsingPOST(MyTask task) throws ApiException {
    Object localVarPostBody = task;
    
    // verify the required parameter 'task' is set
    if (task == null) {
      throw new ApiException(400, "Missing the required parameter 'task' when calling auditLeaveUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/auditLeave";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<MyTask> localVarReturnType = new GenericType<MyTask>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 认领请假申请任务
   * 
   * @param task 认领请假申请任务 (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String claimLeaveTaskUsingPOST(MyTask task) throws ApiException {
    Object localVarPostBody = task;
    
    // verify the required parameter 'task' is set
    if (task == null) {
      throw new ApiException(400, "Missing the required parameter 'task' when calling claimLeaveTaskUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/claimLeaveTask";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 请假申请
   * 
   * @param leave 请假信息 (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String createLeaveUsingPOST(Leave leave) throws ApiException {
    Object localVarPostBody = leave;
    
    // verify the required parameter 'leave' is set
    if (leave == null) {
      throw new ApiException(400, "Missing the required parameter 'leave' when calling createLeaveUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/createLeave";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 创建人员信息
   * 
   * @param person 用户信息 (required)
   * @return Person
   * @throws ApiException if fails to make API call
   */
  public Person createPersonUsingPOST(Person person) throws ApiException {
    Object localVarPostBody = person;
    
    // verify the required parameter 'person' is set
    if (person == null) {
      throw new ApiException(400, "Missing the required parameter 'person' when calling createPersonUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/person/createPerson";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Person> localVarReturnType = new GenericType<Person>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 创建用户组信息
   * 
   * @param userGroup 用户组信息 (required)
   * @return UserGroup
   * @throws ApiException if fails to make API call
   */
  public UserGroup createUserGroupUsingPOST(UserGroup userGroup) throws ApiException {
    Object localVarPostBody = userGroup;
    
    // verify the required parameter 'userGroup' is set
    if (userGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'userGroup' when calling createUserGroupUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/createUserGroup";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<UserGroup> localVarReturnType = new GenericType<UserGroup>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 创建用户信息
   * 
   * @param user user (required)
   * @param user1 用户信息2 (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User createUserUsingPOST(User user, User user1) throws ApiException {
    Object localVarPostBody = user1;
    
    // verify the required parameter 'user' is set
    if (user == null) {
      throw new ApiException(400, "Missing the required parameter 'user' when calling createUserUsingPOST");
    }
    
    // verify the required parameter 'user1' is set
    if (user1 == null) {
      throw new ApiException(400, "Missing the required parameter 'user1' when calling createUserUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/createUser";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 删除人员信息
   * 
   * @param name 人员姓名 (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deletePersonUsingGET(String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling deletePersonUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/person/deletePerson/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 删除用户信息
   * 
   * @param id 用户组Id (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteUserByIdUsingGET(Integer id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteUserByIdUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/deleteUserById/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 删除用户组信息
   * 
   * @param groupName groupName (required)
   * @param userGroupName 用户组名称 (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteUserGroupUsingGET(String groupName, String userGroupName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupName' is set
    if (groupName == null) {
      throw new ApiException(400, "Missing the required parameter 'groupName' when calling deleteUserGroupUsingGET");
    }
    
    // verify the required parameter 'userGroupName' is set
    if (userGroupName == null) {
      throw new ApiException(400, "Missing the required parameter 'userGroupName' when calling deleteUserGroupUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/deleteUserGroup/{groupName}"
      .replaceAll("\\{" + "groupName" + "\\}", apiClient.escapeString(groupName.toString()))
      .replaceAll("\\{" + "userGroupName" + "\\}", apiClient.escapeString(userGroupName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 删除用户组信息
   * 
   * @param id 用户组Id (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteUserGroupUsingGET1(Integer id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteUserGroupUsingGET1");
    }
    
    // create path and map variables
    String localVarPath = "/deleteUserGroupById/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 删除用户信息
   * 
   * @param userName 用户姓名 (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String deleteUserUsingGET(String userName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userName' is set
    if (userName == null) {
      throw new ApiException(400, "Missing the required parameter 'userName' when calling deleteUserUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/deleteUser/{userName}"
      .replaceAll("\\{" + "userName" + "\\}", apiClient.escapeString(userName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 查询代办任务列表
   * 
   * @param userName 用户名 (required)
   * @return List&lt;MyTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MyTask> getCandidateTasksUsingGET(String userName) throws ApiException {
    Object localVarPostBody = userName;
    
    // verify the required parameter 'userName' is set
    if (userName == null) {
      throw new ApiException(400, "Missing the required parameter 'userName' when calling getCandidateTasksUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/getCandidateTasks/{userName}";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MyTask>> localVarReturnType = new GenericType<List<MyTask>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 查询单个请假任务
   * 
   * @param id 请假信息id (required)
   * @return MyTask
   * @throws ApiException if fails to make API call
   */
  public MyTask getLeaveInfoUsingGET(String id) throws ApiException {
    Object localVarPostBody = id;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getLeaveInfoUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/getLeaveInfo/{id}";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<MyTask> localVarReturnType = new GenericType<MyTask>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 查询审批日志信息
   * 
   * @param processId processId (required)
   * @return List&lt;MyTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MyTask> getLeaveLogsUsingGET(String processId) throws ApiException {
    Object localVarPostBody = processId;
    
    // verify the required parameter 'processId' is set
    if (processId == null) {
      throw new ApiException(400, "Missing the required parameter 'processId' when calling getLeaveLogsUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/getLeaveLogs/{processId}";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MyTask>> localVarReturnType = new GenericType<List<MyTask>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 查询自己的任务列表
   * 
   * @param userName 用户名 (required)
   * @return List&lt;MyTask&gt;
   * @throws ApiException if fails to make API call
   */
  public List<MyTask> getLeaveTasksUsingGET(String userName) throws ApiException {
    Object localVarPostBody = userName;
    
    // verify the required parameter 'userName' is set
    if (userName == null) {
      throw new ApiException(400, "Missing the required parameter 'userName' when calling getLeaveTasksUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/getLeaveTasks/{userName}";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<MyTask>> localVarReturnType = new GenericType<List<MyTask>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 查询单个人员信息
   * 
   * @param name 人员姓名 (required)
   * @return Person
   * @throws ApiException if fails to make API call
   */
  public Person getPersonUsingGET(String name) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling getPersonUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/person/getPerson/{name}"
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Person> localVarReturnType = new GenericType<Person>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 查询单个用户信息
   * 
   * @param id 用户id (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUserByIdUsingGET(Integer id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getUserByIdUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/getUserById/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 查询单个用户组信息
   * 
   * @param id 用户组Id (required)
   * @return UserGroup
   * @throws ApiException if fails to make API call
   */
  public UserGroup getUserGroupByIdUsingGET(Integer id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getUserGroupByIdUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/getUserGroupById/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<UserGroup> localVarReturnType = new GenericType<UserGroup>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 查询单个用户组信息
   * 
   * @param groupName 用户组名称 (required)
   * @return UserGroup
   * @throws ApiException if fails to make API call
   */
  public UserGroup getUserGroupUsingGET(String groupName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'groupName' is set
    if (groupName == null) {
      throw new ApiException(400, "Missing the required parameter 'groupName' when calling getUserGroupUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/getUserGroup/{groupName}"
      .replaceAll("\\{" + "groupName" + "\\}", apiClient.escapeString(groupName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<UserGroup> localVarReturnType = new GenericType<UserGroup>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 查询单个用户信息
   * 
   * @param userName 用户姓名 (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUserUsingGET(String userName) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userName' is set
    if (userName == null) {
      throw new ApiException(400, "Missing the required parameter 'userName' when calling getUserUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/getUser/{userName}"
      .replaceAll("\\{" + "userName" + "\\}", apiClient.escapeString(userName.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 查询所有人员信息
   * 
   * @return List&lt;Person&gt;
   * @throws ApiException if fails to make API call
   */
  public List<Person> listPersonUsingGET() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/person/listPerson";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Person>> localVarReturnType = new GenericType<List<Person>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 查询所有用户组信息
   * 
   * @return List&lt;UserGroup&gt;
   * @throws ApiException if fails to make API call
   */
  public List<UserGroup> listUserGroupUsingGET() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/listUserGroup";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<UserGroup>> localVarReturnType = new GenericType<List<UserGroup>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 查询所有用户信息
   * 
   * @return List&lt;User&gt;
   * @throws ApiException if fails to make API call
   */
  public List<User> listUserUsingGET() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/listUser";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<User>> localVarReturnType = new GenericType<List<User>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 用户验证
   * 
   * @param user 用户信息 (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User loginUsingPOST(User user) throws ApiException {
    Object localVarPostBody = user;
    
    // verify the required parameter 'user' is set
    if (user == null) {
      throw new ApiException(400, "Missing the required parameter 'user' when calling loginUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/login";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * test2
   * 
   * @param p1 p1 (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User test2UsingGET(String p1) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'p1' is set
    if (p1 == null) {
      throw new ApiException(400, "Missing the required parameter 'p1' when calling test2UsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/test2/{p1}"
      .replaceAll("\\{" + "p1" + "\\}", apiClient.escapeString(p1.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * test
   * 
   * @return Group
   * @throws ApiException if fails to make API call
   */
  public Group testUsingGET() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/leavetest";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Group> localVarReturnType = new GenericType<Group>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * test
   * 
   * @param p1 p1 (required)
   * @throws ApiException if fails to make API call
   */
  public void testUsingGET1(String p1) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'p1' is set
    if (p1 == null) {
      throw new ApiException(400, "Missing the required parameter 'p1' when calling testUsingGET1");
    }
    
    // create path and map variables
    String localVarPath = "/test/{p1}"
      .replaceAll("\\{" + "p1" + "\\}", apiClient.escapeString(p1.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 修改单个用户信息
   * 
   * @param user 用户信息 (required)
   * @throws ApiException if fails to make API call
   */
  public void updateUserUsingPOST(User user) throws ApiException {
    Object localVarPostBody = user;
    
    // verify the required parameter 'user' is set
    if (user == null) {
      throw new ApiException(400, "Missing the required parameter 'user' when calling updateUserUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/updateUser";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * 修改单个用户组信息
   * 
   * @param userGroup 用户组信息 (required)
   * @throws ApiException if fails to make API call
   */
  public void updateUserUsingPOST1(UserGroup userGroup) throws ApiException {
    Object localVarPostBody = userGroup;
    
    // verify the required parameter 'userGroup' is set
    if (userGroup == null) {
      throw new ApiException(400, "Missing the required parameter 'userGroup' when calling updateUserUsingPOST1");
    }
    
    // create path and map variables
    String localVarPath = "/updateUserGroup";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * uploadTest2
   * 
   * @param img img (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object uploadTest2UsingPOST(File img) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'img' is set
    if (img == null) {
      throw new ApiException(400, "Missing the required parameter 'img' when calling uploadTest2UsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/uploadTest2";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (img != null)
      localVarFormParams.put("img", img);

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * uploadTest
   * 
   * @param files files (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String uploadTestUsingPOST(File files) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'files' is set
    if (files == null) {
      throw new ApiException(400, "Missing the required parameter 'files' when calling uploadTestUsingPOST");
    }
    
    // create path and map variables
    String localVarPath = "/uploadTest";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (files != null)
      localVarFormParams.put("files", files);

    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
