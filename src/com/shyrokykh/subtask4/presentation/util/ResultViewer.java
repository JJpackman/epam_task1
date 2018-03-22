package com.shyrokykh.subtask4.presentation.util;

import com.shyrokykh.subtask4.presentation.constant.MessageColors;
import com.shyrokykh.subtask4.presentation.constant.Messages;

public final class ResultViewer {
    private ResultViewer() {}

    private static void endMessage() {
        System.out.println();
    }

    private static void printPyramid(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(String.format("%-6d", cell));
            }

            System.out.println();
        }

        endMessage();
    }

    public static void showResultMessage(int[][] matrixBefore, int[][] matrixAfter) {
        System.out.println(Messages.INITIAL_MATRIX);
        printPyramid(matrixBefore);
        System.out.println(Messages.ROTATED_MATRIX);
        printPyramid(matrixAfter);
        endMessage();
    }

    public static void showErrorMessage(String message) {
        System.out.println(MessageColors.RED + message + MessageColors.BLACK);
        endMessage();
    }
}
