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
@Table(name="employee_contracts")
public class EmployeeContractEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vn_contract_id", unique = true)
	private int vnContractId;
	@Column(name = "vn_employee_id")
	private int vnEmployeeId;
	@Column(name = "vn_mode_id")
	private int vnModeId;
	@Column(name = "vc_start_date")
	private String vcStartDate;
	@Column(name = "vc_end_date")
	private String vcEndDate;
	@Column(name = "vn_monthly_salary")
	private int vnMonthlySalary;
	@Column(name = "vn_hours_week")
	private int vnHoursWeek;
	@Column(name = "vc_terms")
	private String vcTerms;
	@Column(name = "vc_status")
	private String vcStatus;
	@Column(name = "vc_created_at")
	private String vcCreatedAt;
	@Column(name = "vc_updated_at")
	private String vcUpdatedAt;
	@ManyToOne
	@JoinColumn(name = "vn_employee_id")
	private EmployeeEntity employeeEntity;
	@ManyToOne
	@JoinColumn(name = "vn_mode_id")
	private ContractModeEntity contractModeEntity;
	
	public EmployeeContractEntity() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param vnContractId
	 * @param vnEmployeeId
	 * @param vnModeId
	 * @param vcStartDate
	 * @param vcEndDate
	 * @param vnMonthlySalary
	 * @param vnHoursWeek
	 * @param vcTerms
	 * @param vcStatus
	 * @param vcCreatedAt
	 * @param vcUpdatedAt
	 */
	public EmployeeContractEntity(int vnContractId, int vnEmployeeId, int vnModeId, String vcStartDate, String vcEndDate,
			int vnMonthlySalary, int vnHoursWeek, String vcTerms, String vcStatus, String vcCreatedAt,
			String vcUpdatedAt) {
		super();
		this.vnContractId = vnContractId;
		this.vnEmployeeId = vnEmployeeId;
		this.vnModeId = vnModeId;
		this.vcStartDate = vcStartDate;
		this.vcEndDate = vcEndDate;
		this.vnMonthlySalary = vnMonthlySalary;
		this.vnHoursWeek = vnHoursWeek;
		this.vcTerms = vcTerms;
		this.vcStatus = vcStatus;
		this.vcCreatedAt = vcCreatedAt;
		this.vcUpdatedAt = vcUpdatedAt;
	}



	/**
	 * @return the vnContractId
	 */
	public int getVnContractId() {
		return vnContractId;
	}



	/**
	 * @param vnContractId the vnContractId to set
	 */
	public void setVnContractId(int vnContractId) {
		this.vnContractId = vnContractId;
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
	 * @return the vnModeId
	 */
	public int getVnModeId() {
		return vnModeId;
	}



	/**
	 * @param vnModeId the vnModeId to set
	 */
	public void setVnModeId(int vnModeId) {
		this.vnModeId = vnModeId;
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
	 * @return the vnMonthlySalary
	 */
	public int getVnMonthlySalary() {
		return vnMonthlySalary;
	}



	/**
	 * @param vnMonthlySalary the vnMonthlySalary to set
	 */
	public void setVnMonthlySalary(int vnMonthlySalary) {
		this.vnMonthlySalary = vnMonthlySalary;
	}



	/**
	 * @return the vnHoursWeek
	 */
	public int getVnHoursWeek() {
		return vnHoursWeek;
	}



	/**
	 * @param vnHoursWeek the vnHoursWeek to set
	 */
	public void setVnHoursWeek(int vnHoursWeek) {
		this.vnHoursWeek = vnHoursWeek;
	}



	/**
	 * @return the vcTerms
	 */
	public String getVcTerms() {
		return vcTerms;
	}



	/**
	 * @param vcTerms the vcTerms to set
	 */
	public void setVcTerms(String vcTerms) {
		this.vcTerms = vcTerms;
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
