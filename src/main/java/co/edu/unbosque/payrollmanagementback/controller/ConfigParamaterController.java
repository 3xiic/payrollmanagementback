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

import co.edu.unbosque.payrollmanagementback.model.ConfigParamaterDTO;
import co.edu.unbosque.payrollmanagementback.service.ConfigParamaterService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/config-paramater")
@CrossOrigin(origins = "*")
public class ConfigParamaterController {

	  @Autowired
	    private ConfigParamaterService paramaterService;

	    @GetMapping
	    public List<ConfigParamaterDTO> getAllParameters() {
	        return paramaterService.getAllParameters();
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<ConfigParamaterDTO> getParameterById(@PathVariable Long id) {
	    	ConfigParamaterDTO Parameter = paramaterService.getParameterById(id);
	        return Parameter != null ? ResponseEntity.ok(Parameter) : ResponseEntity.notFound().build();
	    }

	    @PostMapping
	    public ResponseEntity<ConfigParamaterDTO> createParameter(@RequestBody ConfigParamaterDTO dto) {
	    	ConfigParamaterDTO created = paramaterService.createParameter(dto);
	        return ResponseEntity.status(HttpStatus.CREATED).body(created);
	    }

	    @PutMapping("/{id}")
	    public ResponseEntity<ConfigParamaterDTO> updateParameter(@PathVariable Long id, @RequestBody ConfigParamaterDTO dto) {
	    	ConfigParamaterDTO updated = paramaterService.updateParameter(id, dto);
	        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteParameter(@PathVariable Long id) {
	    	paramaterService.deleteParameter(id);
	        return ResponseEntity.noContent().build();
	    }
}
