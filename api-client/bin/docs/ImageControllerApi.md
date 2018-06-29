# ImageControllerApi

All URIs are relative to *https://localhost:8091*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadUsingGET**](ImageControllerApi.md#downloadUsingGET) | **GET** /downloadTest | download
[**uploadTest3UsingPOST**](ImageControllerApi.md#uploadTest3UsingPOST) | **POST** /uploadTest3 | uploadTest3
[**uploadTest4UsingPOST**](ImageControllerApi.md#uploadTest4UsingPOST) | **POST** /uploadTest4 | uploadTest4


<a name="downloadUsingGET"></a>
# **downloadUsingGET**
> String downloadUsingGET(id)

download

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ImageControllerApi;


ImageControllerApi apiInstance = new ImageControllerApi();
Integer id = 56; // Integer | id
try {
    String result = apiInstance.downloadUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageControllerApi#downloadUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| id |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="uploadTest3UsingPOST"></a>
# **uploadTest3UsingPOST**
> String uploadTest3UsingPOST(file, content, flag, processInstanceId, id, targetId, fileName, extension, file2, purpose, attribute)

uploadTest3

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ImageControllerApi;


ImageControllerApi apiInstance = new ImageControllerApi();
File file = new File("/path/to/file.txt"); // File | file
byte[] content = B; // byte[] | 
String flag = "flag_example"; // String | 
String processInstanceId = "processInstanceId_example"; // String | 
Integer id = 56; // Integer | 
String targetId = "targetId_example"; // String | 
String fileName = "fileName_example"; // String | 
String extension = "extension_example"; // String | 
File file2 = new File("/path/to/file.txt"); // File | 
String purpose = "purpose_example"; // String | 
String attribute = "attribute_example"; // String | 
try {
    String result = apiInstance.uploadTest3UsingPOST(file, content, flag, processInstanceId, id, targetId, fileName, extension, file2, purpose, attribute);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageControllerApi#uploadTest3UsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| file | [optional]
 **content** | **byte[]**|  | [optional]
 **flag** | **String**|  | [optional]
 **processInstanceId** | **String**|  | [optional]
 **id** | **Integer**|  | [optional]
 **targetId** | **String**|  | [optional]
 **fileName** | **String**|  | [optional]
 **extension** | **String**|  | [optional]
 **file2** | **File**|  | [optional]
 **purpose** | **String**|  | [optional]
 **attribute** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="uploadTest4UsingPOST"></a>
# **uploadTest4UsingPOST**
> String uploadTest4UsingPOST(content, flag, processInstanceId, id, targetId, fileName, extension, file, purpose, attribute)

uploadTest4

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ImageControllerApi;


ImageControllerApi apiInstance = new ImageControllerApi();
byte[] content = B; // byte[] | 
String flag = "flag_example"; // String | 
String processInstanceId = "processInstanceId_example"; // String | 
Integer id = 56; // Integer | 
String targetId = "targetId_example"; // String | 
String fileName = "fileName_example"; // String | 
String extension = "extension_example"; // String | 
File file = new File("/path/to/file.txt"); // File | 
String purpose = "purpose_example"; // String | 
String attribute = "attribute_example"; // String | 
try {
    String result = apiInstance.uploadTest4UsingPOST(content, flag, processInstanceId, id, targetId, fileName, extension, file, purpose, attribute);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageControllerApi#uploadTest4UsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **content** | **byte[]**|  | [optional]
 **flag** | **String**|  | [optional]
 **processInstanceId** | **String**|  | [optional]
 **id** | **Integer**|  | [optional]
 **targetId** | **String**|  | [optional]
 **fileName** | **String**|  | [optional]
 **extension** | **String**|  | [optional]
 **file** | **File**|  | [optional]
 **purpose** | **String**|  | [optional]
 **attribute** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

