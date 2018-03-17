package com.shyrokykh.subtask1.computation.exception;

public class IllegalOriginalNumberException extends Exception {
    private static final long serialVersionUID = 1456814260056321930L;

    public IllegalOriginalNumberException(String message) {
        super(message);
    }

    public IllegalOriginalNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
