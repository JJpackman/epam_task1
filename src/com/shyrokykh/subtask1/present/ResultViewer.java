package com.shyrokykh.subtask1.present;

import com.shyrokykh.subtask1.present.constant.MessageColors;
import com.shyrokykh.subtask1.present.constant.Messages;

public final class ResultViewer {
    private ResultViewer() {}

    private static void endMessage() {
        System.out.println();
    }

    public static void showResultMessage(int original, int destNumSystem,  char[] result) {
        final String from = String.format("%s: %d", Messages.FROM, 10);
        final String to = String.format("%s: %d", Messages.TO, destNumSystem);
        final String values = String.format("%d %s %s", original, Messages.TO_ARROW, String.valueOf(result));

        System.out.println(from);
        System.out.println(to);
        System.out.println(values);
        endMessage();
    }

    public static void showErrorMessage(String message) {
        System.out.println(MessageColors.RED + message + MessageColors.BLACK);
        endMessage();
    }
}
