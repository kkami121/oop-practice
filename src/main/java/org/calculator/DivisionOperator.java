package org.calculator;

public class DivisionOperator implements NewArithemticOperator{
    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculate(int operand1, int operand2) {
        return operand1 / operand2;
    }
}