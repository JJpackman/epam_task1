package com.shyrokykh.subtask2.runner;

import com.shyrokykh.subtask2.computation.util.PerfectNumberCalculator;
import com.shyrokykh.subtask2.presentation.exception.IllegalHighBoundaryException;
import com.shyrokykh.subtask2.presentation.exception.IllegalLowBoundaryException;
import com.shyrokykh.subtask2.presentation.exception.constant.Messages;
import com.shyrokykh.subtask2.presentation.util.ResultViewer;

public final class Runner {
    private Runner() {}

    private static void findPerfectNumbers(final int from, final int to) {
        try {
            if (from < 1) {
                throw new IllegalLowBoundaryException(String.format("%s: %d",
                        Messages.ERR_ILLEGAL_LOW_BOUNDARY, from));
            }

            if (to - from < 0) {
                throw new IllegalHighBoundaryException(String.format("%s: %d",
                        Messages.ERR_ILLEGAL_HIGH_BOUNDARY, to));
            }

            boolean found = false;
            for (int currNum = from; currNum <= to; currNum++) {
                if (PerfectNumberCalculator.isPerfect(currNum)) {
                    ResultViewer.showResultMessage(currNum);
                    found = true;
                }
            }

            if (!found) {
                ResultViewer.showResultMessage();
            }
        } catch (Exception e) {
            ResultViewer.showErrorMessage(e.getMessage());
        }
    }

    public static void run() {
        findPerfectNumbers(-1, 4);
        findPerfectNumbers(3, 5);
        findPerfectNumbers(1, 10);
        findPerfectNumbers(0, 2);
        findPerfectNumbers(5, 3);
        findPerfectNumbers(1, 504);
    }
}
