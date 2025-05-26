package co.edu.unbosque.payrollmanagementback.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.payrollmanagementback.model.SalaryItemDTO;
import co.edu.unbosque.payrollmanagementback.model.SalaryItemEntity;
import co.edu.unbosque.payrollmanagementback.repository.SalaryItemRepository;

@Service
public class SalaryItemService {

    @Autowired
    private SalaryItemRepository salaryItemRepository;

    public List<SalaryItemDTO> getAllSalaryItems() {
        return StreamSupport.stream(salaryItemRepository.findAll().spliterator(), false)
                .map(DataMapper::salaryItemEntityToDTO)
                .collect(Collectors.toList());
    }

    public SalaryItemDTO getSalaryItemById(Long id) {
        return salaryItemRepository.findById(id)
                .map(DataMapper::salaryItemEntityToDTO)
                .orElseThrow(() -> new RuntimeException("SalaryItem no encontrado con ID: " + id));
    }

    public SalaryItemDTO saveSalaryItem(SalaryItemDTO dto) {
        SalaryItemEntity entity = DataMapper.salaryItemDTOtoEntity(dto);
        SalaryItemEntity savedEntity = salaryItemRepository.save(entity);
        return DataMapper.salaryItemEntityToDTO(savedEntity);
    }

    public void deleteSalaryItem(Long id) {
        if (!salaryItemRepository.existsById(id)) {
            throw new RuntimeException("SalaryItem no existe con ID: " + id);
        }
        salaryItemRepository.deleteById(id);
    }
}
