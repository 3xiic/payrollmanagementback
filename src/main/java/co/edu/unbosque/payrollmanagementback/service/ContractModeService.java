package co.edu.unbosque.payrollmanagementback.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import co.edu.unbosque.payrollmanagementback.model.ContractModeDTO;
import co.edu.unbosque.payrollmanagementback.model.ContractModeEntity;
import co.edu.unbosque.payrollmanagementback.repository.ContractModeRepository;

@Service
public class ContractModeService {

	private ContractModeRepository contractModeRepository;
	
	public ContractModeService() {
		// TODO Auto-generated constructor stub
	}
	  public List<ContractModeDTO> getAllModes() {
	        List<ContractModeEntity> entities = (List<ContractModeEntity>) contractModeRepository.findAll();
	        return entities.stream()
	                .map(DataMapper::modeEntitytoDTO)
	                .collect(Collectors.toList());
	    }

	    public ContractModeDTO getModeById(Integer id) {
	        return contractModeRepository.findById(id)
	                .map(DataMapper::modeEntitytoDTO)
	                .orElse(null); 
	    }

	    public ContractModeDTO createMode(ContractModeDTO dto) {
	    	ContractModeEntity entity = DataMapper.modeDTOtoEntity(dto);
	    	ContractModeEntity saved = contractModeRepository.save(entity);
	        return DataMapper.modeEntitytoDTO(saved);
	    }

	    public ContractModeDTO updateMode(Integer id, ContractModeDTO dto) {
	        Optional<ContractModeEntity> existing = contractModeRepository.findById(id);
	        if (existing.isPresent()) {
	        	ContractModeEntity entity = DataMapper.modeDTOtoEntity(dto);
	            entity.setVnModeId(id);
	            ContractModeEntity updated = contractModeRepository.save(entity);
	            return DataMapper.modeEntitytoDTO(updated);
	        }
	        return null;
	    }

	    public void deleteMode(Integer id) {
	    	contractModeRepository.deleteById(id);
	    }
		
}
