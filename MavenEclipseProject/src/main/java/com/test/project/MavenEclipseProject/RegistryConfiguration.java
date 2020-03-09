package com.test.project.MavenEclipseProject;

/**
 * The Class RegistryConfiguration.
 */
public class RegistryConfiguration
{
   @Override
   public String toString()
   {
      StringBuilder builder = new StringBuilder();
      builder.append("RegistryConfiguration [source=").append(source).append(", requestType=")
         .append(requestType).append(", clientInfo=").append(clientInfo).append("]");
      return builder.toString();
   }

   /** The source. */
   private String source;

   /** The request type. */
   private String requestType;

   /** The client info. */
   private String clientInfo;

   /**
    * Instantiates a new registry configuration.
    *
    * @param source the source
    * @param requestType the request type
    * @param clientInfo the client info
    */
   public RegistryConfiguration(String source, String requestType, String clientInfo)
   {
      super();
      this.source = source;
      this.requestType = requestType;
      this.clientInfo = clientInfo;
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
}
