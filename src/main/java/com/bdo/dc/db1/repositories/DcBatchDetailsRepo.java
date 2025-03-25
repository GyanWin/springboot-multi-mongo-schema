package com.bdo.dc.db1.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bdo.dc.models.DcBatchDetails;

public interface DcBatchDetailsRepo extends MongoRepository<DcBatchDetails, String>{

}
