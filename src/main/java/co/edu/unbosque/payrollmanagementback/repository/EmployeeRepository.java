package co.edu.unbosque.payrollmanagementback.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.unbosque.payrollmanagementback.model.EmployeeEntity;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {

}
