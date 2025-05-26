package co.edu.unbosque.payrollmanagementback.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "org_areas")
public class OrgAreaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vn_area_id", unique = true)
	private int vnAreaId;
	@Column(name = "vc_area_name")
	private String vcAreaName;
	@Column(name = "vc_area_desc")
	private String vcAreaDesc;
	@Column(name = "vc_created_at")
	private String vcCreatedAt;
	@Column(name = "vc_updated_at")
	private String vcUpdatedAt;
	@OneToMany(mappedBy = "areaEntity")
	private List<JobRoleEntity> roles;
	
	public OrgAreaEntity() {
		// TODO Auto-generated constructor stub
	}
	
	

	/**
	 * @param vnAreaId
	 * @param vcAreaName
	 * @param vcAreaDesc
	 * @param vcCreatedAt
	 * @param vcUpdatedAt
	 */
	public OrgAreaEntity(int vnAreaId, String vcAreaName, String vcAreaDesc, String vcCreatedAt, String vcUpdatedAt) {
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
