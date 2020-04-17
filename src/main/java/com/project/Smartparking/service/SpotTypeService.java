/*
 * @(#)SpotTypeService.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking.service;

import com.project.Smartparking.dao.SpotTypeRepository;
import com.project.Smartparking.model.SpotType;
import com.project.Smartparking.utilities.ErrorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

/**
 * SpotTypeService is used for checks  for the unique SpottypeId in the repository.
 * @author Deepthi N
 * @version 1.0
 */

@Service
public class SpotTypeService {
    @Autowired
    private SpotTypeRepository spotTypeRepository;

    /**
     * Method will either sends an error response or save the spottype object to repository.
     * @param spotTypeObj - it is an object of SpotType class
     * @return - It will be either object of error response or object of SpotType class.
     */

    public Object createSpotTypeRepository(SpotType spotTypeObj) {
        String spotTypeId = spotTypeObj.getSpotTypeId();
        Boolean ifSpotTypeIdExists = this.checkIfSpottypeIdExists(spotTypeId);
        if (ifSpotTypeIdExists) {
            ErrorResponse errObj = new ErrorResponse("spottypeId already exists");
            return errObj;

        }
        else {
            return spotTypeRepository.save(spotTypeObj);
        }
    }

    /**
     * Method checks whether the SpotTypeId exists or not.
     * @param spotTypeId String type
     * @return Boolean value
     */

    public boolean checkIfSpottypeIdExists(String spotTypeId) {
        Optional<SpotType> optionalObj = spotTypeRepository.findById(spotTypeId);
        if (optionalObj.isPresent()) {
            return true;
        }
        return false;
    }
}