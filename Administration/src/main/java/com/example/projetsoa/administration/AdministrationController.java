package com.example.projetsoa.administration;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdministrationController {
    private AdministrationRepository administrationRepository;
    public AdministrationController(){}
    public AdministrationController(AdministrationRepository administrationRepository) {this.administrationRepository = administrationRepository;}

    @GetMapping(path = "/administrators")
    public List<Administration> listAdministrator() {
        return administrationRepository.findAll();
    }


    @GetMapping(path = "/administrators/{id}")
    public Administration student(@PathVariable Long id) {
        return administrationRepository.findById(id).get();
    }

    @PostMapping(path = "/administrators")
    public Administration save(@RequestBody Administration student) {
        return administrationRepository.save(student);
    }
}
