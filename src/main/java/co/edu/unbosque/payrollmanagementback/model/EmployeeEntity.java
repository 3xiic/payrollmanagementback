package co.edu.unbosque.payrollmanagementback.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_records")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vn_employee_id", unique = true)
	private int vnEmployeeId;
	@Column(name = "vn_person_id")
	private int vnPersonId;
	@Column(name = "vn_role_id")
	private int vnRoleId;
	@Column(name = "vc_hire_date")
	private String vcHireDate;
	@Column(name = "vc_bank_account")
	private String vcBankAccount;
	@Column(name = "vc_bank_name")
	private String vcBankName;
	@Column(name = "vc_account_type")
	private String vcAccountType;
	@Column(name = "vc_status")
	private String vcStatus;
	@Column(name = "vc_created_at")
	private String vcCreatedAt;
	@Column(name = "vc_updated_at")
	private String vcUpdatedAt;
	@OneToOne
	@JoinColumn(name = "vn_person_id")
	private PersonalInfoEntity infoEntity;
	@ManyToOne
	@JoinColumn(name = "vn_role_id")
	private JobRoleEntity roleEntity;
	
	
	public EmployeeEntity() {
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
	 * @param infoEntity
	 * @param vcCreatedAt
	 * @param vcUpdatedAt
	 * @param roleEntity
	 */
	public EmployeeEntity(int vnEmployeeId, int vnPersonId, int vnRoleId, String vcHireDate, String vcBankAccount,
			String vcBankName, String vcAccountType, String vcStatus, String vcCreatedAt,
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
	public int getVnEmployeeId() {
		return vnEmployeeId;
	}


	/**
	 * @param vnEmployeeId the vnEmployeeId to set
	 */
	public void setVnEmployeeId(int vnEmployeeId) {
		this.vnEmployeeId = vnEmployeeId;
	}


	/**
	 * @return the vnPersonId
	 */
	public int getVnPersonId() {
		return vnPersonId;
	}


	/**
	 * @param vnPersonId the vnPersonId to set
	 */
	public void setVnPersonId(int vnPersonId) {
		this.vnPersonId = vnPersonId;
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
	 * @return the infoEntity
	 */
	public PersonalInfoEntity getInfoEntity() {
		return infoEntity;
	}


	/**
	 * @param infoEntity the infoEntity to set
	 */
	public void setInfoEntity(PersonalInfoEntity infoEntity) {
		this.infoEntity = infoEntity;
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


	/**
	 * @return the roleEntity
	 */
	public JobRoleEntity getRoleEntity() {
		return roleEntity;
	}


	/**
	 * @param roleEntity the roleEntity to set
	 */
	public void setRoleEntity(JobRoleEntity roleEntity) {
		this.roleEntity = roleEntity;
	}
	


}