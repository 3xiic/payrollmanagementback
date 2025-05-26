package co.edu.unbosque.payrollmanagementback.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.payrollmanagementback.model.PayrollMovementEntity;

public interface PayrollMovementRepository extends CrudRepository<PayrollMovementEntity, Integer> {

}
