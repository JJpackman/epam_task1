package com.shyrokykh.subtask1.computation;

import com.shyrokykh.subtask1.exception.IllegalNumberSystemException;
import com.shyrokykh.subtask1.exception.IllegalOriginalNumberException;
import com.shyrokykh.subtask1.exception.constant.Messages;

public final class DecimalToNumberSystemConverter {
    private static final char[] DIGITS = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    private DecimalToNumberSystemConverter() {}

    /**
     * Return {@code int} value representing result array length
     * to store result of conversion of decimal number to specified number system.
     *
     * @param original the decimal number to convert
     * @param numberSystem the number system into which convert
     * @return the length of result array
     */
    private static int calcResultArrayLength(int original, final int numberSystem) {
        int len = 0;

        while ((1 / numberSystem) + original > 0) {
            original /= numberSystem;
            len++;
        }

        return len;
    }

    /**
     * Return {@code char} array representing value in specified number system
     * obtained as a result of conversion from decimal number.
     *
     * @param   original the decimal number to convert
     * @param   numberSystem the number system into which convert
     * @throws  com.shyrokykh.subtask1.exception.IllegalOriginalNumberException if a {@code original}
     *          is negative
     * @throws  com.shyrokykh.subtask1.exception.IllegalNumberSystemException if a {@code numberSystem}
     *          argument is not equal to 2 or 8, or 16
     *
     * @return  the result
     */
    private static char[] toNumberSystem(int original, final int numberSystem)
            throws IllegalOriginalNumberException, IllegalNumberSystemException {
        if (original < 0) {
            throw new IllegalOriginalNumberException(String.format("%s: %d",
                    Messages.ERR_CANNOT_CONVERT_NEGATIVE_NUMBERS, original));
        }

        if (numberSystem != 2 && numberSystem != 8 && numberSystem != 16) {
            throw new IllegalNumberSystemException(String.format("%s: %d",
                    Messages.ERR_CANNOT_CONVERT_TO_NUMBER_SYSTEM, numberSystem));
        }

        final char[] res = new char[calcResultArrayLength(original, numberSystem)];

        for (int digitIndex = res.length - 1; digitIndex >= 0 ; digitIndex--) {
            res[digitIndex] = DIGITS[original % numberSystem];
            original /= numberSystem;
        }

        return res;
    }

    /**
     * Return {@code char} array representing binary value obtained as a result of conversion from decimal number.
     * <p>
     * The representation is exactly one returned by the
     * {@code DecimalToNumberSystemConverter.toNumberSystem} of two arguments.
     *
     * @param   original the decimal number to convert
     * @return  the result
     * @see     DecimalToNumberSystemConverter#toNumberSystem(int, int)
     */
    public static char[] toBinary(int original) throws IllegalOriginalNumberException, IllegalNumberSystemException {
        return toNumberSystem(original, 2);
    }

    /**
     * Return {@code char} array representing hexadecimal value obtained as a result of conversion from decimal number.
     * <p>
     * The representation is exactly one returned by the
     * {@code DecimalToNumberSystemConverter.toNumberSystem} of two arguments.
     *
     * @param   original the decimal number to convert
     * @return  the result
     * @see     DecimalToNumberSystemConverter#toNumberSystem(int, int)
     */
    public static char[] toHexadecimal(int original) throws IllegalOriginalNumberException, IllegalNumberSystemException {
        return toNumberSystem(original, 16);
    }

    /**
     * Return {@code char} array representing octal value obtained as a result of conversion from decimal number.
     * <p>
     * The representation is exactly one returned by the
     * {@code DecimalToNumberSystemConverter.toNumberSystem} of two arguments.
     *
     * @param   original the decimal number to convert
     * @return  the result
     * @see     DecimalToNumberSystemConverter#toNumberSystem(int, int)
     */
    public static char[] toOctal(int original) throws IllegalOriginalNumberException, IllegalNumberSystemException {
        return toNumberSystem(original, 8);
    }
}
