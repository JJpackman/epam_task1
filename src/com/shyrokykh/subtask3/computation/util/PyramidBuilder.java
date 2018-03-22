package com.shyrokykh.subtask3.computation.util;

public final class PyramidBuilder {
    private PyramidBuilder() {}

    private static void fillLevel(final int[] lvlArr, final int lvl, int startFillPos) {
        final int count = 1 + lvl * 2;

        for (int cell = 0, num = 1; cell < count; cell++) {
            lvlArr[startFillPos] = num;

            if (cell >= count / 2) {
                num--;
            } else {
                num++;
            }

            startFillPos++;
        }
    }

    public static int[][] buildPyramid(final int h) {
        final int base = h * 2 - 1;
        final int[][] pyramid = new int[h][base];
        int elementGrowth = 0;

        for (int lvl = 0; lvl < h; lvl++) {
            int startFillPos = base / 2 - elementGrowth / 2;

            fillLevel(pyramid[lvl], lvl, startFillPos);
            elementGrowth += 2;
        }

        return pyramid;
    }
}
