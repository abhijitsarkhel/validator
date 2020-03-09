package com.test.project.MavenEclipseProject;

import java.io.Serializable;
import java.util.Arrays;

import javax.validation.Valid;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.validation.annotation.Validated;

/**
 * The parent class for all request params for cache service.
 *
 */
//@Validated
@Valid
public class CacheServiceRequestParams implements Serializable
{

   /** The Constant serialVersionUID. */
   private static final long serialVersionUID = 5267390552851829677L;

   /** The orchestratorID id. */
   private String orchestratorID;

   /** The source. */
  // @SourceHeaderValueValidator
   private String source;

   /** The request type. */
   private String requestType;

   /** The client info. */
   private String clientInfo;

   /** The cache key. */
   private String cacheKey;

   /** The cache pattern. */
   private String cachePattern;

   /** The ttl. */
   private Long ttl;

   /** The content. */
   private byte[] content;

   /** The cache keys. */
   private String[] cacheKeys;

   /** The cache purge type. */
   private String cachePurgeType;

   /** The purge enabled. */
   private boolean purgeEnabled;

   /** The version. */
   private String version;

   /** The down stream cache client. */
   private String cacheDB;

   /** The client flavor. */
   private String cacheDBClient;

   /** The client deployment. */
   private String clientDeployment;

   /**
    * Instantiates a new cache service request params.
    */
   private CacheServiceRequestParams()
   {
      // Cannot instantiate.
   }

   /**
    * Gets the single instance of CacheServiceRequestParams.
    *
    * @return single instance of CacheServiceRequestParams
    */
   public static CacheServiceRequestParams getInstance()
   {
      return new CacheServiceRequestParams();
   }

   /**
    * With orchestrator ID.
    *
    * @param orchestratorID the orchestrator ID
    * @return the cache service request params
    */
   public CacheServiceRequestParams withOrchestratorID(final String orchestratorID)
   {
      this.setOrchestratorID(orchestratorID);
      return this;
   }

   /**
    * With source.
    *
    * @param source the source
    * @return the cache service request params
    */
   @SourceHeaderValueValidator
   public CacheServiceRequestParams withSource(final String source)
   {
      this.setSource(source);
      return this;
   }

   /**
    * With request type.
    *
    * @param requestType the request type
    * @return the cache service request params
    */
   public CacheServiceRequestParams withRequestType(final String requestType)
   {
      this.setRequestType(requestType);
      return this;
   }

   /**
    * With client info.
    *
    * @param clientInfo the client info
    * @return the cache service request params
    */
   public CacheServiceRequestParams withClientInfo(final String clientInfo)
   {
      this.setClientInfo(clientInfo);
      return this;
   }

   /**
    * With cache key.
    *
    * @param cacheKey the cache key
    * @return the cache service request params
    */
   public CacheServiceRequestParams withCacheKey(final String cacheKey)
   {
      this.setCacheKey(cacheKey);
      return this;
   }

   /**
    * With cache pattern.
    *
    * @param cachePattern the cache pattern
    * @return the cache service request params
    */
   public CacheServiceRequestParams withCachePattern(final String cachePattern)
   {
      this.setCachePattern(cachePattern);
      return this;
   }

   /**
    * With ttl.
    *
    * @param ttl the ttl
    * @return the cache service request params
    */
   public CacheServiceRequestParams withTtl(final Long ttl)
   {
      this.setTtl(ttl);
      return this;
   }

   /**
    * With content.
    *
    * @param content the content
    * @return the cache service request params
    */
   public CacheServiceRequestParams withContent(final byte[] content)
   {
      this.setContent(content);
      return this;
   }

   /**
    * With cache keys.
    *
    * @param cacheKeys the cache keys
    * @return the cache service request params
    */
   public CacheServiceRequestParams withCacheKeys(final String[] cacheKeys)
   {
      this.setCacheKeys(cacheKeys);
      return this;
   }

   /**
    * With cache purge type.
    *
    * @param cachePurgeType the cache purge type
    * @return the cache service request params
    */
   public CacheServiceRequestParams withCachePurgeType(final String cachePurgeType)
   {
      this.setCachePurgeType(cachePurgeType);
      return this;
   }

   /**
    * With purge enabled.
    *
    * @param purgeEnabled the purge enabled
    * @return the cache service request params
    */
   public CacheServiceRequestParams withPurgeEnabled(boolean purgeEnabled)
   {
      this.setPurgeEnabled(purgeEnabled);
      return this;
   }

   /**
    * With version.
    *
    * @param version the version
    * @return the cache service request params
    */
   public CacheServiceRequestParams withVersion(String version)
   {
      this.setVersion(version);
      return this;
   }

   /**
    * With cache client.
    *
    * @param cacheClient the cache client
    * @return the cache service request params
    */
   public CacheServiceRequestParams withCacheDB(String cacheDB)
   {
      this.setCacheDB(cacheDB);
      return this;
   }

   /**
    * With client flavor.
    *
    * @param clientFlavor the client flavor
    * @return the cache service request params
    */
   public CacheServiceRequestParams withCacheDBClient(String cacheDBClient)
   {
      this.setCacheDBClient(cacheDBClient);
      return this;
   }

   /**
    * With client deployment.
    *
    * @param clientDeployment the client deployment
    * @return the cache service request params
    */
   public CacheServiceRequestParams withClientDeployment(String clientDeployment)
   {
      this.setClientDeployment(clientDeployment);
      return this;
   }

   /**
    * Gets the request type.
    *
    * @return the request type
    */
   public String getRequestType()
   {
      return requestType;
   }

   /**
    * Gets the client info.
    *
    * @return the client info
    */
   public String getClientInfo()
   {
      return clientInfo;
   }

   /**
    * Gets the orchestrator ID.
    *
    * @return the orchestratorID
    */
   public String getOrchestratorID()
   {
      return orchestratorID;
   }

   /**
    * Gets the source.
    *
    * @return the source
    */
   public String getSource()
   {
      return source;
   }

   /**
    * Gets the cache key.
    *
    * @return the cache key
    */
   public String getCacheKey()
   {
      return cacheKey;
   }

   /**
    * Gets the cache pattern.
    *
    * @return the cache pattern
    */
   public String getCachePattern()
   {
      return cachePattern;
   }

   /**
    * Gets the ttl.
    *
    * @return the ttl
    */
   public Long getTtl()
   {
      return ttl;
   }

   /**
    * Gets the cache keys.
    *
    * @return the cache keys
    */
   public String[] getCacheKeys()
   {
      if (ArrayUtils.isEmpty(this.cacheKeys))
      {
         return new String[0];
      }
      return Arrays.copyOf(this.cacheKeys, this.cacheKeys.length);
   }

   /**
    * Gets the defensive copy of the content.
    *
    * @return the content
    */
   public byte[] getContent()
   {
      if (ArrayUtils.isEmpty(this.content))
      {
         return new byte[0];
      }
      return Arrays.copyOf(this.content, this.content.length);
   }

   /**
    * Gets the cache purge type.
    *
    * @return the cachePurgeType
    */
   public String getCachePurgeType()
   {
      return cachePurgeType;
   }

   /**
    * Checks if is purge enabled.
    *
    * @return the purgeEnabled
    */
   public boolean isPurgeEnabled()
   {
      return purgeEnabled;
   }

   /**
    * @return the version
    */
   public String getVersion()
   {
      return version;
   }

   /**
    * @return the cacheClient
    */
   public String getCacheDB()
   {
      return cacheDB;
   }

   /**
    * @return the clientFlavor
    */
   public String getCacheDBClient()
   {
      return cacheDBClient;
   }

   /**
    * @return the clientDeployment
    */
   public String getClientDeployment()
   {
      return clientDeployment;
   }

   /**
    * Sets the orchestrator ID.
    *
    * @param orchestratorID the orchestratorID to set
    */
   private void setOrchestratorID(String orchestratorID)
   {
      this.orchestratorID = orchestratorID;
   }

   /**
    * Sets the source.
    *
    * @param source the source to set
    */
   private void setSource(String source)
   {
      this.source = source;
   }

   /**
    * Sets the request type.
    *
    * @param requestType the requestType to set
    */
   private void setRequestType(String requestType)
   {
      this.requestType = requestType;
   }

   /**
    * Sets the client info.
    *
    * @param clientInfo the clientInfo to set
    */
   private void setClientInfo(String clientInfo)
   {
      this.clientInfo = clientInfo;
   }

   /**
    * Sets the cache key.
    *
    * @param cacheKey the cacheKey to set
    */
   private void setCacheKey(String cacheKey)
   {
      this.cacheKey = cacheKey;
   }

   /**
    * Sets the cache pattern.
    *
    * @param cachePattern the cachePattern to set
    */
   private void setCachePattern(String cachePattern)
   {
      this.cachePattern = cachePattern;
   }

   /**
    * Sets the ttl.
    *
    * @param ttl the ttl to set
    */
   private void setTtl(Long ttl)
   {
      this.ttl = ttl;
   }

   /**
    * Sets the content.
    *
    * @param content the content to set
    */
   private void setContent(byte[] content)
   {
      this.content = content;
   }

   /**
    * Sets the cache keys.
    *
    * @param cacheKeys the cacheKeys to set
    */
   private void setCacheKeys(String[] cacheKeys)
   {
      this.cacheKeys = cacheKeys;
   }

   /**
    * Sets the cache purge type.
    *
    * @param cachePurgeType the cachePurgeType to set
    */
   private void setCachePurgeType(String cachePurgeType)
   {
      this.cachePurgeType = cachePurgeType;
   }

   /**
    * Sets the purge enabled.
    *
    * @param purgeEnabled the purgeEnabled to set
    */
   private void setPurgeEnabled(boolean purgeEnabled)
   {
      this.purgeEnabled = purgeEnabled;
   }

   /**
    * @param version the version to set
    */
   private void setVersion(String version)
   {
      this.version = version;
   }

   /**
    * @param cacheClient the cacheClient to set
    */
   private void setCacheDB(String cacheDB)
   {
      this.cacheDB = cacheDB;
   }

   /**
    * @param clientFlavor the clientFlavor to set
    */
   private void setCacheDBClient(String cacheDBClient)
   {
      this.cacheDBClient = cacheDBClient;
   }

   /**
    * @param clientDeployment the clientDeployment to set
    */
   private void setClientDeployment(String clientDeployment)
   {
      this.clientDeployment = clientDeployment;
   }

   /*
    * (non-Javadoc)
    * 
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString()
   {
      return "CacheServiceRequestParams [orchestratorID=" + orchestratorID + ", source=" + source
         + ", requestType=" + requestType + ", clientInfo=" + clientInfo + ", cacheKey=" + cacheKey
         + ", cachePattern=" + cachePattern + ", ttl=" + ttl + ", content="
         + Arrays.toString(content) + ", cacheKeys=" + Arrays.toString(cacheKeys)
         + ", cachePurgeType=" + cachePurgeType + ", purgeEnabled=" + purgeEnabled + ", version="
         + version + ", cacheDB=" + cacheDB + ", cacheDBClient=" + cacheDBClient
         + ", clientDeployment=" + clientDeployment + "]";
   }

}