package co.edu.unbosque.payrollmanagementback.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.payrollmanagementback.model.PersonalInfoDTO;
import co.edu.unbosque.payrollmanagementback.model.PersonalInfoEntity;
import co.edu.unbosque.payrollmanagementback.repository.PersonalInfoRepository;

@Service
public class PersonalInfoService {

    @Autowired
    private PersonalInfoRepository personalInfoRepository;

    public List<PersonalInfoDTO> getAllPersonalInfo() {
        return StreamSupport.stream(personalInfoRepository.findAll().spliterator(), false)
                .map(DataMapper::personalInfoEntityToDTO)
                .collect(Collectors.toList());
    }

    public PersonalInfoDTO getPersonalInfoById(Long id) {
        return personalInfoRepository.findById(id)
                .map(DataMapper::personalInfoEntityToDTO)
                .orElseThrow(() -> new RuntimeException("Información personal no encontrada con ID: " + id));
    }

    public PersonalInfoDTO savePersonalInfo(PersonalInfoDTO dto) {
        PersonalInfoEntity entity = DataMapper.personalInfoDTOtoEntity(dto);
        PersonalInfoEntity savedEntity = personalInfoRepository.save(entity);
        return DataMapper.personalInfoEntityToDTO(savedEntity);
    }

    public void deletePersonalInfo(Long id) {
        if (!personalInfoRepository.existsById(id)) {
            throw new RuntimeException("Información personal no existe con ID: " + id);
        }
        personalInfoRepository.deleteById(id);
    }
}


