package co.edu.unbosque.payrollmanagementback.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.payrollmanagementback.model.EmployeeContractDTO;
import co.edu.unbosque.payrollmanagementback.model.EmployeeContractEntity;
import co.edu.unbosque.payrollmanagementback.repository.EmployeeContractRepository;

@Service
public class EmployeeContractService {

	@Autowired
	private EmployeeContractRepository contractRepository;
	
	public EmployeeContractService() {
		// TODO Auto-generated constructor stub
	}
	
	 public List<EmployeeContractDTO> getAllContracts() {
	        List<EmployeeContractEntity> entities = (List<EmployeeContractEntity>) contractRepository.findAll();
	        return entities.stream()
	                .map(DataMapper::contractEntitytoDTO)
	                .collect(Collectors.toList());
	    }

	    public EmployeeContractDTO getContractById(Long id) {
	        return contractRepository.findById(id)
	                .map(DataMapper::contractEntitytoDTO)
	                .orElse(null); 
	    }

	    public EmployeeContractDTO createContract(EmployeeContractDTO dto) {
	    	EmployeeContractEntity entity = DataMapper.contractDTOtoEntity(dto);
	    	EmployeeContractEntity saved = contractRepository.save(entity);
	        return DataMapper.contractEntitytoDTO(saved);
	    }

	    public EmployeeContractDTO updateContract(Long id, EmployeeContractDTO dto) {
	        Optional<EmployeeContractEntity> existing = contractRepository.findById(id);
	        if (existing.isPresent()) {
	        	EmployeeContractEntity entity = DataMapper.contractDTOtoEntity(dto);
	            entity.setVnContractId(id);
	            EmployeeContractEntity updated = contractRepository.save(entity);
	            return DataMapper.contractEntitytoDTO(updated);
	        }
	        return null;
	    }

	    public void deleteContract(Long id) {
	    	contractRepository.deleteById(id);
	    }
}
