package com.shyrokykh.subtask3.presentation.util;

import com.shyrokykh.subtask3.presentation.constant.MessageColors;
import com.shyrokykh.subtask3.presentation.constant.Messages;

public final class ResultViewer {
    private ResultViewer() {}

    private static void endMessage() {
        System.out.println();
    }

    private static void printPyramid(int[][] pyramid) {
        for (int[] pyramidLvl : pyramid) {
            for (int cell : pyramidLvl) {
                if (cell == 0) {
                    System.out.print(Messages.EMPTY_PYRAMID_CELL);
                } else {
                    System.out.print(cell);
                }
            }

            System.out.println();
        }
    }

    public static void showResultMessage(int[][] pyramid) {
        System.out.println(String.format("%s: %d", Messages.RESULT, pyramid.length));
        printPyramid(pyramid);
        endMessage();
    }

    public static void showErrorMessage(String message) {
        System.out.println(MessageColors.RED + message + MessageColors.BLACK);
        endMessage();
    }
}
