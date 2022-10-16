/*
 * Vault HTTP API
 * The VGS Vault HTTP API is used for storing, retrieving, and managing sensitive data (aka Tokenization) within a VGS Vault.  The VGS API is organized around REST. Our API is built with a predictable resource-oriented structure, uses JSON-encoded requests and responses, follows standard HTTP verbs/responses, and uses industry standard authentication.  ## What is VGS  Storing sensitive data on your company’s infrastructure often comes with a heavy compliance burden. For instance, storing payments data yourself greatly increases the amount of work needed to become PCI compliant. It also increases your security risk in general. To combat this, companies will minimize the amount of sensitive information they have to handle or store.  VGS provides multiple methods for minimizing the sensitive information that needs to be stored which allows customers to secure any type of data for any use-case.  **Tokenization** is a method that focuses on securing the storage of data. This is the quickest way to get started and is free. [Get started with Tokenization](https://www.verygoodsecurity.com/docs/tokenization/getting-started).  **Zero Data** is a unique method invented by VGS in 2016 that securely stores data like Tokenization, however it also removes the customer’s environment from PCI scope completely providing maximum security, and minimum compliance scope. [Get started with Zero Data](https://www.verygoodsecurity.com/docs/getting-started/before-you-start).  Additionally, for scenarios where neither technology is a complete solution, for instance with legacy systems, VGS provides a compliance product which guarantees customers are able to meet their compliance needs no matter what may happen. [Get started with Control](https://www.verygoodsecurity.com/docs/control).  ## Learn about Tokenization  - [Create an Account for Free Tokenization](https://dashboard.verygoodsecurity.com/tokenization) - [Try a Tokenization Demo](https://www.verygoodsecurity.com/docs/tokenization/getting-started) - [Install a Tokenization SDK](https://www.verygoodsecurity.com/docs/tokenization/client-libraries)  ### Authentication  This API uses `Basic` authentication and is implemented using industry best practices to ensure the security of the connection. Read more about [Identity and Access Management at VGS](https://www.verygoodsecurity.com/docs/vault/the-platform/iam)  Credentials to access the API can be generated on the [dashboard](https://dashboard.verygoodsecurity.com) by going to the Settings section of the vault of your choosing.  [Docs » Guides » Access credentials](https://www.verygoodsecurity.com/docs/settings/access-credentials)  ## Resource Limits  ### Data Limits  This API allows storing data up to 32MB in size.  ### Rate Limiting  The API allows up to 3,000 requests per minute. Requests are associated with the vault, regardless of the access credentials used to authenticate the request.  Your current rate limit is included as HTTP headers in every API response:  | Header Name             | Description                                              | |-------------------------|----------------------------------------------------------| | `x-ratelimit-remaining` | The number of requests remaining in the 1-minute window. |  If you exceed the rate limit, the API will reject the request with HTTP [429 Too Many Requests](https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/429).  ### Errors  The API uses standard HTTP status codes to indicate whether the request succeeded or not.  In case of failure, the response body will be JSON in a predefined format. For example, trying to create too many aliases at once results in the following response:  ```json {     \"errors\": [         {             \"status\": 400,             \"title\": \"Bad request\",             \"detail\": \"Too many values (limit: 20)\",             \"href\": \"https://api.sandbox.verygoodvault.com/aliases\"         }     ] } ``` 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@verygoodsecurity.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.RevealedData;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CreateAliases201Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-11T08:06:56.559215+01:00[Africa/Lagos]")
public class CreateAliases201Response {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<RevealedData> data = null;

  public CreateAliases201Response() {
  }

  public CreateAliases201Response data(List<RevealedData> data) {
    
    this.data = data;
    return this;
  }

  public CreateAliases201Response addDataItem(RevealedData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of stored values along with their aliases.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of stored values along with their aliases.")

  public List<RevealedData> getData() {
    return data;
  }


  public void setData(List<RevealedData> data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAliases201Response createAliases201Response = (CreateAliases201Response) o;
    return Objects.equals(this.data, createAliases201Response.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAliases201Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateAliases201Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateAliases201Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateAliases201Response is not found in the empty JSON string", CreateAliases201Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateAliases201Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateAliases201Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        JsonArray jsonArraydata = jsonObj.getAsJsonArray("data");
        if (jsonArraydata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("data").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `data` to be an array in the JSON string but got `%s`", jsonObj.get("data").toString()));
          }

          // validate the optional field `data` (array)
          for (int i = 0; i < jsonArraydata.size(); i++) {
            RevealedData.validateJsonObject(jsonArraydata.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateAliases201Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateAliases201Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateAliases201Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateAliases201Response.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateAliases201Response>() {
           @Override
           public void write(JsonWriter out, CreateAliases201Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateAliases201Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateAliases201Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateAliases201Response
  * @throws IOException if the JSON string is invalid with respect to CreateAliases201Response
  */
  public static CreateAliases201Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateAliases201Response.class);
  }

 /**
  * Convert an instance of CreateAliases201Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
