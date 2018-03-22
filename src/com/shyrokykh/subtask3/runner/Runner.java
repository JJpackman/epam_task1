package com.shyrokykh.subtask3.runner;

import com.shyrokykh.subtask3.computation.util.PyramidBuilder;
import com.shyrokykh.subtask3.presentation.util.ResultViewer;
import com.shyrokykh.subtask3.runner.exception.IllegalHeightException;
import com.shyrokykh.subtask3.runner.exception.constant.Messages;

public final class Runner {
    private Runner() {}

    private static void buildPyramid(final int h) {
        try {
            if (h < 1 || h > 9) {
                throw new IllegalHeightException(Messages.ERR_ILLEGAL_HEIGHT);
            }

            ResultViewer.showResultMessage(PyramidBuilder.buildPyramid(h));
        } catch (Exception e) {
            ResultViewer.showErrorMessage(e.getMessage());
        }
    }

    public static void run() {
        buildPyramid(-1);
        buildPyramid(6);
        buildPyramid(9);
        buildPyramid(12);
    }
}
