package com.shyrokykh.subtask3.runner.exception;

public class IllegalHeightException extends Exception {
    private static final long serialVersionUID = -6226277761406772749L;

    public IllegalHeightException(String message) {
        super(message);
    }

    public IllegalHeightException(String message, Throwable cause) {
        super(message, cause);
    }
}
