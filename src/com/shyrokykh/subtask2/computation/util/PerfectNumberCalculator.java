package com.shyrokykh.subtask2.computation.util;

public final class PerfectNumberCalculator {
    private PerfectNumberCalculator() {}

    public static boolean isPerfect(final int number) {
        final int upToHalfDivider = number / 2;
        int sum = 0;

        for (int divider = 1; divider <= upToHalfDivider; divider++) {
            if (number % divider == 0) {
                sum += divider;
            }
        }

        return sum == number;
    }
}
