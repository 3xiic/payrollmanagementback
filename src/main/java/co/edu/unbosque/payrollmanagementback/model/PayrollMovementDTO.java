package co.edu.unbosque.payrollmanagementback.model;

public class PayrollMovementDTO {

	private int vnMovementId;
	private int vnPayrollId;
	private int vnItemId;
	private int vnAmount;
	private String vcCreatedAt;
	private String vcUpdatedAt;
	
	public PayrollMovementDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param vnMovementId
	 * @param vnPayrollId
	 * @param vnItemId
	 * @param vnAmount
	 * @param vcCreatedAt
	 * @param vcUpdatedAt
	 */
	public PayrollMovementDTO(int vnMovementId, int vnPayrollId, int vnItemId, int vnAmount, String vcCreatedAt,
			String vcUpdatedAt) {
		super();
		this.vnMovementId = vnMovementId;
		this.vnPayrollId = vnPayrollId;
		this.vnItemId = vnItemId;
		this.vnAmount = vnAmount;
		this.vcCreatedAt = vcCreatedAt;
		this.vcUpdatedAt = vcUpdatedAt;
	}

	/**
	 * @return the vnMovementId
	 */
	public int getVnMovementId() {
		return vnMovementId;
	}

	/**
	 * @param vnMovementId the vnMovementId to set
	 */
	public void setVnMovementId(int vnMovementId) {
		this.vnMovementId = vnMovementId;
	}

	/**
	 * @return the vnPayrollId
	 */
	public int getVnPayrollId() {
		return vnPayrollId;
	}

	/**
	 * @param vnPayrollId the vnPayrollId to set
	 */
	public void setVnPayrollId(int vnPayrollId) {
		this.vnPayrollId = vnPayrollId;
	}

	/**
	 * @return the vnItemId
	 */
	public int getVnItemId() {
		return vnItemId;
	}

	/**
	 * @param vnItemId the vnItemId to set
	 */
	public void setVnItemId(int vnItemId) {
		this.vnItemId = vnItemId;
	}

	/**
	 * @return the vnAmount
	 */
	public int getVnAmount() {
		return vnAmount;
	}

	/**
	 * @param vnAmount the vnAmount to set
	 */
	public void setVnAmount(int vnAmount) {
		this.vnAmount = vnAmount;
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
