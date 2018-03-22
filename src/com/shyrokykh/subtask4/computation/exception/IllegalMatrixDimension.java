package com.shyrokykh.subtask4.computation.exception;

public class IllegalMatrixDimension extends Exception {
    private static final long serialVersionUID = -2631712361873869562L;

    public IllegalMatrixDimension(String message) {
        super(message);
    }

    public IllegalMatrixDimension(String message, Throwable cause) {
        super(message, cause);
    }
}
