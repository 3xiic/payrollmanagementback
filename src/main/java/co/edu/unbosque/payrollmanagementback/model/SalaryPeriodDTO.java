package co.edu.unbosque.payrollmanagementback.model;

public class SalaryPeriodDTO {

	private Long vnPeriodId;
	private String vcStartDate;
	private String vcEndDate;
	private String vcPaymentDate;
	private String vcStatus;
	private String vcDescription;
	private String vcCreatedAt;
	private String vcUpdatedAt;
	
	public SalaryPeriodDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param vnPeriodId
	 * @param vcStartDate
	 * @param vcEndDate
	 * @param vcPaymentDate
	 * @param vcStatus
	 * @param vcDescription
	 * @param vcCreatedAt
	 * @param vcUpdatedAt
	 */
	public SalaryPeriodDTO(Long vnPeriodId, String vcStartDate, String vcEndDate, String vcPaymentDate, String vcStatus,
			String vcDescription, String vcCreatedAt, String vcUpdatedAt) {
		super();
		this.vnPeriodId = vnPeriodId;
		this.vcStartDate = vcStartDate;
		this.vcEndDate = vcEndDate;
		this.vcPaymentDate = vcPaymentDate;
		this.vcStatus = vcStatus;
		this.vcDescription = vcDescription;
		this.vcCreatedAt = vcCreatedAt;
		this.vcUpdatedAt = vcUpdatedAt;
	}

	/**
	 * @return the vnPeriodId
	 */
	public Long getVnPeriodId() {
		return vnPeriodId;
	}

	/**
	 * @param vnPeriodId the vnPeriodId to set
	 */
	public void setVnPeriodId(Long vnPeriodId) {
		this.vnPeriodId = vnPeriodId;
	}

	/**
	 * @return the vcStartDate
	 */
	public String getVcStartDate() {
		return vcStartDate;
	}

	/**
	 * @param vcStartDate the vcStartDate to set
	 */
	public void setVcStartDate(String vcStartDate) {
		this.vcStartDate = vcStartDate;
	}

	/**
	 * @return the vcEndDate
	 */
	public String getVcEndDate() {
		return vcEndDate;
	}

	/**
	 * @param vcEndDate the vcEndDate to set
	 */
	public void setVcEndDate(String vcEndDate) {
		this.vcEndDate = vcEndDate;
	}

	/**
	 * @return the vcPaymentDate
	 */
	public String getVcPaymentDate() {
		return vcPaymentDate;
	}

	/**
	 * @param vcPaymentDate the vcPaymentDate to set
	 */
	public void setVcPaymentDate(String vcPaymentDate) {
		this.vcPaymentDate = vcPaymentDate;
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
