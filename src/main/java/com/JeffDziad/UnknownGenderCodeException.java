package com.JeffDziad;

public class UnknownGenderCodeException extends Exception{

    public UnknownGenderCodeException(char genderCode){
        super(String.format("The gender code, %c, is not valid."));
    }

}
