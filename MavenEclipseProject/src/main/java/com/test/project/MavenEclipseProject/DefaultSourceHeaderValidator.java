package com.test.project.MavenEclipseProject;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * The Class DefaultSourceHeaderValidator.
 */
public class DefaultSourceHeaderValidator implements ConstraintValidator<SourceHeaderValueValidator, CacheServiceRequestParams>
{

   /**
    * Checks if is valid registry configuration.
    *
    * @param source the source
    * @return true, if is valid registry configuration
    */
   public boolean isValidRegistryConfiguration(final String source, String version)
   {
     System.out.println("I am valid");
      return true;
   }

   @Override
   public boolean isValid(final CacheServiceRequestParams params, final ConstraintValidatorContext context)
   {
      System.out.println("************************************ invoked");
      return isValidRegistryConfiguration(params.getSource(), params.getVersion());
   }
   
   @Override
   public void initialize(SourceHeaderValueValidator constraintAnnotation)
   {
      ConstraintValidator.super.initialize(constraintAnnotation);
   }
}