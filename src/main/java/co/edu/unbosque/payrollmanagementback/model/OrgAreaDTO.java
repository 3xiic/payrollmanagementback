package co.edu.unbosque.payrollmanagementback.model;

public class OrgAreaDTO {
	
	private int vnAreaId;
	private String vcAreaName;
	private String vcAreaDesc;
	private String vcCreatedAt;
	private String vcUpdatedAt;
	
	public OrgAreaDTO() {
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param vnAreaId
	 * @param vcAreaName
	 * @param vcAreaDesc
	 * @param vcCreatedAt
	 * @param vcUpdatedAt
	 */
	public OrgAreaDTO(int vnAreaId, String vcAreaName, String vcAreaDesc, String vcCreatedAt, String vcUpdatedAt) {
		super();
		this.vnAreaId = vnAreaId;
		this.vcAreaName = vcAreaName;
		this.vcAreaDesc = vcAreaDesc;
		this.vcCreatedAt = vcCreatedAt;
		this.vcUpdatedAt = vcUpdatedAt;
	}



	/**
	 * @return the vnAreaId
	 */
	public int getVnAreaId() {
		return vnAreaId;
	}

	/**
	 * @param vnAreaId the vnAreaId to set
	 */
	public void setVnAreaId(int vnAreaId) {
		this.vnAreaId = vnAreaId;
	}

	/**
	 * @return the vcAreaName
	 */
	public String getVcAreaName() {
		return vcAreaName;
	}

	/**
	 * @param vcAreaName the vcAreaName to set
	 */
	public void setVcAreaName(String vcAreaName) {
		this.vcAreaName = vcAreaName;
	}

	/**
	 * @return the vcAreaDesc
	 */
	public String getVcAreaDesc() {
		return vcAreaDesc;
	}

	/**
	 * @param vcAreaDesc the vcAreaDesc to set
	 */
	public void setVcAreaDesc(String vcAreaDesc) {
		this.vcAreaDesc = vcAreaDesc;
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
