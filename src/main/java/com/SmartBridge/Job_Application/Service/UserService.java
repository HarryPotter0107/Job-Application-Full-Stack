package com.SmartBridge.Job_Application.Service;

import com.SmartBridge.Job_Application.Entity.CustomUser;
import com.SmartBridge.Job_Application.Entity.Role;
import org.springframework.stereotype.Service;

@Service
public interface UserService {


    CustomUser saveUser(CustomUser customUser, Role role);

    public void removeSessionMessage();


    String encodePassword(String password);

    // Fetch user by email
    CustomUser getUserByEmail(String email);


}
