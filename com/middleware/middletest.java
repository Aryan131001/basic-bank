package com.middleware;

import java.util.ArrayList;

import com.accountType.saving;

public class middletest {

    public int login(String loginname, String loginpassword,ArrayList<Object>acc){
       for(int i=0;i<acc.size();i++){
            Object account = acc.get(i);
            if(account instanceof saving){
                System.out.println("Hello");
                saving sa = (saving) account;
                System.out.println("Username stored is "+sa.username);
                if(sa.username.equals(loginname) && (sa.password).equals(loginpassword)){   
                    System.out.println("i+1 is "+(i+1));   
                        return i+1;
                }
            }
       }
       return -1;
    }
}
