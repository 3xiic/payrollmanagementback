package co.edu.unbosque.payrollmanagementback.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import co.edu.unbosque.payrollmanagementback.model.EmployeeDTO;
import co.edu.unbosque.payrollmanagementback.model.EmployeeEntity;
import co.edu.unbosque.payrollmanagementback.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeService() {
		// TODO Auto-generated constructor stub
	}
	
	 public List<EmployeeDTO> getAllEmployees() {
	        List<EmployeeEntity> entities = (List<EmployeeEntity>) employeeRepository.findAll();
	        return entities.stream()
	                .map(DataMapper::employeeEntityToDTO)
	                .collect(Collectors.toList());
	    }

	    public EmployeeDTO getEmployeeById(Integer id) {
	        return employeeRepository.findById(id)
	                .map(DataMapper::employeeEntityToDTO)
	                .orElse(null); 
	    }

	    public EmployeeDTO createEmployee(EmployeeDTO dto) {
	    	EmployeeEntity entity = DataMapper.employeeDTOtoEntity(dto);
	    	EmployeeEntity saved = employeeRepository.save(entity);
	        return DataMapper.employeeEntityToDTO(saved);
	    }

	    public EmployeeDTO updateEmployee(Integer id, EmployeeDTO dto) {
	        Optional<EmployeeEntity> existing = employeeRepository.findById(id);
	        if (existing.isPresent()) {
	        	EmployeeEntity entity = DataMapper.employeeDTOtoEntity(dto);
	            entity.setVnEmployeeId(id);
	            EmployeeEntity updated = employeeRepository.save(entity);
	            return DataMapper.employeeEntityToDTO(updated);
	        }
	        return null;
	    }

	    public void deleteEmployee(Integer id) {
	    	employeeRepository.deleteById(id);
	    }
}
