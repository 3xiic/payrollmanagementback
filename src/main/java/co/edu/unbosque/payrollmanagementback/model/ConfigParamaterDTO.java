package co.edu.unbosque.payrollmanagementback.model;



public class ConfigParamaterDTO {

	private Long vnParamId;
	private Long vnParamKey;
	private Long vnParamValue;
	private String vcDescription;
	private String vcCreatedAt;
	private String vcUpdatedAt;
	
	public ConfigParamaterDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param vnParamId
	 * @param vnParamKey
	 * @param vnParamValue
	 * @param vcDescription
	 * @param vcCreatedAt
	 * @param vcUpdatedAt
	 */
	public ConfigParamaterDTO(Long vnParamId, Long vnParamKey, Long vnParamValue, String vcDescription, String vcCreatedAt,
			String vcUpdatedAt) {
		super();
		this.vnParamId = vnParamId;
		this.vnParamKey = vnParamKey;
		this.vnParamValue = vnParamValue;
		this.vcDescription = vcDescription;
		this.vcCreatedAt = vcCreatedAt;
		this.vcUpdatedAt = vcUpdatedAt;
	}

	/**
	 * @return the vnParamId
	 */
	public Long getVnParamId() {
		return vnParamId;
	}

	/**
	 * @param vnParamId the vnParamId to set
	 */
	public void setVnParamId(Long vnParamId) {
		this.vnParamId = vnParamId;
	}

	/**
	 * @return the vnParamKey
	 */
	public Long getVnParamKey() {
		return vnParamKey;
	}

	/**
	 * @param vnParamKey the vnParamKey to set
	 */
	public void setVnParamKey(Long vnParamKey) {
		this.vnParamKey = vnParamKey;
	}

	/**
	 * @return the vnParamValue
	 */
	public Long getVnParamValue() {
		return vnParamValue;
	}

	/**
	 * @param vnParamValue the vnParamValue to set
	 */
	public void setVnParamValue(Long vnParamValue) {
		this.vnParamValue = vnParamValue;
	}

	/**
	 * @return the vcDescription
	 */
	public String getVcDescription() {
		return vcDescription;
	}

	/**
	 * @param vcDescription the vcDescription to set
	 */
	public void setVcDescription(String vcDescription) {
		this.vcDescription = vcDescription;
	}

	/**
	 * @return the vcCreatedAt
	 */
	public String getVcCreatedAt() {
		return vcCreatedAt;
	}

	/**
	 * @param vcCreatedAt the vcCreatedAt to set
	 */
	public void setVcCreatedAt(String vcCreatedAt) {
		this.vcCreatedAt = vcCreatedAt;
	}

	/**
	 * @return the vcUpdatedAt
	 */
	public String getVcUpdatedAt() {
		return vcUpdatedAt;
	}

	/**
	 * @param vcUpdatedAt the vcUpdatedAt to set
	 */
	public void setVcUpdatedAt(String vcUpdatedAt) {
		this.vcUpdatedAt = vcUpdatedAt;
	}
	
	
}
