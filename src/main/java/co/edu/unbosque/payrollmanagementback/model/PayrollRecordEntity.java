package co.edu.unbosque.payrollmanagementback.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="payroll_records")
public class PayrollRecordEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vn_payroll_id", unique = true)
	private Long vnPayrollId;
	@Column(name = "vn_employee_id")
	private Long vnEmployeeId;
	@Column(name = "vn_period_id")
	private Long vnPeriodId;
	@Column(name = "vn_contract_id")
	private Long vnContractId;
	@Column(name = "vn_salary_base")
	private Long vnSalaryBase;
	@Column(name = "vn_days_worked")
	private Long vnDaysWorked;
	@Column(name = "vn_total_earnings")
	private Long vnTotalEarnings;
	@Column(name = "vn_total_deductions")
	private Long vnTotalDeductions;
	@Column(name = "vn_net_pay")
	private Long vnNetPay;
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
	@JoinColumn(name = "vn_contract_id")
	private EmployeeContractEntity employeeContractEntity;
	@ManyToOne
	@JoinColumn(name = "vn_period_id")
	private SalaryPeriodEntity periodEntity;
	@OneToMany(mappedBy = "recordEntity", cascade = CascadeType.ALL)
	private List<PayrollMovementEntity> movementEntities;
	
	public PayrollRecordEntity() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param vnPayrollId
	 * @param vnEmployeeId
	 * @param vnPeriodId
	 * @param vnContractId
	 * @param vnSalaryBase
	 * @param vnDaysWorked
	 * @param vnTotalEarnings
	 * @param vnTotalDeductions
	 * @param vnNetPay
	 * @param vcStatus
	 * @param vcCreatedAt
	 * @param vcUpdatedAt
	 */
	public PayrollRecordEntity(Long vnPayrollId, Long vnEmployeeId, Long vnPeriodId, Long vnContractId, Long vnSalaryBase,
			Long vnDaysWorked, Long vnTotalEarnings, Long vnTotalDeductions, Long vnNetPay, String vcStatus,
			String vcCreatedAt, String vcUpdatedAt) {
		super();
		this.vnPayrollId = vnPayrollId;
		this.vnEmployeeId = vnEmployeeId;
		this.vnPeriodId = vnPeriodId;
		this.vnContractId = vnContractId;
		this.vnSalaryBase = vnSalaryBase;
		this.vnDaysWorked = vnDaysWorked;
		this.vnTotalEarnings = vnTotalEarnings;
		this.vnTotalDeductions = vnTotalDeductions;
		this.vnNetPay = vnNetPay;
		this.vcStatus = vcStatus;
		this.vcCreatedAt = vcCreatedAt;
		this.vcUpdatedAt = vcUpdatedAt;
	}

	/**
	 * @return the vnPayrollId
	 */
	public Long getVnPayrollId() {
		return vnPayrollId;
	}

	/**
	 * @param vnPayrollId the vnPayrollId to set
	 */
	public void setVnPayrollId(Long vnPayrollId) {
		this.vnPayrollId = vnPayrollId;
	}

	/**
	 * @return the vnEmployeeId
	 */
	public Long getVnEmployeeId() {
		return vnEmployeeId;
	}

	/**
	 * @param vnEmployeeId the vnEmployeeId to set
	 */
	public void setVnEmployeeId(Long vnEmployeeId) {
		this.vnEmployeeId = vnEmployeeId;
	}

	/**
	 * @return the vnPeriodId
	 */
	public Long getVnPeriodId() {
		return vnPeriodId;
	}

	/**
	 * @param vnPeriodId the vnPeriodId to set
	 */
	public void setVnPeriodId(Long vnPeriodId) {
		this.vnPeriodId = vnPeriodId;
	}

	/**
	 * @return the vnContractId
	 */
	public Long getVnContractId() {
		return vnContractId;
	}

	/**
	 * @param vnContractId the vnContractId to set
	 */
	public void setVnContractId(Long vnContractId) {
		this.vnContractId = vnContractId;
	}

	/**
	 * @return the vnSalaryBase
	 */
	public Long getVnSalaryBase() {
		return vnSalaryBase;
	}

	/**
	 * @param vnSalaryBase the vnSalaryBase to set
	 */
	public void setVnSalaryBase(Long vnSalaryBase) {
		this.vnSalaryBase = vnSalaryBase;
	}

	/**
	 * @return the vnDaysWorked
	 */
	public Long getVnDaysWorked() {
		return vnDaysWorked;
	}

	/**
	 * @param vnDaysWorked the vnDaysWorked to set
	 */
	public void setVnDaysWorked(Long vnDaysWorked) {
		this.vnDaysWorked = vnDaysWorked;
	}

	/**
	 * @return the vnTotalEarnings
	 */
	public Long getVnTotalEarnings() {
		return vnTotalEarnings;
	}

	/**
	 * @param vnTotalEarnings the vnTotalEarnings to set
	 */
	public void setVnTotalEarnings(Long vnTotalEarnings) {
		this.vnTotalEarnings = vnTotalEarnings;
	}

	/**
	 * @return the vnTotalDeductions
	 */
	public Long getVnTotalDeductions() {
		return vnTotalDeductions;
	}

	/**
	 * @param vnTotalDeductions the vnTotalDeductions to set
	 */
	public void setVnTotalDeductions(Long vnTotalDeductions) {
		this.vnTotalDeductions = vnTotalDeductions;
	}

	/**
	 * @return the vnNetPay
	 */
	public Long getVnNetPay() {
		return vnNetPay;
	}

	/**
	 * @param vnNetPay the vnNetPay to set
	 */
	public void setVnNetPay(Long vnNetPay) {
		this.vnNetPay = vnNetPay;
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
