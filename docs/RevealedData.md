

# RevealedData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**value** | **String** | Decrypted value stored in the vault. |  [optional] |
|**classifiers** | **List&lt;String&gt;** | List of tags the value is classified with. |  [optional] |
|**aliases** | [**List&lt;Alias&gt;**](Alias.md) | List of aliases associated with the value. |  [optional] |
|**createdAt** | **OffsetDateTime** | Creation time, in UTC. |  [optional] |
|**storage** | [**StorageEnum**](#StorageEnum) | Storage medium to use.  VOLATILE results in data being persisted into an in-memory data store for one hour which is required for PCI compliant storage of card security code data.  |  [optional] |



## Enum: StorageEnum

| Name | Value |
|---- | -----|
| PERSISTENT | &quot;PERSISTENT&quot; |
| VOLATILE | &quot;VOLATILE&quot; |



