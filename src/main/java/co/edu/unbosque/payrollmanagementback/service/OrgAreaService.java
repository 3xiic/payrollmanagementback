package co.edu.unbosque.payrollmanagementback.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unbosque.payrollmanagementback.model.OrgAreaDTO;
import co.edu.unbosque.payrollmanagementback.model.OrgAreaEntity;
import co.edu.unbosque.payrollmanagementback.repository.OrgAreaRepository;

@Service
public class OrgAreaService {

	@Autowired
	private OrgAreaRepository areaRepository;

	public OrgAreaService() {
		// TODO Auto-generated constructor stub
	}

	public List<OrgAreaDTO> getAllAreas() {
		return StreamSupport.stream(areaRepository.findAll().spliterator(), false).map(DataMapper::orgAreaEntityToDTO)
				.collect(Collectors.toList());
	}

	public OrgAreaDTO getAreaById(Integer id) {
		return areaRepository.findById(id).map(DataMapper::orgAreaEntityToDTO)
				.orElseThrow(() -> new RuntimeException("Área no encontrada con ID: " + id));
	}

	public OrgAreaDTO saveArea(OrgAreaDTO dto) {
		OrgAreaEntity entity = DataMapper.orgAreaDTOtoEntity(dto);
		OrgAreaEntity savedEntity = areaRepository.save(entity);
		return DataMapper.orgAreaEntityToDTO(savedEntity);
	}

	public void deleteArea(Integer id) {
		if (!areaRepository.existsById(id)) {
			throw new RuntimeException("No existe el área con ID: " + id);
		}
		areaRepository.deleteById(id);
	}
}
