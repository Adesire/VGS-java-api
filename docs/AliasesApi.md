# AliasesApi

All URIs are relative to *https://api.sandbox.verygoodvault.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAliases**](AliasesApi.md#createAliases) | **POST** /aliases | Create aliases |
| [**deleteAlias**](AliasesApi.md#deleteAlias) | **DELETE** /aliases/{alias} | Delete alias |
| [**revealAlias**](AliasesApi.md#revealAlias) | **GET** /aliases/{alias} | Reveal single alias |
| [**revealMultipleAliases**](AliasesApi.md#revealMultipleAliases) | **GET** /aliases | Reveal multiple aliases |
| [**updateAlias**](AliasesApi.md#updateAlias) | **PUT** /aliases/{alias} | Update data classifiers |


<a name="createAliases"></a>
# **createAliases**
> CreateAliases201Response createAliases(createAliasesRequest)

Create aliases

Stores multiple values at once &amp; returns their aliases.  Alternatively, this endpoint may be used to associate additional (i.e. secondary) aliases with the same underlying data as the reference alias specified in the request body.  **NOTE:** You cannot reference the same alias more than once in a single request. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AliasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.verygoodvault.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AliasesApi apiInstance = new AliasesApi(defaultClient);
    CreateAliasesRequest createAliasesRequest = new CreateAliasesRequest(); // CreateAliasesRequest | 
    try {
      CreateAliases201Response result = apiInstance.createAliases(createAliasesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasesApi#createAliases");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createAliasesRequest** | [**CreateAliasesRequest**](CreateAliasesRequest.md)|  | [optional] |

### Return type

[**CreateAliases201Response**](CreateAliases201Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | Something went wrong |  -  |

<a name="deleteAlias"></a>
# **deleteAlias**
> deleteAlias(alias)

Delete alias

Removes a single alias. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AliasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.verygoodvault.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AliasesApi apiInstance = new AliasesApi(defaultClient);
    String alias = "tok_sandbox_bhtsCwFUzoJMw9rWUfEV5e"; // String | Alias to operate on.
    try {
      apiInstance.deleteAlias(alias);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasesApi#deleteAlias");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alias** | **String**| Alias to operate on. | |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **0** | Something went wrong |  -  |

<a name="revealAlias"></a>
# **revealAlias**
> RevealAlias200Response revealAlias(alias)

Reveal single alias

Retrieves a stored value along with its aliases.  **NOTE:** This endpoint may expose sensitive data. Therefore, it is disabled by default. To enable it, please contact your VGS account manager or drop us a line at [support@verygoodsecurity.com](mailto:support@verygoodsecurity.com). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AliasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.verygoodvault.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AliasesApi apiInstance = new AliasesApi(defaultClient);
    String alias = "tok_sandbox_bhtsCwFUzoJMw9rWUfEV5e"; // String | Alias to operate on.
    try {
      RevealAlias200Response result = apiInstance.revealAlias(alias);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasesApi#revealAlias");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alias** | **String**| Alias to operate on. | |

### Return type

[**RevealAlias200Response**](RevealAlias200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Something went wrong |  -  |

<a name="revealMultipleAliases"></a>
# **revealMultipleAliases**
> RevealMultipleAliases200Response revealMultipleAliases(q)

Reveal multiple aliases

Given a list of aliases, retrieves all associated values stored in the vault.  **NOTE:** This endpoint may expose sensitive data. Therefore, it is disabled by default. To enable it, please contact your VGS account manager or drop us a line at [support@verygoodsecurity.com](mailto:support@verygoodsecurity.com). 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AliasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.verygoodvault.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AliasesApi apiInstance = new AliasesApi(defaultClient);
    String q = "[\"tok_sandbox_5UpnbMvaihRuRwz5QXwBFw,tok_sandbox_9ToiJHedw1nE1Jfx1qYYgz\"]"; // String | Comma-separated list of aliases to reveal.
    try {
      RevealMultipleAliases200Response result = apiInstance.revealMultipleAliases(q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasesApi#revealMultipleAliases");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **q** | **String**| Comma-separated list of aliases to reveal. | |

### Return type

[**RevealMultipleAliases200Response**](RevealMultipleAliases200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Something went wrong |  -  |

<a name="updateAlias"></a>
# **updateAlias**
> updateAlias(alias, updateAliasRequest)

Update data classifiers

Apply new classifiers to the value that the specified alias is associated with. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AliasesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sandbox.verygoodvault.com");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AliasesApi apiInstance = new AliasesApi(defaultClient);
    String alias = "tok_sandbox_bhtsCwFUzoJMw9rWUfEV5e"; // String | Alias to operate on.
    UpdateAliasRequest updateAliasRequest = new UpdateAliasRequest(); // UpdateAliasRequest | 
    try {
      apiInstance.updateAlias(alias, updateAliasRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling AliasesApi#updateAlias");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alias** | **String**| Alias to operate on. | |
| **updateAliasRequest** | [**UpdateAliasRequest**](UpdateAliasRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **0** | Something went wrong |  -  |

