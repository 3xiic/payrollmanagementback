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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.payrollmanagementback.model.ContractModeDTO;
import co.edu.unbosque.payrollmanagementback.service.ContractModeService;

@RestController
@RequestMapping("/api/contract-mode")
@CrossOrigin(origins = "*")
public class ContractModeController {

	  @Autowired
	    private ContractModeService modeService;

	    @GetMapping
	    public List<ContractModeDTO> getAllModes() {
	        return modeService.getAllModes();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<ContractModeDTO> getModeById(@PathVariable Long id) {
	    	ContractModeDTO Mode = modeService.getModeById(id);
	        return Mode != null ? ResponseEntity.ok(Mode) : ResponseEntity.notFound().build();
	    }

	    @PostMapping
	    public ResponseEntity<ContractModeDTO> createMode(@RequestBody ContractModeDTO dto) {
	    	ContractModeDTO created = modeService.createMode(dto);
	        return ResponseEntity.status(HttpStatus.CREATED).body(created);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<ContractModeDTO> updateMode(@PathVariable Long id, @RequestBody ContractModeDTO dto) {
	    	ContractModeDTO updated = modeService.updateMode(id, dto);
	        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteMode(@PathVariable Long id) {
	    	modeService.deleteMode(id);
	        return ResponseEntity.noContent().build();
	    }
}

