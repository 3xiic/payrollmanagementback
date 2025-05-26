package co.edu.unbosque.payrollmanagementback.service;

import co.edu.unbosque.payrollmanagementback.model.ConfigParamaterDTO;
import co.edu.unbosque.payrollmanagementback.model.ConfigParamaterEntity;
import co.edu.unbosque.payrollmanagementback.model.ContractModeDTO;
import co.edu.unbosque.payrollmanagementback.model.ContractModeEntity;
import co.edu.unbosque.payrollmanagementback.model.EmployeeContractDTO;
import co.edu.unbosque.payrollmanagementback.model.EmployeeContractEntity;
import co.edu.unbosque.payrollmanagementback.model.EmployeeDTO;
import co.edu.unbosque.payrollmanagementback.model.EmployeeEntity;
import co.edu.unbosque.payrollmanagementback.model.JobRoleDTO;
import co.edu.unbosque.payrollmanagementback.model.JobRoleEntity;
import co.edu.unbosque.payrollmanagementback.model.OrgAreaDTO;
import co.edu.unbosque.payrollmanagementback.model.OrgAreaEntity;
import co.edu.unbosque.payrollmanagementback.model.PayrollMovementDTO;
import co.edu.unbosque.payrollmanagementback.model.PayrollMovementEntity;
import co.edu.unbosque.payrollmanagementback.model.PayrollRecordDTO;
import co.edu.unbosque.payrollmanagementback.model.PayrollRecordEntity;
import co.edu.unbosque.payrollmanagementback.model.PersonalInfoDTO;
import co.edu.unbosque.payrollmanagementback.model.PersonalInfoEntity;
import co.edu.unbosque.payrollmanagementback.model.SalaryItemDTO;
import co.edu.unbosque.payrollmanagementback.model.SalaryItemEntity;
import co.edu.unbosque.payrollmanagementback.model.SalaryPeriodDTO;
import co.edu.unbosque.payrollmanagementback.model.SalaryPeriodEntity;

public class DataMapper {

	
	public static ConfigParamaterEntity paramater(ConfigParamaterDTO dto) {
		return new ConfigParamaterEntity(dto.getVnParamId(), 
				dto.getVnParamKey(), 
				dto.getVnParamValue(),
				dto.getVcDescription(), 
				dto.getVcCreatedAt(), 
				dto.getVcUpdatedAt());
	}
	public static ConfigParamaterDTO paramaterEntitytoDTO(ConfigParamaterEntity entity) {
		return new ConfigParamaterDTO(entity.getVnParamId(), 
				entity.getVnParamKey(), 
				entity.getVnParamValue(),
				entity.getVcDescription(), 
				entity.getVcCreatedAt(), 
				entity.getVcUpdatedAt());
	}
	
	public static ContractModeEntity modeDTOtoEntity(ContractModeDTO dto) {
		return new ContractModeEntity(dto.getVnModeId(),
				dto.getVcModeName(),
				dto.getVcDescription(),
				dto.getVcCreatedAt(),
				dto.getVcUpdatedAt());
	}
	
	public static ContractModeDTO modeEntitytoDTO(ContractModeEntity entity) {
		return new ContractModeDTO(entity.getVnModeId(),
				entity.getVcModeName(),
				entity.getVcDescription(),
				entity.getVcCreatedAt(),
				entity.getVcUpdatedAt());
	}
	
	public static EmployeeContractEntity contractDTOtoEntity(EmployeeContractDTO dto) {
		return new EmployeeContractEntity(dto.getVnContractId(),
				dto.getVnEmployeeId(),
				dto.getVnModeId(),
				dto.getVcStartDate(),
				dto.getVcEndDate(),
				dto.getVnMonthlySalary(),
				dto.getVnHoursWeek(), 
				dto.getVcTerms(), 
				dto.getVcStatus(), 
				dto.getVcCreatedAt(),
				dto.getVcUpdatedAt());
	}
	public static EmployeeContractDTO contractEntitytoDTO(EmployeeContractEntity entity) {
		return new EmployeeContractDTO(entity.getVnContractId(),
				entity.getVnEmployeeId(),
				entity.getVnModeId(),
				entity.getVcStartDate(),
				entity.getVcEndDate(),
				entity.getVnMonthlySalary(),
				entity.getVnHoursWeek(), 
				entity.getVcTerms(), 
				entity.getVcStatus(), 
				entity.getVcCreatedAt(),
				entity.getVcUpdatedAt());
	}
	
	public static EmployeeEntity employeeDTOtoEntity(EmployeeDTO dto) {
		return new EmployeeEntity(dto.getVnEmployeeId(),
				dto.getVnPersonId(),
				dto.getVnRoleId(),
				dto.getVcHireDate(),
				dto.getVcBankAccount(),
				dto.getVcBankName(),
				dto.getVcAccountType(),
				dto.getVcStatus(),
				dto.getVcCreatedAt(),
				dto.getVcUpdatedAt());
	}
	public static EmployeeDTO employeeEntityToDTO(EmployeeEntity entity) {
		return new EmployeeDTO(entity.getVnEmployeeId(),
				entity.getVnPersonId(),
				entity.getVnRoleId(),
				entity.getVcHireDate(),
				entity.getVcBankAccount(),
				entity.getVcBankName(),
				entity.getVcAccountType(),
				entity.getVcStatus(),
				entity.getVcCreatedAt(),
				entity.getVcUpdatedAt());
	}
	

	public static JobRoleEntity jobRoleDTOtoEntity(JobRoleDTO dto) {
		return new JobRoleEntity(
			dto.getVnRoleId(),
			dto.getVcRoleName(),
			dto.getVnAreaId(),
			dto.getVnBaseSalary(),
			dto.getVcDescription(),
			dto.getVcCreatedAt(),
			dto.getVcUpdatedAt()
		);
	}

	public static JobRoleDTO jobRoleEntityToDTO(JobRoleEntity entity) {
		return new JobRoleDTO(
			entity.getVnRoleId(),
			entity.getVcRoleName(),
			entity.getVnAreaId(),
			entity.getVnBaseSalary(),
			entity.getVcDescription(),
			entity.getVcCreatedAt(),
			entity.getVcUpdatedAt()
		);
	}

	public static OrgAreaEntity orgAreaDTOtoEntity(OrgAreaDTO dto) {
		return new OrgAreaEntity(
			dto.getVnAreaId(),
			dto.getVcAreaName(),
			dto.getVcAreaDesc(),
			dto.getVcCreatedAt(),
			dto.getVcUpdatedAt()
		);
	}

	public static OrgAreaDTO orgAreaEntityToDTO(OrgAreaEntity entity) {
		return new OrgAreaDTO(
			entity.getVnAreaId(),
			entity.getVcAreaName(),
			entity.getVcAreaDesc(),
			entity.getVcCreatedAt(),
			entity.getVcUpdatedAt()
		);
	}

	public static PayrollMovementEntity payrollMovementDTOtoEntity(PayrollMovementDTO dto) {
		return new PayrollMovementEntity(
			dto.getVnMovementId(),
			dto.getVnPayrollId(),
			dto.getVnItemId(),
			dto.getVnAmount(),
			dto.getVcCreatedAt(),
			dto.getVcUpdatedAt()
		);
	}

	public static PayrollMovementDTO payrollMovementEntityToDTO(PayrollMovementEntity entity) {
		return new PayrollMovementDTO(
			entity.getVnMovementId(),
			entity.getVnPayrollId(),
			entity.getVnItemId(),
			entity.getVnAmount(),
			entity.getVcCreatedAt(),
			entity.getVcUpdatedAt()
		);
	}

	public static PayrollRecordEntity payrollRecordDTOtoEntity(PayrollRecordDTO dto) {
		return new PayrollRecordEntity(
			dto.getVnPayrollId(),
			dto.getVnEmployeeId(),
			dto.getVnPeriodId(),
			dto.getVnContractId(),
			dto.getVnSalaryBase(),
			dto.getVnDaysWorked(),
			dto.getVnTotalEarnings(),
			dto.getVnTotalDeductions(),
			dto.getVnNetPay(),
			dto.getVcStatus(),
			dto.getVcCreatedAt(),
			dto.getVcUpdatedAt()
		);
	}

	public static PayrollRecordDTO payrollRecordEntityToDTO(PayrollRecordEntity entity) {
		return new PayrollRecordDTO(
			entity.getVnPayrollId(),
			entity.getVnEmployeeId(),
			entity.getVnPeriodId(),
			entity.getVnContractId(),
			entity.getVnSalaryBase(),
			entity.getVnDaysWorked(),
			entity.getVnTotalEarnings(),
			entity.getVnTotalDeductions(),
			entity.getVnNetPay(),
			entity.getVcStatus(),
			entity.getVcCreatedAt(),
			entity.getVcUpdatedAt()
		);
	}

	public static PersonalInfoEntity personalInfoDTOtoEntity(PersonalInfoDTO dto) {
		return new PersonalInfoEntity(
			dto.getVnPersonId(),
			dto.getVcDocumentType(),
			dto.getVcDocumentNumber(),
			dto.getVcFirstName(),
			dto.getVcLastName(),
			dto.getVcBirthDate(),
			dto.getVcGender(),
			dto.getVcPhone(),
			dto.getVcEmail(),
			dto.getVcAddress(),
			dto.getVcCreatedAt(),
			dto.getVcUpdatedAt()
		);
	}

	public static PersonalInfoDTO personalInfoEntityToDTO(PersonalInfoEntity entity) {
		return new PersonalInfoDTO(
			entity.getVnPersonId(),
			entity.getVcDocumentType(),
			entity.getVcDocumentNumber(),
			entity.getVcFirstName(),
			entity.getVcLastName(),
			entity.getVcBirthDate(),
			entity.getVcGender(),
			entity.getVcPhone(),
			entity.getVcEmail(),
			entity.getVcAddress(),
			entity.getVcCreatedAt(),
			entity.getVcUpdatedAt()
		);
	}

	public static SalaryItemEntity salaryItemDTOtoEntity(SalaryItemDTO dto) {
		return new SalaryItemEntity(
			dto.getVnItemdId(),
			dto.getVcItemName(),
			dto.getVcItemType(),
			dto.getVcCalcType(),
			dto.getVnSocialSecurity(),
			dto.getParafiscal(),
			dto.getVcDescription(),
			dto.getVcCreatedAt(),
			dto.getVcUpdatedAt()
		);
	}

	public static SalaryItemDTO salaryItemEntityToDTO(SalaryItemEntity entity) {
		return new SalaryItemDTO(
			entity.getVnItemdId(),
			entity.getVcItemName(),
			entity.getVcItemType(),
			entity.getVcCalcType(),
			entity.getVnSocialSecurity(),
			entity.getParafiscal(),
			entity.getVcDescription(),
			entity.getVcCreatedAt(),
			entity.getVcUpdatedAt()
		);
	}

	public static SalaryPeriodEntity salaryPeriodDTOtoEntity(SalaryPeriodDTO dto) {
		return new SalaryPeriodEntity(
			dto.getVnPeriodId(),
			dto.getVcStartDate(),
			dto.getVcEndDate(),
			dto.getVcPaymentDate(),
			dto.getVcStatus(),
			dto.getVcDescription(),
			dto.getVcCreatedAt(),
			dto.getVcUpdatedAt()
		);
	}

	public static SalaryPeriodDTO salaryPeriodEntityToDTO(SalaryPeriodEntity entity) {
		return new SalaryPeriodDTO(
			entity.getVnPeriodId(),
			entity.getVcStartDate(),
			entity.getVcEndDate(),
			entity.getVcPaymentDate(),
			entity.getVcStatus(),
			entity.getVcDescription(),
			entity.getVcCreatedAt(),
			entity.getVcUpdatedAt()
		);
	}
} 

	

