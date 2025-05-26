package co.edu.unbosque.payrollmanagementback.model;


public class ContractModeDTO {

	private Long vnModeId;
	private String vcModeName;
	private String vcDescription;
	private String vcCreatedAt;
	private String vcUpdatedAt;
	
	public ContractModeDTO() {
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * @param vnModeId
	 * @param vcModeName
	 * @param vcDescription
	 * @param vcCreatedAt
	 * @param vcUpdatedAt
	 */
	public ContractModeDTO(Long vnModeId, String vcModeName, String vcDescription, String vcCreatedAt,
			String vcUpdatedAt) {
		super();
		this.vnModeId = vnModeId;
		this.vcModeName = vcModeName;
		this.vcDescription = vcDescription;
		this.vcCreatedAt = vcCreatedAt;
		this.vcUpdatedAt = vcUpdatedAt;
	}



	/**
	 * @return the vnModeId
	 */
	public Long getVnModeId() {
		return vnModeId;
	}

	/**
	 * @param vnModeId the vnModeId to set
	 */
	public void setVnModeId(Long vnModeId) {
		this.vnModeId = vnModeId;
	}

	/**
	 * @return the vcModeName
	 */
	public String getVcModeName() {
		return vcModeName;
	}

	/**
	 * @param vcModeName the vcModeName to set
	 */
	public void setVcModeName(String vcModeName) {
		this.vcModeName = vcModeName;
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
