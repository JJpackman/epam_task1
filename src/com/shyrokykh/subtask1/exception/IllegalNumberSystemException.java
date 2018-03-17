package com.shyrokykh.subtask1.exception;

public class IllegalNumberSystemException extends Exception {
    private static final long serialVersionUID = 8247785926236153501L;

    public IllegalNumberSystemException(String message) {
        super(message);
    }

    public IllegalNumberSystemException(String message, Throwable cause) {
        super(message, cause);
    }
}
