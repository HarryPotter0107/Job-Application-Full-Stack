package com.SmartBridge.Job_Application.Service;



import com.SmartBridge.Job_Application.Entity.Email;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
public interface EmailService {



    void sendEmail(Email email) throws MessagingException;
}

