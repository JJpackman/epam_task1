package com.shyrokykh.subtask1.runner;

import com.shyrokykh.subtask1.computation.util.DecimalToNumberSystemConverter;
import com.shyrokykh.subtask1.presentation.util.ResultViewer;

public final class Runner {
    private Runner() {}

    private static void convertToBinary(final int number) {
        try {
            ResultViewer.showResultMessage(number, 2, DecimalToNumberSystemConverter.toBinary(number));
        } catch (Exception e) {
            ResultViewer.showErrorMessage(e.getMessage());
        }
    }

    private static void convertToHexadecimal(final int number) {
        try {
            ResultViewer.showResultMessage(number, 16, DecimalToNumberSystemConverter.toHexadecimal(number));
        } catch (Exception e) {
            ResultViewer.showErrorMessage(e.getMessage());
        }
    }

    private static void convertToOctal(final int number) {
        try {
            ResultViewer.showResultMessage(number, 8, DecimalToNumberSystemConverter.toOctal(number));
        } catch (Exception e) {
            ResultViewer.showErrorMessage(e.getMessage());
        }
    }

    public static void run() {
        convertToBinary(7);
        convertToHexadecimal(21);
        convertToOctal(-24);

        convertToBinary(45);
        convertToHexadecimal(65);
        convertToOctal(99);

        convertToOctal(-1);
    }
}
