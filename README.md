# openapi-java-client

Vault HTTP API
- API version: 1.0.0
  - Build date: 2022-10-11T08:06:56.559215+01:00[Africa/Lagos]

The VGS Vault HTTP API is used for storing, retrieving, and managing sensitive data (aka Tokenization) within a VGS Vault.

The VGS API is organized around REST. Our API is built with a predictable resource-oriented structure, uses JSON-encoded requests and responses, follows standard HTTP verbs/responses, and uses industry standard authentication.

## What is VGS

Storing sensitive data on your company’s infrastructure often comes with a heavy compliance burden. For instance, storing payments data yourself greatly increases the amount of work needed to become PCI compliant. It also increases your security risk in general. To combat this, companies will minimize the amount of sensitive information they have to handle or store.

VGS provides multiple methods for minimizing the sensitive information that needs to be stored which allows customers to secure any type of data for any use-case.

**Tokenization** is a method that focuses on securing the storage of data. This is the quickest way to get started and is free. [Get started with Tokenization](https://www.verygoodsecurity.com/docs/tokenization/getting-started).

**Zero Data** is a unique method invented by VGS in 2016 that securely stores data like Tokenization, however it also removes the customer’s environment from PCI scope completely providing maximum security, and minimum compliance scope. [Get started with Zero Data](https://www.verygoodsecurity.com/docs/getting-started/before-you-start).

Additionally, for scenarios where neither technology is a complete solution, for instance with legacy systems, VGS provides a compliance product which guarantees customers are able to meet their compliance needs no matter what may happen. [Get started with Control](https://www.verygoodsecurity.com/docs/control).

## Learn about Tokenization

- [Create an Account for Free Tokenization](https://dashboard.verygoodsecurity.com/tokenization)
- [Try a Tokenization Demo](https://www.verygoodsecurity.com/docs/tokenization/getting-started)
- [Install a Tokenization SDK](https://www.verygoodsecurity.com/docs/tokenization/client-libraries)

### Authentication

This API uses `Basic` authentication and is implemented using industry best practices to ensure the security of the connection. Read more about [Identity and Access Management at VGS](https://www.verygoodsecurity.com/docs/vault/the-platform/iam)

Credentials to access the API can be generated on the
[dashboard](https://dashboard.verygoodsecurity.com) by going to the Settings
section of the vault of your choosing.

[Docs » Guides » Access credentials](https://www.verygoodsecurity.com/docs/settings/access-credentials)

## Resource Limits

### Data Limits

This API allows storing data up to 32MB in size.

### Rate Limiting

The API allows up to 3,000 requests per minute. Requests are associated with
the vault, regardless of the access credentials used to authenticate the
request.

Your current rate limit is included as HTTP headers in every API response:

| Header Name             | Description                                              |
|-------------------------|----------------------------------------------------------|
| `x-ratelimit-remaining` | The number of requests remaining in the 1-minute window. |

If you exceed the rate limit, the API will reject the request with HTTP
[429 Too Many Requests](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/429).

### Errors

The API uses standard HTTP status codes to indicate whether the request
succeeded or not.

In case of failure, the response body will be JSON in a predefined format.
For example, trying to create too many aliases at once results in the
following response:

```json
{
    \"errors\": [
        {
            \"status\": 400,
            \"title\": \"Bad request\",
            \"detail\": \"Too many values (limit: 20)\",
            \"href\": \"https://api.sandbox.verygoodvault.com/aliases\"
        }
    ]
}
```



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:1.0.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://api.sandbox.verygoodvault.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AliasesApi* | [**createAliases**](docs/AliasesApi.md#createAliases) | **POST** /aliases | Create aliases
*AliasesApi* | [**deleteAlias**](docs/AliasesApi.md#deleteAlias) | **DELETE** /aliases/{alias} | Delete alias
*AliasesApi* | [**revealAlias**](docs/AliasesApi.md#revealAlias) | **GET** /aliases/{alias} | Reveal single alias
*AliasesApi* | [**revealMultipleAliases**](docs/AliasesApi.md#revealMultipleAliases) | **GET** /aliases | Reveal multiple aliases
*AliasesApi* | [**updateAlias**](docs/AliasesApi.md#updateAlias) | **PUT** /aliases/{alias} | Update data classifiers


## Documentation for Models

 - [Alias](docs/Alias.md)
 - [AliasFormat](docs/AliasFormat.md)
 - [ApiError](docs/ApiError.md)
 - [CreateAliases201Response](docs/CreateAliases201Response.md)
 - [CreateAliasesRequest](docs/CreateAliasesRequest.md)
 - [CreateAliasesRequestDataInner](docs/CreateAliasesRequestDataInner.md)
 - [CreateAliasesRequestNew](docs/CreateAliasesRequestNew.md)
 - [CreateAliasesRequestReference](docs/CreateAliasesRequestReference.md)
 - [RevealAlias200Response](docs/RevealAlias200Response.md)
 - [RevealMultipleAliases200Response](docs/RevealMultipleAliases200Response.md)
 - [RevealMultipleAliasesDefaultResponse](docs/RevealMultipleAliasesDefaultResponse.md)
 - [RevealedData](docs/RevealedData.md)
 - [UpdateAliasRequest](docs/UpdateAliasRequest.md)
 - [UpdateAliasRequestData](docs/UpdateAliasRequestData.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@verygoodsecurity.com

