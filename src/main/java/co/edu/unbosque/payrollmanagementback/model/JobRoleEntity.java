package co.edu.unbosque.payrollmanagementback.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "job_roles")
public class JobRoleEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vn_role_id", unique = true)
	private int vnRoleId;
	@Column(name = "vc_role_name")
	private String vcRoleName;
	@Column(name = "vn_area_id", insertable = false, updatable = false)
	private int vnAreaId;
	@Column(name = "vn_base_salary")
	private int vnBaseSalary;
	@Column(name = "vc_description")
	private String vcDescription;
	@Column(name = "vc_created_at")
	private String vcCreatedAt;
	@Column(name = "vc_updated_at")
	private String vcUpdatedAt;
	@ManyToOne
	@JoinColumn(name = "vn_area_id")
	private OrgAreaEntity areaEntity;
	
	public JobRoleEntity() {
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
	public JobRoleEntity(int vnRoleId, String vcRoleName, int vnAreaId, int vnBaseSalary, String vcDescription,
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
	public int getVnRoleId() {
		return vnRoleId;
	}

	/**
	 * @param vnRoleId the vnRoleId to set
	 */
	public void setVnRoleId(int vnRoleId) {
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
	 * @return the vnBaseSalary
	 */
	public int getVnBaseSalary() {
		return vnBaseSalary;
	}

	/**
	 * @param vnBaseSalary the vnBaseSalary to set
	 */
	public void setVnBaseSalary(int vnBaseSalary) {
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
