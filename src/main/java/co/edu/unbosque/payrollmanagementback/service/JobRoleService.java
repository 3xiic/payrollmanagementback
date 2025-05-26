package co.edu.unbosque.payrollmanagementback.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.payrollmanagementback.model.JobRoleDTO;
import co.edu.unbosque.payrollmanagementback.model.JobRoleEntity;
import co.edu.unbosque.payrollmanagementback.repository.JobRoleRepository;

@Service
public class JobRoleService {

    @Autowired
    private JobRoleRepository jobRoleRepository;

    public List<JobRoleDTO> getAllRoles() {
        List<JobRoleEntity> entities = (List<JobRoleEntity>) jobRoleRepository.findAll();
        return entities.stream()
                .map(DataMapper::jobRoleEntityToDTO)
                .collect(Collectors.toList());
    }

    public JobRoleDTO getRoleById(Integer id) {
        return jobRoleRepository.findById(id)
                .map(DataMapper::jobRoleEntityToDTO)
                .orElse(null); 
    }

    public JobRoleDTO createRole(JobRoleDTO dto) {
        JobRoleEntity entity = DataMapper.jobRoleDTOtoEntity(dto);
        JobRoleEntity saved = jobRoleRepository.save(entity);
        return DataMapper.jobRoleEntityToDTO(saved);
    }

    public JobRoleDTO updateRole(Integer id, JobRoleDTO dto) {
        Optional<JobRoleEntity> existing = jobRoleRepository.findById(id);
        if (existing.isPresent()) {
            JobRoleEntity entity = DataMapper.jobRoleDTOtoEntity(dto);
            entity.setVnRoleId(id);
            JobRoleEntity updated = jobRoleRepository.save(entity);
            return DataMapper.jobRoleEntityToDTO(updated);
        }
        return null;
    }

    public void deleteRole(Integer id) {
        jobRoleRepository.deleteById(id);
    }
}


