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

import co.edu.unbosque.payrollmanagementback.model.SalaryItemDTO;
import co.edu.unbosque.payrollmanagementback.service.SalaryItemService;

@RestController
@RequestMapping("/api/salary-items")
public class SalaryItemController {

    @Autowired
    private SalaryItemService salaryItemService;

    @GetMapping
    public ResponseEntity<List<SalaryItemDTO>> getAll() {
        List<SalaryItemDTO> list = salaryItemService.getAllSalaryItems();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalaryItemDTO> getById(@PathVariable Integer id) {
        try {
            SalaryItemDTO dto = salaryItemService.getSalaryItemById(id);
            return ResponseEntity.ok(dto);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<SalaryItemDTO> create(@RequestBody SalaryItemDTO dto) {
        SalaryItemDTO created = salaryItemService.saveSalaryItem(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SalaryItemDTO> update(@PathVariable Integer id, @RequestBody SalaryItemDTO dto) {
        dto.setVnItemdId(id);
        SalaryItemDTO updated = salaryItemService.saveSalaryItem(dto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        try {
            salaryItemService.deleteSalaryItem(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
