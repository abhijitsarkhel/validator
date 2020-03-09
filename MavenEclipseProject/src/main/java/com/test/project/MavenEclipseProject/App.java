package com.test.project.MavenEclipseProject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{

   /**
    * The main method.
    *
    * @param args the arguments
    */
   public static void main(String[] args)
   {
      SpringApplication.run(App.class, args);
      /*
       * String str = "1 x double room"; System.out.println("::" +
       * str.toLowerCase().split("x ")[1]);
       * 
       * ObjectMapper mapper = new ObjectMapper();
       * 
       * try { System.out.println("Hello World!"); String packageName = "com.amaresh";
       * 
       * File inputJson = new File("." + File.separator + "airport.json"); File outputPojoDirectory
       * = new File("." + File.separator + "convertedPojo"); outputPojoDirectory.mkdirs(); try { new
       * App().convert2JSON(inputJson.toURI().toURL(), outputPojoDirectory, packageName,
       * inputJson.getName().replace(".json", ""));
       * 
       * } catch (IOException e) {
       * 
       * // TODO Auto-generated catch block
       * 
       * System.out.println("Encountered issue while converting to pojo: " + e.getMessage());
       * 
       * e.printStackTrace();
       * 
       * } } catch (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); }
       */
      
      List<String> registryConfig = new ArrayList<>();
      
      registryConfig.add("PSC|resultsOnly|tuiuk-search-web");
      registryConfig.add("PSC|resultsOnly|tuiuk-search-retail");
      registryConfig.add("PSC|resultsOnly|tuiuk-deals-web");
      registryConfig.add("PSC|resultsOnly|tuiuk-deals-retail");
      registryConfig.add("PSC|resultsOnly|tuiuk-browse-web");
      registryConfig.add("PSC|resultsOnly|tuiuk-browse-retail");
      registryConfig.add("PSC|resultsOnly|tuinordic-search-web");
      registryConfig.add("PSC|resultsOnly|tuinordic-search-retail");
      registryConfig.add("PSC|resultsOnly|tuinordic-deals-web");
      registryConfig.add("PSC|resultsOnly|tuinordic-deals-retail");
      registryConfig.add("PSC|resultsOnly|tuinordic-browse-web");
      registryConfig.add("PSC|resultsOnly|tuinordic-browse-retail");
      registryConfig.add("ASC|resultsOnly|tuinordic-browse-retail");
      
      List<RegistryConfiguration> registryEntries = new ArrayList<>();
      for (final String eachEntry : registryConfig)
      {
         final String[] values = eachEntry.split("\\|");
         final RegistryConfiguration conf =
            new RegistryConfiguration(values[0], values[1], values[2]);
         registryEntries.add(conf);
      }
      
      CacheServiceRequestParams params = CacheServiceRequestParams.getInstance().withVersion("1.0").withSource("PSC");
      
      //System.out.println("registryEntries::" + registryEntries);
      
      Predicate<RegistryConfiguration> sourcePred = e -> e.getSource().equals("ASC");
      Predicate<RegistryConfiguration> requestTypePred = e -> e.getRequestType().equals("resultsOnly");
      Predicate<RegistryConfiguration> clientPred = e -> e.getClientInfo().equals("tuiuk-search-web");
      
      
      List<RegistryConfiguration> filteredRegistryBySource = registryEntries.stream()
               .filter(sourcePred)
               .collect(Collectors.toList());
      
      System.out.println("filteredRegistryBySource::"+ filteredRegistryBySource);
      
      List<RegistryConfiguration> filteredRegistryByRequestType = registryEntries.stream()
               .filter(requestTypePred)
               .collect(Collectors.toList());
      
      System.out.println("filteredRegistryByRequestType::"+ filteredRegistryByRequestType);
      
      /*
       * List<RegistryConfiguration> filteredRegistry = registryEntries.stream()
       * .filter(sourcePred.and(requestTypePred).and(clientPred)) .collect(Collectors.toList());
       * System.out.println("filteredRegistry::"+ filteredRegistry);
       */
   }

   /*
    * public void convert2JSON(URL inputJson, File outputPojoDirectory, String packageName, String
    * className) throws IOException {
    * 
    * JCodeModel codeModel = new JCodeModel();
    * 
    * URL source = inputJson;
    * 
    * GenerationConfig config = new DefaultGenerationConfig() {
    * 
    * @Override
    * 
    * public boolean isGenerateBuilders() { // set config option by overriding method
    * 
    * return true;
    * 
    * }
    * 
    * public SourceType getSourceType() {
    * 
    * return SourceType.JSON;
    * 
    * }
    * 
    * };
    * 
    * SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config),
    * new SchemaStore()), new SchemaGenerator());
    * 
    * mapper.generate(codeModel, className, packageName, source);
    * 
    * codeModel.build(outputPojoDirectory);
    * 
    * }
    */
}
