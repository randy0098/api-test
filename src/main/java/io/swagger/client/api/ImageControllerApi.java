package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import javax.ws.rs.core.GenericType;

import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-29T18:21:08.489+08:00")
public class ImageControllerApi {
  private ApiClient apiClient;

  public ImageControllerApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ImageControllerApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * download
   * 
   * @param id id (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String downloadUsingGET(Integer id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling downloadUsingGET");
    }
    
    // create path and map variables
    String localVarPath = "/downloadTest";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));

    
    
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
   * uploadTest3
   * 
   * @param file file (optional)
   * @param content  (optional)
   * @param flag  (optional)
   * @param processInstanceId  (optional)
   * @param id  (optional)
   * @param targetId  (optional)
   * @param fileName  (optional)
   * @param extension  (optional)
   * @param file2  (optional)
   * @param purpose  (optional)
   * @param attribute  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String uploadTest3UsingPOST(File file, byte[] content, String flag, String processInstanceId, Integer id, String targetId, String fileName, String extension, File file2, String purpose, String attribute) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/uploadTest3";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "content", content));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "flag", flag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "processInstanceId", processInstanceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "targetId", targetId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fileName", fileName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "extension", extension));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "file", file2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "purpose", purpose));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "attribute", attribute));

    
    if (file != null)
      localVarFormParams.put("file", file);

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
  /**
   * uploadTest4
   * 
   * @param content  (optional)
   * @param flag  (optional)
   * @param processInstanceId  (optional)
   * @param id  (optional)
   * @param targetId  (optional)
   * @param fileName  (optional)
   * @param extension  (optional)
   * @param file  (optional)
   * @param purpose  (optional)
   * @param attribute  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String uploadTest4UsingPOST(byte[] content, String flag, String processInstanceId, Integer id, String targetId, String fileName, String extension, File file, String purpose, String attribute) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/uploadTest4";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "content", content));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "flag", flag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "processInstanceId", processInstanceId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "targetId", targetId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fileName", fileName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "extension", extension));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "file", file));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "purpose", purpose));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "attribute", attribute));

    
    
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
}
