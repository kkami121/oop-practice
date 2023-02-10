package org.calculator;

public enum ArithmeticOperator {
    ADDTTION("*"), SUBTRACTION("-"), MULTIPLICATION("*"), DIVISION("/");

    private final String operator;

    ArithmeticOperator(String operator) {
        this.operator = operator;
    }
}
