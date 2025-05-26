package co.edu.unbosque.payrollmanagementback.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contract_modes")
public class ContractModeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vn_mode_id", unique = true)
	private Long vnModeId;
	@Column(name = "vc_mode_name")
	private String vcModeName;
	@Column(name = "vc_description")
	private String vcDescription;
	@Column(name = "vc_created_at")
	private String vcCreatedAt;
	@Column(name = "vc_updated_at")
	private String vcUpdatedAt;
	
	public ContractModeEntity() {
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * @param vnModeId
	 * @param vcModeName
	 * @param vcDescription
	 * @param vcCreatedAt
	 * @param vcUpdatedAt
	 */
	public ContractModeEntity(Long vnModeId, String vcModeName, String vcDescription, String vcCreatedAt,
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
