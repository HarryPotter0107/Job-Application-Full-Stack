package com.SmartBridge.Job_Application.Repository;

import com.SmartBridge.Job_Application.Entity.candidatedetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends MongoRepository<candidatedetails, String> {

}
