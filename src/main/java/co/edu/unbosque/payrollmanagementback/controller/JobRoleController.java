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

import co.edu.unbosque.payrollmanagementback.model.JobRoleDTO;
import co.edu.unbosque.payrollmanagementback.service.JobRoleService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/job-roles")
@CrossOrigin(origins = "*")
public class JobRoleController {

    @Autowired
    private JobRoleService jobRoleService;

    @GetMapping
    public ResponseEntity<List<JobRoleDTO>> getAll() {
        List<JobRoleDTO> list = jobRoleService.getAllRoles();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobRoleDTO> getById(@PathVariable Long id) {
        try {
            JobRoleDTO dto = jobRoleService.getRoleById(id);
            return ResponseEntity.ok(dto);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<JobRoleDTO> create(@RequestBody JobRoleDTO dto) {
        JobRoleDTO created = jobRoleService.createRole(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobRoleDTO> update(@PathVariable Long id, @RequestBody JobRoleDTO dto) {
        dto.setVnRoleId(id);
        JobRoleDTO updated = jobRoleService.createRole(dto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        try {
            jobRoleService.deleteRole(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
