

# CreateAliasesRequestNew


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **String** | Raw value to encrypt &amp; store in the vault. |  |
|**classifiers** | **List&lt;String&gt;** | List of tags to classify the value with. |  [optional] |
|**format** | **AliasFormat** |  |  |
|**storage** | [**StorageEnum**](#StorageEnum) | Storage medium to use.  VOLATILE results in data being persisted into an in-memory data store for one hour which is required for PCI compliant storage of card security code data.  |  [optional] |



## Enum: StorageEnum

| Name | Value |
|---- | -----|
| PERSISTENT | &quot;PERSISTENT&quot; |
| VOLATILE | &quot;VOLATILE&quot; |



