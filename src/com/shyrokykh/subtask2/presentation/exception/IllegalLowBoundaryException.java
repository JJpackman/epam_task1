package com.shyrokykh.subtask2.presentation.exception;

public class IllegalLowBoundaryException extends Exception {
    private static final long serialVersionUID = 3240778682338044747L;

    public IllegalLowBoundaryException(String message) {
        super(message);
    }

    public IllegalLowBoundaryException(String message, Throwable cause) {
        super(message, cause);
    }
}
