package ru.distance_matrix;

public class ColsMoreHundredException extends Exception {
    public ColsMoreHundredException() {
        super();
    }

    public ColsMoreHundredException(String message) {
        super(message);
    }

    public ColsMoreHundredException(String message, Throwable cause) {
        super(message, cause);
    }

    public ColsMoreHundredException(Throwable cause) {
        super(cause);
    }
}