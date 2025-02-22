package com.SmartBridge.Job_Application.Service;

import com.SmartBridge.Job_Application.Entity.candidatedetails;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface candidateService {


    List<candidatedetails> getAllCandidates(String fileName);

    ObjectId saveJobDetails(MultipartFile file, candidatedetails candidatedetails) throws IOException;

    void deleteJobDetailsById(Long id);



    byte[] getCandidateFileData(String candidateId);


    String getCandidateContentType(String candidateId);

    String getCandidateFileName(String candidateId);

}



