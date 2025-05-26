package co.edu.unbosque.payrollmanagementback.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.payrollmanagementback.model.PayrollRecordDTO;
import co.edu.unbosque.payrollmanagementback.model.PayrollRecordEntity;
import co.edu.unbosque.payrollmanagementback.repository.PayrollRecordRepository;

@Service
public class PayrollRecordService {

    @Autowired
    private PayrollRecordRepository payrollRecordRepository;

    public List<PayrollRecordDTO> getAllRecords() {
        return StreamSupport.stream(payrollRecordRepository.findAll().spliterator(), false)
                .map(DataMapper::payrollRecordEntityToDTO)
                .collect(Collectors.toList());
    }

    public PayrollRecordDTO getRecordById(Integer id) {
        return payrollRecordRepository.findById(id)
                .map(DataMapper::payrollRecordEntityToDTO)
                .orElseThrow(() -> new RuntimeException("Registro de nómina no encontrado con ID: " + id));
    }

    public PayrollRecordDTO saveRecord(PayrollRecordDTO dto) {
        PayrollRecordEntity entity = DataMapper.payrollRecordDTOtoEntity(dto);
        PayrollRecordEntity savedEntity = payrollRecordRepository.save(entity);
        return DataMapper.payrollRecordEntityToDTO(savedEntity);
    }

    public void deleteRecord(Integer id) {
        if (!payrollRecordRepository.existsById(id)) {
            throw new RuntimeException("No existe el registro de nómina con ID: " + id);
        }
        payrollRecordRepository.deleteById(id);
    }
}

