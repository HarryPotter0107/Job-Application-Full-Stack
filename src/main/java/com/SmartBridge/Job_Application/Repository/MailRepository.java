package com.SmartBridge.Job_Application.Repository;

import com.SmartBridge.Job_Application.Entity.Email;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailRepository extends MongoRepository<Email,Long> {
}
