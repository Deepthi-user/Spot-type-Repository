/*
 * @(#)SpotTypeRepository.java 1.8 06/04/20
 * Copyright (c) 2020-2021
 */

package com.project.Smartparking.dao;

import com.project.Smartparking.model.SpotType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * SpotTypeRepository is an interface and extend from MongoRepository which contains all the CRUD operations.
 * @author Deepthi N
 * @version 1.0
 */

@Repository
public interface SpotTypeRepository extends MongoRepository<SpotType, String> {
}
