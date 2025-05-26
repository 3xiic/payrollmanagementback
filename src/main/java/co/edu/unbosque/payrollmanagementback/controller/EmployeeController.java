package co.edu.unbosque.payrollmanagementback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.payrollmanagementback.model.EmployeeDTO;
import co.edu.unbosque.payrollmanagementback.model.EmployeeEntity;
import co.edu.unbosque.payrollmanagementback.service.EmployeeService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "*")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	 @GetMapping
	    public List<EmployeeDTO> getAllEmployees() {
	        return employeeService.getAllEmployees();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable Integer id) {
	    	EmployeeDTO Employee = employeeService.getEmployeeById(id);
	        return Employee != null ? ResponseEntity.ok(Employee) : ResponseEntity.notFound().build();
	    }

	    @PostMapping
	    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO dto) {
	    	EmployeeDTO created = employeeService.createEmployee(dto);
	        return ResponseEntity.status(HttpStatus.CREATED).body(created);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Integer id, @RequestBody EmployeeDTO dto) {
	    	EmployeeDTO updated = employeeService.updateEmployee(id, dto);
	        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id) {
	    	employeeService.deleteEmployee(id);
	        return ResponseEntity.noContent().build();
	    }
}
