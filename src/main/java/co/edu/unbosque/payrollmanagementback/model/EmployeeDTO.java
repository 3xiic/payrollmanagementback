package co.edu.unbosque.payrollmanagementback.model;


public class EmployeeDTO {

	private Long vnEmployeeId;
	private Long vnPersonId;
	private Long vnRoleId;
	private String vcHireDate;
	private String vcBankAccount;
	private String vcBankName;
	private String vcAccountType;
	private String vcStatus;
	private String vcCreatedAt;
	private String vcUpdatedAt;
	
	
	
	public EmployeeDTO() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param vnEmployeeId
	 * @param vnPersonId
	 * @param vnRoleId
	 * @param vcHireDate
	 * @param vcBankAccount
	 * @param vcBankName
	 * @param vcAccountType
	 * @param vcStatus
	 */
	public EmployeeDTO(Long vnEmployeeId, Long vnPersonId, Long vnRoleId, String vcHireDate, String vcBankAccount,
			String vcBankName, String vcAccountType, String vcStatus,  String vcCreatedAt,
			String vcUpdatedAt) {
		super();
		this.vnEmployeeId = vnEmployeeId;
		this.vnPersonId = vnPersonId;
		this.vnRoleId = vnRoleId;
		this.vcHireDate = vcHireDate;
		this.vcBankAccount = vcBankAccount;
		this.vcBankName = vcBankName;
		this.vcAccountType = vcAccountType;
		this.vcStatus = vcStatus;
		this.vcCreatedAt = vcCreatedAt;
		this.vcUpdatedAt = vcUpdatedAt;
	}


	/**
	 * @return the vnEmployeeId
	 */
	public Long getVnEmployeeId() {
		return vnEmployeeId;
	}


	/**
	 * @param vnEmployeeId the vnEmployeeId to set
	 */
	public void setVnEmployeeId(Long vnEmployeeId) {
		this.vnEmployeeId = vnEmployeeId;
	}


	/**
	 * @return the vnPersonId
	 */
	public Long getVnPersonId() {
		return vnPersonId;
	}


	/**
	 * @param vnPersonId the vnPersonId to set
	 */
	public void setVnPersonId(Long vnPersonId) {
		this.vnPersonId = vnPersonId;
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
	 * @return the vcHireDate
	 */
	public String getVcHireDate() {
		return vcHireDate;
	}


	/**
	 * @param vcHireDate the vcHireDate to set
	 */
	public void setVcHireDate(String vcHireDate) {
		this.vcHireDate = vcHireDate;
	}


	/**
	 * @return the vcBankAccount
	 */
	public String getVcBankAccount() {
		return vcBankAccount;
	}


	/**
	 * @param vcBankAccount the vcBankAccount to set
	 */
	public void setVcBankAccount(String vcBankAccount) {
		this.vcBankAccount = vcBankAccount;
	}


	/**
	 * @return the vcBankName
	 */
	public String getVcBankName() {
		return vcBankName;
	}


	/**
	 * @param vcBankName the vcBankName to set
	 */
	public void setVcBankName(String vcBankName) {
		this.vcBankName = vcBankName;
	}


	/**
	 * @return the vcAccountType
	 */
	public String getVcAccountType() {
		return vcAccountType;
	}


	/**
	 * @param vcAccountType the vcAccountType to set
	 */
	public void setVcAccountType(String vcAccountType) {
		this.vcAccountType = vcAccountType;
	}


	/**
	 * @return the vcStatus
	 */
	public String getVcStatus() {
		return vcStatus;
	}


	/**
	 * @param vcStatus the vcStatus to set
	 */
	public void setVcStatus(String vcStatus) {
		this.vcStatus = vcStatus;
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
