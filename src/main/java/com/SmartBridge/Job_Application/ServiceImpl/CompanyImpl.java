package com.SmartBridge.Job_Application.ServiceImpl;



import com.SmartBridge.Job_Application.Entity.CompanyDetails;
import com.SmartBridge.Job_Application.Repository.CompanyRepository;
import com.SmartBridge.Job_Application.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.core.query.TextQuery;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompanyImpl implements CompanyService {
    private CompanyDetails companyDetails;
    @Autowired
    public CompanyImpl(MongoTemplate template, com.SmartBridge.Job_Application.Repository.CompanyRepository companyRepository, com.SmartBridge.Job_Application.Repository.CompanyRepository companyRepository1) {
        this.template = template;
        CompanyRepository = companyRepository1;
    }

    private MongoTemplate template;

    private final CompanyRepository CompanyRepository;

    public CompanyImpl(CompanyRepository companyDetailsRepository) {
        this.CompanyRepository = companyDetailsRepository;
    }


    @Override
    public List<CompanyDetails> getAllCompanyDetails() {
        return CompanyRepository.findAll();
    }



    @Override
    public CompanyDetails saveCompanyDetails(CompanyDetails companyDetails) {
        return CompanyRepository.save(companyDetails);
    }

    @Override
    public void deleteCompanyDetailsById(Long id)   {
        CompanyRepository.deleteById(String.valueOf(id));

    }


}


