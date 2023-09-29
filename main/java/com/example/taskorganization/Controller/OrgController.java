package com.example.taskorganization.Controller;

import com.example.taskorganization.Dto.OrgRequestDto;
import com.example.taskorganization.Dto.OrgResponseDto;
import com.example.taskorganization.Service.Orgserviceimpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orgs")
@RequiredArgsConstructor
public class OrgController {

    private final Orgserviceimpl orgserviceimpl;
    @GetMapping
    public List<OrgResponseDto> findAll(){
        return orgserviceimpl.findAll();

    }

    @PostMapping()
    public void create(@RequestBody OrgRequestDto orgRequestDto){
        orgserviceimpl.create(orgRequestDto);

    }
    @GetMapping("/id")
    public OrgResponseDto getById(@PathVariable Long id){
        return orgserviceimpl.getById(id);}

    @PutMapping("/id")
    public void uptade(@PathVariable Long id, @RequestBody OrgRequestDto orgRequestDto){
        orgserviceimpl.uptade(id,orgRequestDto);
    }




}
