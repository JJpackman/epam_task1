package com.shyrokykh.subtask2.presentation.util;

import com.shyrokykh.subtask2.presentation.constant.MessageColors;
import com.shyrokykh.subtask2.presentation.constant.Messages;

public final class ResultViewer {
    private ResultViewer() {}

    private static void endMessage() {
        System.out.println();
    }

    public static void showResultMessage() {
        System.out.println(Messages.NOT_FOUND);
        endMessage();
    }

    public static void showResultMessage(int n) {
        System.out.println(String.format("%s: %d", Messages.RESULT, n));
        endMessage();
    }

    public static void showErrorMessage(String message) {
        System.out.println(MessageColors.RED + message + MessageColors.BLACK);
        endMessage();
    }
}
