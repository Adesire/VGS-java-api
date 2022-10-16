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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Alias;

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
 * RevealedData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-11T08:06:56.559215+01:00[Africa/Lagos]")
public class RevealedData {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_CLASSIFIERS = "classifiers";
  @SerializedName(SERIALIZED_NAME_CLASSIFIERS)
  private List<String> classifiers = null;

  public static final String SERIALIZED_NAME_ALIASES = "aliases";
  @SerializedName(SERIALIZED_NAME_ALIASES)
  private List<Alias> aliases = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  /**
   * Storage medium to use.  VOLATILE results in data being persisted into an in-memory data store for one hour which is required for PCI compliant storage of card security code data. 
   */
  @JsonAdapter(StorageEnum.Adapter.class)
  public enum StorageEnum {
    PERSISTENT("PERSISTENT"),
    
    VOLATILE("VOLATILE");

    private String value;

    StorageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StorageEnum fromValue(String value) {
      for (StorageEnum b : StorageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StorageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StorageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StorageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StorageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STORAGE = "storage";
  @SerializedName(SERIALIZED_NAME_STORAGE)
  private StorageEnum storage = StorageEnum.PERSISTENT;

  public RevealedData() {
  }

  public RevealedData value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Decrypted value stored in the vault.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "122105155", value = "Decrypted value stored in the vault.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public RevealedData classifiers(List<String> classifiers) {
    
    this.classifiers = classifiers;
    return this;
  }

  public RevealedData addClassifiersItem(String classifiersItem) {
    if (this.classifiers == null) {
      this.classifiers = new ArrayList<>();
    }
    this.classifiers.add(classifiersItem);
    return this;
  }

   /**
   * List of tags the value is classified with.
   * @return classifiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of tags the value is classified with.")

  public List<String> getClassifiers() {
    return classifiers;
  }


  public void setClassifiers(List<String> classifiers) {
    this.classifiers = classifiers;
  }


  public RevealedData aliases(List<Alias> aliases) {
    
    this.aliases = aliases;
    return this;
  }

  public RevealedData addAliasesItem(Alias aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

   /**
   * List of aliases associated with the value.
   * @return aliases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of aliases associated with the value.")

  public List<Alias> getAliases() {
    return aliases;
  }


  public void setAliases(List<Alias> aliases) {
    this.aliases = aliases;
  }


  public RevealedData createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation time, in UTC.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-05-15T12:30:45Z", value = "Creation time, in UTC.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public RevealedData storage(StorageEnum storage) {
    
    this.storage = storage;
    return this;
  }

   /**
   * Storage medium to use.  VOLATILE results in data being persisted into an in-memory data store for one hour which is required for PCI compliant storage of card security code data. 
   * @return storage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Storage medium to use.  VOLATILE results in data being persisted into an in-memory data store for one hour which is required for PCI compliant storage of card security code data. ")

  public StorageEnum getStorage() {
    return storage;
  }


  public void setStorage(StorageEnum storage) {
    this.storage = storage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevealedData revealedData = (RevealedData) o;
    return Objects.equals(this.value, revealedData.value) &&
        Objects.equals(this.classifiers, revealedData.classifiers) &&
        Objects.equals(this.aliases, revealedData.aliases) &&
        Objects.equals(this.createdAt, revealedData.createdAt) &&
        Objects.equals(this.storage, revealedData.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, classifiers, aliases, createdAt, storage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevealedData {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    classifiers: ").append(toIndentedString(classifiers)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("classifiers");
    openapiFields.add("aliases");
    openapiFields.add("created_at");
    openapiFields.add("storage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RevealedData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RevealedData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RevealedData is not found in the empty JSON string", RevealedData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RevealedData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RevealedData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("classifiers") != null && !jsonObj.get("classifiers").isJsonNull()) && !jsonObj.get("classifiers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `classifiers` to be an array in the JSON string but got `%s`", jsonObj.get("classifiers").toString()));
      }
      if (jsonObj.get("aliases") != null && !jsonObj.get("aliases").isJsonNull()) {
        JsonArray jsonArrayaliases = jsonObj.getAsJsonArray("aliases");
        if (jsonArrayaliases != null) {
          // ensure the json data is an array
          if (!jsonObj.get("aliases").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `aliases` to be an array in the JSON string but got `%s`", jsonObj.get("aliases").toString()));
          }

          // validate the optional field `aliases` (array)
          for (int i = 0; i < jsonArrayaliases.size(); i++) {
            Alias.validateJsonObject(jsonArrayaliases.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("storage") != null && !jsonObj.get("storage").isJsonNull()) && !jsonObj.get("storage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `storage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("storage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RevealedData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RevealedData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RevealedData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RevealedData.class));

       return (TypeAdapter<T>) new TypeAdapter<RevealedData>() {
           @Override
           public void write(JsonWriter out, RevealedData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RevealedData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RevealedData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RevealedData
  * @throws IOException if the JSON string is invalid with respect to RevealedData
  */
  public static RevealedData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RevealedData.class);
  }

 /**
  * Convert an instance of RevealedData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

