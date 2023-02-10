package org.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.*;

/*
요구사항
1. 간단한 사칙연산을 할 수 있다.
2. 양수로만 계산할 수 있다.
3. 나눗셈에서 0을 나누는 경우 IllegolArgument 예외를 발생시킨다.
4. MVC패턴 기반으로 구현한다.
*/

public class CalculatorTest {
//    @DisplayName("덧셈 연산을 수행한다.")
//    @Test
//     void additionTest() {
//        int result = Calculator.calculate(1, "+", 2);
//
//        assertThat(result).isEqualTo(3);
//    }

//한번에 테스트 하기
    @DisplayName("사칙연산을 수행한다.")
    @ParameterizedTest
    @MethodSource("formulaAndResult")

    void calculateTest(int operand1, String operator, int operand2, int result){
        int calculateResult = Calculator.calculate(operand1, operator, operand2);

        assertThat(calculateResult).isEqualTo(result);
    }

    private static Stream<Arguments> formulaAndResult(){
        return Stream.of(
                arguments(1, "+", 2, 3),
                arguments(1, "-", 2, -1),
                arguments(1, "*", 2, 2),
                arguments(2, "/", 2, 1)
        );
    }

}
