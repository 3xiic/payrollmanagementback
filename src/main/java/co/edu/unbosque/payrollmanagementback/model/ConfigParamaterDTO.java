package co.edu.unbosque.payrollmanagementback.model;

public class ConfigParamaterDTO {

	private int vnParamId;
	private int vnParamKey;
	private int vnParamValue;
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
	public ConfigParamaterDTO(int vnParamId, int vnParamKey, int vnParamValue, String vcDescription,
			String vcCreatedAt, String vcUpdatedAt) {
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
	public int getVnParamId() {
		return vnParamId;
	}

	/**
	 * @param vnParamId the vnParamId to set
	 */
	public void setVnParamId(int vnParamId) {
		this.vnParamId = vnParamId;
	}

	/**
	 * @return the vnParamKey
	 */
	public int getVnParamKey() {
		return vnParamKey;
	}

	/**
	 * @param vnParamKey the vnParamKey to set
	 */
	public void setVnParamKey(int vnParamKey) {
		this.vnParamKey = vnParamKey;
	}

	/**
	 * @return the vnParamValue
	 */
	public int getVnParamValue() {
		return vnParamValue;
	}

	/**
	 * @param vnParamValue the vnParamValue to set
	 */
	public void setVnParamValue(int vnParamValue) {
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
