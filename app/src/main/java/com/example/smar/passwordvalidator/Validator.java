package com.example.smar.passwordvalidator;

/**
 * Created by SMAR on 2/7/2018.
 */

public class Validator {
    public static boolean validate(String password){
        if(!password.equals("password") &&
                password.length() >= 8 && //make sure length is 8 or more
                password.matches(".*[a-z].*") && //atleast 1 lowercase
                password.matches(".*[A-Z].*")&&//atleast 1 uppercase
                password.matches(".*[$&+,:;=?@#|'<>.-^*()%!].*") &&//atleast 1 special character
                password.matches(".*[0-9].*")) {//atleast 1 digit
            return true;
        }
        else{
            return false;
        }
    }
}

