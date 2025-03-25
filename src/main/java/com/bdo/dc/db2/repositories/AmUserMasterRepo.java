package com.bdo.dc.db2.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bdo.dc.models.AmUserMaster;

public interface AmUserMasterRepo extends MongoRepository<AmUserMaster, Long>{

}
