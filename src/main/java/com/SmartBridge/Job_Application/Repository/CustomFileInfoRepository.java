package com.SmartBridge.Job_Application.Repository;

import com.SmartBridge.Job_Application.Entity.FileInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomFileInfoRepository extends MongoRepository<FileInfo, String> {
}
