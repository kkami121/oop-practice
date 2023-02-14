package org.gradecalculator;

import java.util.List;
/*
요구사항
평균학점 계산 방법 = (학점 * 교과목 평점)의 합계 / 총학점 수
일급 컬렉션 사용
 */
public class GradeCalculator {
    private final  Courses courses;

    public GradeCalculator(List<Course> courses){
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {
        // (학점 * 교과목 평점)의 합계
        double totalmultiplyCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();

        // 수강신청 총학점 수
        double totalCompleateCredit = courses.totalCompleateCredit();

        return totalmultiplyCreditAndCourseGrade / totalCompleateCredit;
    }
}
