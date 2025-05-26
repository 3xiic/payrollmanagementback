package co.edu.unbosque.payrollmanagementback.model;

import jakarta.persistence.Column;

public class PersonalInfoDTO {

	private Long vnPersonId;
	private String vcDocumentType;
	private String vcDocumentNumber;
	private String vcFirstName;
	private String vcLastName;
	private String vcBirthDate;
	private String vcGender;
	private String vcPhone;
	private String vcEmail;
	private String vcAddress;
	private String vcCreatedAt;
	private String vcUpdatedAt;

	
	public PersonalInfoDTO() {
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
	 */
	public PersonalInfoDTO(Long vnPersonId, String vcDocumentType, String vcDocumentNumber, String vcFirstName,
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


}