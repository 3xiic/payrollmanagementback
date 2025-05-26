package co.edu.unbosque.payrollmanagementback.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.payrollmanagementback.model.PayrollMovementDTO;
import co.edu.unbosque.payrollmanagementback.model.PayrollMovementEntity;
import co.edu.unbosque.payrollmanagementback.repository.PayrollMovementRepository;

@Service
public class PayrollMovementService {

    @Autowired
    private PayrollMovementRepository payrollMovementRepository;

    public List<PayrollMovementDTO> getAllMovements() {
        return StreamSupport.stream(payrollMovementRepository.findAll().spliterator(), false)
                .map(DataMapper::payrollMovementEntityToDTO)
                .collect(Collectors.toList());
    }

    public PayrollMovementDTO getMovementById(Integer id) {
        return payrollMovementRepository.findById(id)
                .map(DataMapper::payrollMovementEntityToDTO)
                .orElseThrow(() -> new RuntimeException("Movimiento de nómina no encontrado con ID: " + id));
    }

    public PayrollMovementDTO saveMovement(PayrollMovementDTO dto) {
        PayrollMovementEntity entity = DataMapper.payrollMovementDTOtoEntity(dto);
        PayrollMovementEntity savedEntity = payrollMovementRepository.save(entity);
        return DataMapper.payrollMovementEntityToDTO(savedEntity);
    }

    public void deleteMovement(Integer id) {
        if (!payrollMovementRepository.existsById(id)) {
            throw new RuntimeException("No existe el movimiento de nómina con ID: " + id);
        }
        payrollMovementRepository.deleteById(id);
    }
}
