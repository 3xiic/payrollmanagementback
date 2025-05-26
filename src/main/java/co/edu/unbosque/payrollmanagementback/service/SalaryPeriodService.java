package co.edu.unbosque.payrollmanagementback.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.payrollmanagementback.model.SalaryPeriodDTO;
import co.edu.unbosque.payrollmanagementback.model.SalaryPeriodEntity;
import co.edu.unbosque.payrollmanagementback.repository.SalaryPeriodRepository;

@Service
public class SalaryPeriodService {

    @Autowired
    private SalaryPeriodRepository salaryPeriodRepository;

    public List<SalaryPeriodDTO> getAllSalaryPeriods() {
        return StreamSupport.stream(salaryPeriodRepository.findAll().spliterator(), false)
                .map(DataMapper::salaryPeriodEntityToDTO)
                .collect(Collectors.toList());
    }

    public SalaryPeriodDTO getSalaryPeriodById(Integer id) {
        return salaryPeriodRepository.findById(id)
                .map(DataMapper::salaryPeriodEntityToDTO)
                .orElseThrow(() -> new RuntimeException("SalaryPeriod no encontrado con ID: " + id));
    }

    public SalaryPeriodDTO saveSalaryPeriod(SalaryPeriodDTO dto) {
        SalaryPeriodEntity entity = DataMapper.salaryPeriodDTOtoEntity(dto);
        SalaryPeriodEntity savedEntity = salaryPeriodRepository.save(entity);
        return DataMapper.salaryPeriodEntityToDTO(savedEntity);
    }

    public void deleteSalaryPeriod(Integer id) {
        if (!salaryPeriodRepository.existsById(id)) {
            throw new RuntimeException("SalaryPeriod no existe con ID: " + id);
        }
        salaryPeriodRepository.deleteById(id);
    }
}
