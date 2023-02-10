package org.calculator;

import java.util.List;

public class Calculator {
    private static final List<NewArithemticOperator> arithmeticOperators = List.of(
            new AdditionOperator(),
            new SubtractionOperator(),
            new MultplicationOperator(),
            new DivisionOperator()
    );
    public static int calculate(int operand1, String operator, int operand2) {
        return arithmeticOperators.stream()
                .filter(k -> k.supports(operator))
                .map(k -> k.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));

    }
}
