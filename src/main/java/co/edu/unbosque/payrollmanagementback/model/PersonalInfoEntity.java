package co.edu.unbosque.payrollmanagementback.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "personal_info")
public class PersonalInfoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vn_person_id", unique = true)
	private int vnPersonId;
	@Column(name = "vc_document_type")
	private String vcDocumentType;
	@Column(name = "vc_document_number")
	private String vcDocumentNumber;
	@Column(name = "vc_first_name")
	private String vcFirstName;
	@Column(name = "vc_last_name")
	private String vcLastName;
	@Column(name = "vc_birth_date")
	private String vcBirthDate;
	@Column(name = "vc_gender")
	private String vcGender;
	@Column(name = "vc_phone")
	private String vcPhone;
	@Column(name = "vc_email")
	private String vcEmail;
	@Column(name = "vc_address")
	private String vcAddress;
	@Column(name = "vc_created_at")
	private String vcCreatedAt;
	@Column(name = "vc_updated_at")
	private String vcUpdatedAt;
	@OneToOne(mappedBy = "infoEntity")
	private EmployeeEntity employeeEntity;

	
	public PersonalInfoEntity() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param vnPersonId
	 * @param vcDocumentType
	 * @param vcDocumentNumber
	 * @param vcFirstName
	 * @param vcLastName
	 * @param vcBirthDate
	 * @param vcGender
	 * @param vcPhone
	 * @param vcEmail
	 * @param vcAddress
	 * @param vcCreatedAt
	 * @param vcUpdatedAt
	 * @param employeeEntity
	 */
	public PersonalInfoEntity(int vnPersonId, String vcDocumentType, String vcDocumentNumber, String vcFirstName,
			String vcLastName, String vcBirthDate, String vcGender, String vcPhone, String vcEmail, String vcAddress,
			String vcCreatedAt, String vcUpdatedAt) {
		super();
		this.vnPersonId = vnPersonId;
		this.vcDocumentType = vcDocumentType;
		this.vcDocumentNumber = vcDocumentNumber;
		this.vcFirstName = vcFirstName;
		this.vcLastName = vcLastName;
		this.vcBirthDate = vcBirthDate;
		this.vcGender = vcGender;
		this.vcPhone = vcPhone;
		this.vcEmail = vcEmail;
		this.vcAddress = vcAddress;
		this.vcCreatedAt = vcCreatedAt;
		this.vcUpdatedAt = vcUpdatedAt;
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
	 * @return the vcDocumentType
	 */
	public String getVcDocumentType() {
		return vcDocumentType;
	}


	/**
	 * @param vcDocumentType the vcDocumentType to set
	 */
	public void setVcDocumentType(String vcDocumentType) {
		this.vcDocumentType = vcDocumentType;
	}


	/**
	 * @return the vcDocumentNumber
	 */
	public String getVcDocumentNumber() {
		return vcDocumentNumber;
	}


	/**
	 * @param vcDocumentNumber the vcDocumentNumber to set
	 */
	public void setVcDocumentNumber(String vcDocumentNumber) {
		this.vcDocumentNumber = vcDocumentNumber;
	}


	/**
	 * @return the vcFirstName
	 */
	public String getVcFirstName() {
		return vcFirstName;
	}


	/**
	 * @param vcFirstName the vcFirstName to set
	 */
	public void setVcFirstName(String vcFirstName) {
		this.vcFirstName = vcFirstName;
	}


	/**
	 * @return the vcLastName
	 */
	public String getVcLastName() {
		return vcLastName;
	}


	/**
	 * @param vcLastName the vcLastName to set
	 */
	public void setVcLastName(String vcLastName) {
		this.vcLastName = vcLastName;
	}


	/**
	 * @return the vcBirthDate
	 */
	public String getVcBirthDate() {
		return vcBirthDate;
	}


	/**
	 * @param vcBirthDate the vcBirthDate to set
	 */
	public void setVcBirthDate(String vcBirthDate) {
		this.vcBirthDate = vcBirthDate;
	}


	/**
	 * @return the vcGender
	 */
	public String getVcGender() {
		return vcGender;
	}


	/**
	 * @param vcGender the vcGender to set
	 */
	public void setVcGender(String vcGender) {
		this.vcGender = vcGender;
	}


	/**
	 * @return the vcPhone
	 */
	public String getVcPhone() {
		return vcPhone;
	}


	/**
	 * @param vcPhone the vcPhone to set
	 */
	public void setVcPhone(String vcPhone) {
		this.vcPhone = vcPhone;
	}


	/**
	 * @return the vcEmail
	 */
	public String getVcEmail() {
		return vcEmail;
	}


	/**
	 * @param vcEmail the vcEmail to set
	 */
	public void setVcEmail(String vcEmail) {
		this.vcEmail = vcEmail;
	}


	/**
	 * @return the vcAddress
	 */
	public String getVcAddress() {
		return vcAddress;
	}


	/**
	 * @param vcAddress the vcAddress to set
	 */
	public void setVcAddress(String vcAddress) {
		this.vcAddress = vcAddress;
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
	 * @return the employeeEntity
	 */
	public EmployeeEntity getEmployeeEntity() {
		return employeeEntity;
	}


	/**
	 * @param employeeEntity the employeeEntity to set
	 */
	public void setEmployeeEntity(EmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
	}


}