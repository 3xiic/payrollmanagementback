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

import co.edu.unbosque.payrollmanagementback.model.PersonalInfoDTO;
import co.edu.unbosque.payrollmanagementback.service.PersonalInfoService;

@RestController
@RequestMapping("/api/personal-info")
public class PersonalInfoController {

    @Autowired
    private PersonalInfoService personalInfoService;

    @GetMapping
    public ResponseEntity<List<PersonalInfoDTO>> getAll() {
        List<PersonalInfoDTO> list = personalInfoService.getAllPersonalInfo();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonalInfoDTO> getById(@PathVariable Long id) {
        try {
            PersonalInfoDTO dto = personalInfoService.getPersonalInfoById(id);
            return ResponseEntity.ok(dto);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<PersonalInfoDTO> create(@RequestBody PersonalInfoDTO dto) {
        PersonalInfoDTO created = personalInfoService.savePersonalInfo(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonalInfoDTO> update(@PathVariable Long id, @RequestBody PersonalInfoDTO dto) {
        dto.setVnPersonId(id);
        PersonalInfoDTO updated = personalInfoService.savePersonalInfo(dto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        try {
            personalInfoService.deletePersonalInfo(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
