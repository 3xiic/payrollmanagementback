package co.edu.unbosque.payrollmanagementback.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.payrollmanagementback.model.ConfigParamaterDTO;
import co.edu.unbosque.payrollmanagementback.model.ConfigParamaterEntity;
import co.edu.unbosque.payrollmanagementback.repository.ConfigParameterRepository;

@Service
public class ConfigParamaterService {
	

    @Autowired
    private ConfigParameterRepository parameterRepository;

    public List<ConfigParamaterDTO> getAllParameters() {
        List<ConfigParamaterEntity> entities = (List<ConfigParamaterEntity>) parameterRepository.findAll();
        return entities.stream()
                .map(DataMapper::paramaterEntitytoDTO)
                .collect(Collectors.toList());
    }

    public ConfigParamaterDTO getParameterById(Long id) {
        return parameterRepository.findById(id)
                .map(DataMapper::paramaterEntitytoDTO)
                .orElse(null); 
    }

    public ConfigParamaterDTO createParameter(ConfigParamaterDTO dto) {
    	ConfigParamaterEntity entity = DataMapper.paramater(dto);
    	ConfigParamaterEntity saved = parameterRepository.save(entity);
        return DataMapper.paramaterEntitytoDTO(saved);
    }

    public ConfigParamaterDTO updateParameter(Long id, ConfigParamaterDTO dto) {
        Optional<ConfigParamaterEntity> existing = parameterRepository.findById(id);
        if (existing.isPresent()) {
        	ConfigParamaterEntity entity = DataMapper.paramater(dto);
            entity.setVnParamId(id);
            ConfigParamaterEntity updated = parameterRepository.save(entity);
            return DataMapper.paramaterEntitytoDTO(updated);
        }
        return null;
    }

    public void deleteParameter(Long id) {
    	parameterRepository.deleteById(id);
    }
	
}
