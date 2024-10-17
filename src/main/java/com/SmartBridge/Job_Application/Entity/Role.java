package com.SmartBridge.Job_Application.Entity;

public enum Role {
    NORMAL_USER("ROLE_NORMAL_USER"),
    RECRUITER("ROLE_RECRUITER");

    private final String authority;

    Role(String authority) {
        this.authority = authority;
    }



    public String getAuthority() {
        return authority;
    }
}


