package com.SmartBridge.Job_Application.Repository;

import com.SmartBridge.Job_Application.Entity.CompanyDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends MongoRepository<CompanyDetails, String> {

    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
    List<CompanyDetails> searchByTitle(String query);
    @Query("{ 'location': { $regex: ?0, $options: 'i' } }")
    List<CompanyDetails> searchByLocation(String location);
    @Query("{ 'jobMode' : { $regex: ?0, $options: 'i' } }")
    List<CompanyDetails> findByJobModeIgnoreCaseContaining(String jobMode);
}
