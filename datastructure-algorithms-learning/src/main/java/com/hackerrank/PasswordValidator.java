package com.hackerrank;

import java.util.*;
public class PasswordValidator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        passwordValidator(s);
    }

    private static void passwordValidator(String password){
        if(passwordLenghtValidator(password)&& passwordAlphabetValidator(password)&&
                passwordNumberValidator(password)){
            System.out.println("VALID");
        }else{
            System.out.println("INVALID");
        }
        //It should have atleast one special character among these: [@, $, %, &, *].
    }

    //The password should have a minimum length of 8 characters.
    public static boolean passwordLenghtValidator(String password){
        return password.length()>7?true:false;
    }

    //It should have atleast one english alphabet which can either be lowercase or uppercase or both.
    public static boolean passwordAlphabetValidator(String password){
        return password.matches(".*[a-zA-Z]+.*")?true:false;
    }

    //It should have atleast one numeric character.
    public static boolean passwordNumberValidator(String password){
        return (password.matches(".*\\d.*")|| password.matches(".*[0-9].*"))?true:false;
    }



}