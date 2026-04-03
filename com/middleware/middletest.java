package com.middleware;

public class middletest {
    String storename = "Aryan";
    String storepassword ="Pass";
    public boolean login(String username, String password){
        if(username.equals(storename) && password.equals(storepassword)){
            return true;
        } else {
            return false;
        }
    }
}
