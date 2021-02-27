package com.JeffDziad;

public class MissingNameException extends Exception{

    public MissingNameException(String nameType){
        super(String.format("The field, %s, cannot be blank.", nameType));
    }

}
