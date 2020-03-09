package in.indigenous.validation.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * The Class SourceValidatorImpl.
 */
public class SourceValidatorImpl implements ConstraintValidator<SourceValidator, String> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.validation.ConstraintValidator#initialize(java.lang.annotation.
	 * Annotation)
	 */
	public void initialize(SourceValidator constraint) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.validation.ConstraintValidator#isValid(java.lang.Object,
	 * javax.validation.ConstraintValidatorContext)
	 */
	@Override
	public boolean isValid(String source, ConstraintValidatorContext context) {
		System.out.println("Trying to validate ... ");
		return false;
	}

}
