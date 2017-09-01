package com.archidel.gs.bean;

public enum UserProfileType {
    USER("USER"),
    ADMIN("ADMIN"),
    MODERATOR("MODERATOR");
    
    private String userProfileType;
    
    private UserProfileType(String userProfileType) {
	this.userProfileType = userProfileType;
    }

    public String getUserProfileType() {
        return userProfileType;
    }
    
}
