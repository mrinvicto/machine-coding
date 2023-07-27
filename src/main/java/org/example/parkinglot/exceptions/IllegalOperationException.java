package org.example.parkinglot.exceptions;

public class IllegalOperationException extends RuntimeException{
    public IllegalOperationException(String message) {
        super(message);
    }
}
