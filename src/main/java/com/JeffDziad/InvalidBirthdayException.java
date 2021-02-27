package com.JeffDziad;

public class InvalidBirthdayException extends Exception{

    public InvalidBirthdayException(int year, int month, int day){
        super(String.format("The given date, %d/%d/%d, is not a valid birthday.", month, day, year));
    }

}
