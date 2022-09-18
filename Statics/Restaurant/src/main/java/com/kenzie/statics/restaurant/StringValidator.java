package com.kenzie.statics.restaurant;

public final class StringValidator {

    // Create a private constructor so StringValidator objects cannot be created.
    private StringValidator() {}

    /**
     * Checks to see if the string entered contains a forbidden string.
     *
     * @param input string that's being checked
     * @throws InvalidStringException if the input contains a forbidden string
     */
    public static void containsForbiddenWord(String input) throws InvalidStringException {
        if (!input.contains("fish")) {
            return;
        } else {
            throw new InvalidStringException("The given String contains a forbidden word.");
        }
    }

    /**
     * Checks to see if the string entered has a length greater than the max allowed length.
     *
     * @param input string that's being checked
     * @throws InvalidStringException checks to see if the input is a forbidden string
     */
    public static void greaterThanMaxLength(String input) throws InvalidStringException {
        //max characters allowed is 250
        if (input.length() > 250) {
            throw new InvalidStringException("The given String has a length greater than the max length allowed.");
        }
    }
}
