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

import co.edu.unbosque.payrollmanagementback.model.EmployeeContractDTO;
import co.edu.unbosque.payrollmanagementback.service.EmployeeContractService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/employee-contract")
@CrossOrigin(origins = "*")
public class EmployeeContractController {
	
	@Autowired
	private EmployeeContractService contractService;
	
	 @GetMapping
	    public List<EmployeeContractDTO> getAllContracts() {
	        return contractService.getAllContracts();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<EmployeeContractDTO> getContractById(@PathVariable Integer id) {
	    	EmployeeContractDTO Contract = contractService.getContractById(id);
	        return Contract != null ? ResponseEntity.ok(Contract) : ResponseEntity.notFound().build();
	    }

	    @PostMapping
	    public ResponseEntity<EmployeeContractDTO> createContract(@RequestBody EmployeeContractDTO dto) {
	    	EmployeeContractDTO created = contractService.createContract(dto);
	        return ResponseEntity.status(HttpStatus.CREATED).body(created);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<EmployeeContractDTO> updateContract(@PathVariable Integer id, @RequestBody EmployeeContractDTO dto) {
	    	EmployeeContractDTO updated = contractService.updateContract(id, dto);
	        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteContract(@PathVariable Integer id) {
	    	contractService.deleteContract(id);
	        return ResponseEntity.noContent().build();
	    }
}
