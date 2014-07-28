package com.trutech.calculall;

/**
 * Represents a single digit of a number.
 *
 * @version 0.3.0
 */
public class Digit extends Token {

    private int value;

    /**
     * Should not be used outside of a factory; to create a type of digit,
     * see class DigitFactory.
     *
     * @param symbol The symbol of the Token to be shown on the calculator screen
     * @param value The value of the Digit (0 - 9) or as defined by DigitFactory class constants
     */
    protected Digit(String symbol, int value) {
        super(symbol);
        this.value = value;
    }

    /**
     *
     * @return The value of the Digit (0 - 9) or as defined by DigitFactory class constants
     */
    public int getValue() {
        return value;
    }
}
