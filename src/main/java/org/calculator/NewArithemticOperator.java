package org.calculator;

public interface NewArithemticOperator {
    boolean supports(String operator);
    int calculate(int operand1, int operand2);
}
