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

import co.edu.unbosque.payrollmanagementback.model.OrgAreaDTO;
import co.edu.unbosque.payrollmanagementback.service.OrgAreaService;

@RestController
@RequestMapping("/api/org-areas")
public class OrgAreaController {

    @Autowired
    private OrgAreaService orgAreaService;

    @GetMapping
    public ResponseEntity<List<OrgAreaDTO>> getAll() {
        List<OrgAreaDTO> list = orgAreaService.getAllAreas();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrgAreaDTO> getById(@PathVariable Integer id) {
        try {
            OrgAreaDTO dto = orgAreaService.getAreaById(id);
            return ResponseEntity.ok(dto);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<OrgAreaDTO> create(@RequestBody OrgAreaDTO dto) {
        OrgAreaDTO created = orgAreaService.saveArea(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrgAreaDTO> update(@PathVariable Integer id, @RequestBody OrgAreaDTO dto) {
        dto.setVnAreaId(id);
        OrgAreaDTO updated = orgAreaService.saveArea(dto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        try {
            orgAreaService.deleteArea(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
