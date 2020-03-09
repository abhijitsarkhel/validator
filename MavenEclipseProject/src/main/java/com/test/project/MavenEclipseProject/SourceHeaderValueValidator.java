/**
 * 
 */
package com.test.project.MavenEclipseProject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @author amaresh.d
 *
 */
@Target({ElementType.FIELD, ElementType.METHOD,ElementType.PARAMETER,ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DefaultSourceHeaderValidator.class)
public @interface SourceHeaderValueValidator
{
   String message() default "Invalid Source in header.";

   Class<?>[] groups() default {};

   Class<? extends Payload>[] payload() default {};
}
