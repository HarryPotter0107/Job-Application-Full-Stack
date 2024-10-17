package com.SmartBridge.Job_Application.Service;

import com.SmartBridge.Job_Application.Entity.FileInfo;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface FileService {
    ObjectId saverandom(MultipartFile file, FileInfo fileInfo) throws IOException;

    String getContentType(String staticCandidateId);

    String getFileName(String staticCandidateId);

    byte[] getFileData(String staticCandidateId);

    List<FileInfo> getAllfiles(String fileName);



//    ResponseEntity<GridFsResource> getResumeFile(String fileName);
}

