package in.indigenous.validation.model;

import javax.validation.Valid;

import in.indigenous.validation.validators.SourceValidator;


@Valid
public class RequestParams {

	/** The version. */
	private String version;

	/** The source. */
	private String source;
	
	/**
	 * Instantiates a new request params.
	 */
	public RequestParams()  {
		
	}

	
	/**
	 * With version.
	 *
	 * @param version the version
	 * @return the request params
	 */
	public RequestParams withVersion(String version) {
		this.setVersion(version);
		return this;
	}
	
	/**
	 * With source.
	 *
	 * @param source the source
	 * @return the request params
	 */
	@SourceValidator
	public RequestParams withSource(String source) {
		this.setSource(source);
		return this;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param version the version to set
	 */
	private void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @param source the source to set
	 */
	@SourceValidator
	private void setSource(String source) {
		this.source = source;
	}

}