package ru.gb.oseminar.exception;

public class PersonalException extends IllegalArgumentException {

    public PersonalException(String message) {
        super(message);
    }

    public PersonalException(String message, Throwable cause) {
        super(message, cause);
    }
    
    
}
