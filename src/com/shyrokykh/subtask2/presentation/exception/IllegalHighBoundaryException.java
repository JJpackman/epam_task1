package com.shyrokykh.subtask2.presentation.exception;

public class IllegalHighBoundaryException extends Exception {
    private static final long serialVersionUID = -2818100111047651196L;

    public IllegalHighBoundaryException(String message) {
        super(message);
    }

    public IllegalHighBoundaryException(String message, Throwable cause) {
        super(message, cause);
    }
}
