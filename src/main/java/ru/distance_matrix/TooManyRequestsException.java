package ru.distance_matrix;

public class TooManyRequestsException extends Exception{
    public TooManyRequestsException(String message) {
        super(message);
    }
}
