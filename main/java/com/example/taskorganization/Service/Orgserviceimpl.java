package com.example.taskorganization.Service;

import com.example.taskorganization.Dto.OrgRequestDto;
import com.example.taskorganization.Dto.OrgResponseDto;

import java.util.List;

public interface Orgserviceimpl {
    List<OrgResponseDto> findAll();
    void create(OrgRequestDto orgRequestDto);
    OrgResponseDto getById(Long id);
    void uptade(Long id,OrgRequestDto orgRequestDto);
}
