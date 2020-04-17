/*
 * @(#)SpotTypeController.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking.controller;

import com.project.Smartparking.dao.SpotTypeRepository;
import com.project.Smartparking.model.SpotType;
import com.project.Smartparking.service.SpotTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

/**
 * SpotTypeController class which handles the requests POST, PUT, GET and DELETE.
 * @author Deepthi N
 * @version 1.0
 */

@RestController
public class SpotTypeController {
    @Autowired
    SpotTypeRepository spottypeRepository;

    @Autowired
    SpotTypeService spotTypeService;

    // Adding Spot types

    @CrossOrigin(origins ="*", allowedHeaders ="*")
    @PostMapping("/spot/saveSpot")
    public Object addSpotType(@Valid @RequestBody SpotType spotTypeObj) {
        return spotTypeService.createSpotTypeRepository(spotTypeObj);
    }

    // Updating Spot types

    @CrossOrigin(origins ="*", allowedHeaders ="*")
    @PutMapping("/spot/updateSpot")
    public SpotType updateSpotType(@Valid @RequestBody SpotType spotTypeObj) {
        return spottypeRepository.save(spotTypeObj);
    }

    // Reading all Spot types

    @CrossOrigin(origins ="*", allowedHeaders ="*")
    @GetMapping("/spot/all")
    public List<SpotType> getAllSpotType() {
        return spottypeRepository.findAll();
    }

    // Reading Spot type by Id

    @CrossOrigin(origins ="*", allowedHeaders ="*")
    @GetMapping("/spot/{spottypeId}")
    public Optional<SpotType> getSpotTypeById(@PathVariable(value = "spottypeId") String spottypeId) {
        Optional<SpotType> spotTypeObj = spottypeRepository.findById(spottypeId);
        return spotTypeObj;
    }

    // Deleting Spot types

    @CrossOrigin(origins ="*", allowedHeaders ="*")
    @DeleteMapping(value = "/spot/{spottypeId}")
    public void deleteSpotType(@PathVariable(name = "spottypeId") String spottypeId) {
        spottypeRepository.deleteById(spottypeId);
    }
}


