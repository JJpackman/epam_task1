package com.shyrokykh.subtask4.computation.util;

import com.shyrokykh.subtask4.computation.exception.IllegalMatrixDimension;
import com.shyrokykh.subtask4.computation.exception.constant.Messages;

public final class MatrixRotator {
    private static boolean isSquareMatrix(int[][] matrix) {
        boolean square = true;

        for (int[] row : matrix) {
            if (row.length != matrix.length) {
                square = false;
                break;
            }
        }

        return square;
    }

    private static void rotateLayer(int i, int[][] matrix) {
        final int n = matrix.length;

        for (int j = i; j < n - i - 1; j++) {
            final int leftCorner = matrix[i][j];
            matrix[i][j] = matrix[j][n - i - 1];
            matrix[j][n - i - 1] = matrix[n - i - 1][n - j - 1];
            matrix[n - i - 1][n - j - 1] = matrix[n - 1 - j][i];
            matrix[n - j - 1][i] = leftCorner;
        }
    }

    private static int[][] copyMatrix(int[][] src) {
        final int len = src.length;
        int[][] dest = new int[len][len];

        for (int row = 0; row < len; row++) {
            System.arraycopy(src[row], 0, dest[row], 0, len);
        }

        return dest;
    }

    public static int[][] rotateMatrixCounterclockwise(int[][] originalMatrix) throws IllegalMatrixDimension {
        if (originalMatrix == null || originalMatrix.length == 0) {
            throw new IllegalMatrixDimension(Messages.ERR_MATRIX_CANNOT_BE_NULL_OR_ZERO_LEN);
        }

        if (!isSquareMatrix(originalMatrix)) {
            throw new IllegalMatrixDimension(Messages.ERR_MATRIX_WRONG_DIMENSION);
        }

        int[][] rotatedMatrix = copyMatrix(originalMatrix);

        for (int i = 0, len = originalMatrix.length; i < len / 2; i++) {
            rotateLayer(i, rotatedMatrix);
        }

        return rotatedMatrix;
    }
}
