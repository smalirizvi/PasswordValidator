package com.example.smar.passwordvalidator;

/**
 * Created by SMAR on 2/7/2018.
 */

public class Validator {
    public static boolean validate(String password){
        if(!(password.toUpperCase().equals("PASSWORD")) && !(password.length() < 8)){
            return true;
        }else{
            return false;
        }
    }
}

