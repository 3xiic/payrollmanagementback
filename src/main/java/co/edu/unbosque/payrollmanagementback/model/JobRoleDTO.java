package co.edu.unbosque.payrollmanagementback.model;

public class JobRoleDTO {
	
	private Long vnRoleId;
	private String vcRoleName;
	private Long vnAreaId;
	private Long vnBaseSalary;
	private String vcDescription;
	private String vcCreatedAt;
	private String vcUpdatedAt;
	
	public JobRoleDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param vnRoleId
	 * @param vcRoleName
	 * @param vnAreaId
	 * @param vnBaseSalary
	 * @param vcDescription
	 * @param vcCreatedAt
	 * @param vcUpdatedAt
	 */
	public JobRoleDTO(Long vnRoleId, String vcRoleName, Long vnAreaId, Long vnBaseSalary, String vcDescription,
			String vcCreatedAt, String vcUpdatedAt) {
		super();
		this.vnRoleId = vnRoleId;
		this.vcRoleName = vcRoleName;
		this.vnAreaId = vnAreaId;
		this.vnBaseSalary = vnBaseSalary;
		this.vcDescription = vcDescription;
		this.vcCreatedAt = vcCreatedAt;
		this.vcUpdatedAt = vcUpdatedAt;
	}


	/**
	 * @return the vnRoleId
	 */
	public Long getVnRoleId() {
		return vnRoleId;
	}

	/**
	 * @param vnRoleId the vnRoleId to set
	 */
	public void setVnRoleId(Long vnRoleId) {
		this.vnRoleId = vnRoleId;
	}

	/**
	 * @return the vcRoleName
	 */
	public String getVcRoleName() {
		return vcRoleName;
	}

	/**
	 * @param vcRoleName the vcRoleName to set
	 */
	public void setVcRoleName(String vcRoleName) {
		this.vcRoleName = vcRoleName;
	}

	/**
	 * @return the vnAreaId
	 */
	public Long getVnAreaId() {
		return vnAreaId;
	}

	/**
	 * @param vnAreaId the vnAreaId to set
	 */
	public void setVnAreaId(Long vnAreaId) {
		this.vnAreaId = vnAreaId;
	}

	/**
	 * @return the vnBaseSalary
	 */
	public Long getVnBaseSalary() {
		return vnBaseSalary;
	}

	/**
	 * @param vnBaseSalary the vnBaseSalary to set
	 */
	public void setVnBaseSalary(Long vnBaseSalary) {
		this.vnBaseSalary = vnBaseSalary;
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
