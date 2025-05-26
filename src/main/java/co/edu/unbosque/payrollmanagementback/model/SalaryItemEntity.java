package co.edu.unbosque.payrollmanagementback.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="salary_items")
public class SalaryItemEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vn_item_id", unique = true)
	private Long vnItemdId;
	@Column(name = "vc_item_name")
	private String vcItemName;
	@Column(name = "vc_item_type")
	private String vcItemType;
	@Column(name = "vc_calc_type")
	private String vcCalcType;
	@Column(name = "vn_social_security")
	private Long vnSocialSecurity;
	@Column(name = "vn_parafiscal")
	private Long vnParafiscal;
	@Column(name = "vc_description")
	private String vcDescription;
	@Column(name = "vc_created_at")
	private String vcCreatedAt;
	@Column(name = "vc_updated_at")
	private String vcUpdatedAt;
	
	
	public SalaryItemEntity() {
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
	public SalaryItemEntity(Long vnItemdId, String vcItemName, String vcItemType, String vcCalcType, Long vnSocialSecurity,
			Long parafiscal, String vcDescription, String vcCreatedAt, String vcUpdatedAt) {
		super();
		this.vnItemdId = vnItemdId;
		this.vcItemName = vcItemName;
		this.vcItemType = vcItemType;
		this.vcCalcType = vcCalcType;
		this.vnSocialSecurity = vnSocialSecurity;
		this.vnParafiscal = parafiscal;
		this.vcDescription = vcDescription;
		this.vcCreatedAt = vcCreatedAt;
		this.vcUpdatedAt = vcUpdatedAt;
	}


	/**
	 * @return the vnItemdId
	 */
	public Long getVnItemdId() {
		return vnItemdId;
	}


	/**
	 * @param vnItemdId the vnItemdId to set
	 */
	public void setVnItemdId(Long vnItemdId) {
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
	public Long getVnSocialSecurity() {
		return vnSocialSecurity;
	}


	/**
	 * @param vnSocialSecurity the vnSocialSecurity to set
	 */
	public void setVnSocialSecurity(Long vnSocialSecurity) {
		this.vnSocialSecurity = vnSocialSecurity;
	}


	/**
	 * @return the parafiscal
	 */
	public Long getParafiscal() {
		return vnParafiscal;
	}


	/**
	 * @param parafiscal the parafiscal to set
	 */
	public void setParafiscal(Long parafiscal) {
		this.vnParafiscal = parafiscal;
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
