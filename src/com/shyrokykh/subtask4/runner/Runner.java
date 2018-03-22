package com.shyrokykh.subtask4.runner;

import com.shyrokykh.subtask4.computation.exception.IllegalMatrixDimension;
import com.shyrokykh.subtask4.computation.util.MatrixRotator;
import com.shyrokykh.subtask4.presentation.util.ResultViewer;
import com.shyrokykh.subtask4.runner.constant.RandomBounds;

import java.util.Random;

public final class Runner {
    private Runner() {}
    private static final Random RANDOM = new Random();

    private static int getRandomIntInBounds(int min, int max) {
        return RANDOM.nextInt((max - min) + 1) + min;
    }

    private static int[][] generateRandomMatrix() {
        final int len = getRandomIntInBounds(RandomBounds.MIN_DIM, RandomBounds.MAX_DIM);

        int[][] matrix = new int[len][len];

        for (int[] row : matrix) {
            for (int cellIndex = 0; cellIndex < row.length; cellIndex++) {
                row[cellIndex] = getRandomIntInBounds(RandomBounds.MIN_CELL_VALUE, RandomBounds.MAX_CELL_VALUE);
            }
        }

        return matrix;
    }

    private static void rotateNewOneMatrix() {
        int[][] m1 = generateRandomMatrix();

        try {
            ResultViewer.showResultMessage(m1, MatrixRotator.rotateMatrixCounterclockwise(m1));
        } catch (IllegalMatrixDimension e) {
            ResultViewer.showErrorMessage(e.getMessage());
        }
    }

    public static void run() {
        for (int i = 0; i < 10; i++) {
            rotateNewOneMatrix();
        }
    }
}
