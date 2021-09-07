package com.m2i.demomedical.api;

import com.m2i.demomedical.entities.PatientEntity;
import com.m2i.demomedical.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/ws/patient")
public class PatientAPIController {
//test push
    @Autowired
    PatientService ps;

    @GetMapping(path="", produces = "application/json")
    List<PatientEntity> all() {
        return (List<PatientEntity>) ps.getList();
    }

}
