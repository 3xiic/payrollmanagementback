package co.edu.unbosque.payrollmanagementback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.payrollmanagementback.model.PayrollMovementDTO;
import co.edu.unbosque.payrollmanagementback.service.PayrollMovementService;

@RestController
@RequestMapping("/api/payroll-movements")
public class PayrollMovementController {

    @Autowired
    private PayrollMovementService payrollMovementService;

    @GetMapping
    public ResponseEntity<List<PayrollMovementDTO>> getAll() {
        List<PayrollMovementDTO> list = payrollMovementService.getAllMovements();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PayrollMovementDTO> getById(@PathVariable Integer id) {
        try {
            PayrollMovementDTO dto = payrollMovementService.getMovementById(id);
            return ResponseEntity.ok(dto);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<PayrollMovementDTO> create(@RequestBody PayrollMovementDTO dto) {
        PayrollMovementDTO created = payrollMovementService.saveMovement(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PayrollMovementDTO> update(@PathVariable Integer id, @RequestBody PayrollMovementDTO dto) {
        dto.setVnMovementId(id);
        PayrollMovementDTO updated = payrollMovementService.saveMovement(dto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        try {
            payrollMovementService.deleteMovement(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
