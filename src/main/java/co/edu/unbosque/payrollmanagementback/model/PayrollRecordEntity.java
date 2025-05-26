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
	private int vnPayrollId;
	@Column(name = "vn_employee_id")
	private int vnEmployeeId;
	@Column(name = "vn_period_id")
	private int vnPeriodId;
	@Column(name = "vn_contract_id")
	private int vnContractId;
	@Column(name = "vn_salary_base")
	private int vnSalaryBase;
	@Column(name = "vn_days_worked")
	private int vnDaysWorked;
	@Column(name = "vn_total_earnings")
	private int vnTotalEarnings;
	@Column(name = "vn_total_deductions")
	private int vnTotalDeductions;
	@Column(name = "vn_net_pay")
	private int vnNetPay;
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
	public PayrollRecordEntity(int vnPayrollId, int vnEmployeeId, int vnPeriodId, int vnContractId, int vnSalaryBase,
			int vnDaysWorked, int vnTotalEarnings, int vnTotalDeductions, int vnNetPay, String vcStatus,
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
	public int getVnPayrollId() {
		return vnPayrollId;
	}

	/**
	 * @param vnPayrollId the vnPayrollId to set
	 */
	public void setVnPayrollId(int vnPayrollId) {
		this.vnPayrollId = vnPayrollId;
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
	 * @return the vnPeriodId
	 */
	public int getVnPeriodId() {
		return vnPeriodId;
	}

	/**
	 * @param vnPeriodId the vnPeriodId to set
	 */
	public void setVnPeriodId(int vnPeriodId) {
		this.vnPeriodId = vnPeriodId;
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
	 * @return the vnSalaryBase
	 */
	public int getVnSalaryBase() {
		return vnSalaryBase;
	}

	/**
	 * @param vnSalaryBase the vnSalaryBase to set
	 */
	public void setVnSalaryBase(int vnSalaryBase) {
		this.vnSalaryBase = vnSalaryBase;
	}

	/**
	 * @return the vnDaysWorked
	 */
	public int getVnDaysWorked() {
		return vnDaysWorked;
	}

	/**
	 * @param vnDaysWorked the vnDaysWorked to set
	 */
	public void setVnDaysWorked(int vnDaysWorked) {
		this.vnDaysWorked = vnDaysWorked;
	}

	/**
	 * @return the vnTotalEarnings
	 */
	public int getVnTotalEarnings() {
		return vnTotalEarnings;
	}

	/**
	 * @param vnTotalEarnings the vnTotalEarnings to set
	 */
	public void setVnTotalEarnings(int vnTotalEarnings) {
		this.vnTotalEarnings = vnTotalEarnings;
	}

	/**
	 * @return the vnTotalDeductions
	 */
	public int getVnTotalDeductions() {
		return vnTotalDeductions;
	}

	/**
	 * @param vnTotalDeductions the vnTotalDeductions to set
	 */
	public void setVnTotalDeductions(int vnTotalDeductions) {
		this.vnTotalDeductions = vnTotalDeductions;
	}

	/**
	 * @return the vnNetPay
	 */
	public int getVnNetPay() {
		return vnNetPay;
	}

	/**
	 * @param vnNetPay the vnNetPay to set
	 */
	public void setVnNetPay(int vnNetPay) {
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
