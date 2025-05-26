package co.edu.unbosque.payrollmanagementback.model;

public class SalaryItemDTO {

	private int vnItemdId;
	private String vcItemName;
	private String vcItemType;
	private String vcCalcType;
	private int vnSocialSecurity;
	private int parafiscal;
	private String vcDescription;
	private String vcCreatedAt;
	private String vcUpdatedAt;
	
	
	public SalaryItemDTO() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param vnItemdId
	 * @param vcItemName
	 * @param vcItemType
	 * @param vcCalcType
	 * @param vnSocialSecurity
	 * @param parafiscal
	 * @param vcDescription
	 * @param vcCreatedAt
	 * @param vcUpdatedAt
	 */
	public SalaryItemDTO(int vnItemdId, String vcItemName, String vcItemType, String vcCalcType, int vnSocialSecurity,
			int parafiscal, String vcDescription, String vcCreatedAt, String vcUpdatedAt) {
		super();
		this.vnItemdId = vnItemdId;
		this.vcItemName = vcItemName;
		this.vcItemType = vcItemType;
		this.vcCalcType = vcCalcType;
		this.vnSocialSecurity = vnSocialSecurity;
		this.parafiscal = parafiscal;
		this.vcDescription = vcDescription;
		this.vcCreatedAt = vcCreatedAt;
		this.vcUpdatedAt = vcUpdatedAt;
	}


	/**
	 * @return the vnItemdId
	 */
	public int getVnItemdId() {
		return vnItemdId;
	}


	/**
	 * @param vnItemdId the vnItemdId to set
	 */
	public void setVnItemdId(int vnItemdId) {
		this.vnItemdId = vnItemdId;
	}


	/**
	 * @return the vcItemName
	 */
	public String getVcItemName() {
		return vcItemName;
	}


	/**
	 * @param vcItemName the vcItemName to set
	 */
	public void setVcItemName(String vcItemName) {
		this.vcItemName = vcItemName;
	}


	/**
	 * @return the vcItemType
	 */
	public String getVcItemType() {
		return vcItemType;
	}


	/**
	 * @param vcItemType the vcItemType to set
	 */
	public void setVcItemType(String vcItemType) {
		this.vcItemType = vcItemType;
	}


	/**
	 * @return the vcCalcType
	 */
	public String getVcCalcType() {
		return vcCalcType;
	}


	/**
	 * @param vcCalcType the vcCalcType to set
	 */
	public void setVcCalcType(String vcCalcType) {
		this.vcCalcType = vcCalcType;
	}


	/**
	 * @return the vnSocialSecurity
	 */
	public int getVnSocialSecurity() {
		return vnSocialSecurity;
	}


	/**
	 * @param vnSocialSecurity the vnSocialSecurity to set
	 */
	public void setVnSocialSecurity(int vnSocialSecurity) {
		this.vnSocialSecurity = vnSocialSecurity;
	}


	/**
	 * @return the parafiscal
	 */
	public int getParafiscal() {
		return parafiscal;
	}


	/**
	 * @param parafiscal the parafiscal to set
	 */
	public void setParafiscal(int parafiscal) {
		this.parafiscal = parafiscal;
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
