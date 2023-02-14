package org.gradecalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
/*
요구사항
평균학점 계산 방법 = (학점 * 교과목 평점)의 합계 / 총학점 수
일급 컬렉션 사용
 */
public class GradeCalculatorTest {
    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(
                new Course("oop", 3, "A+"),
                new Course("자료구죠", 3, "A+"),
                new Course("인공지능", 3, "A+")
        );
        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
