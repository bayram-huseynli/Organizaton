package com.example.taskorganization.Service;

import com.example.taskorganization.Dto.OrgRequestDto;
import com.example.taskorganization.Dto.OrgResponseDto;
import com.example.taskorganization.Entity.Organization;
import com.example.taskorganization.Repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrganizzationService implements Orgserviceimpl {
    private final ModelMapper modelMapper;
    private final OrganizationRepository organizationRepository;


    public List<OrgResponseDto> findAll(){
        return organizationRepository
                .findAll()
                .stream()
                .map(organization -> modelMapper.map(organization,OrgResponseDto.class))
                .toList();


    }

    @Override
    public void create(OrgRequestDto orgRequestDto){
        Organization organization=modelMapper.map(orgRequestDto,Organization.class);
        organizationRepository.save(organization);
    }

    @Override
    public OrgResponseDto getById(Long id) {
        Organization organization=organizationRepository.findById(id).orElseThrow(()-> new RuntimeException());
        return modelMapper.map(organization,OrgResponseDto.class);
    }

    @Override
    public void uptade(Long id,OrgRequestDto orgRequestDto) {
        Organization organization=organizationRepository.findById(id).get();
        organization.setName((orgRequestDto.getName()));
        organization.setEmployees(orgRequestDto.getEmployees());
        organizationRepository.save(organization);




    }
}
