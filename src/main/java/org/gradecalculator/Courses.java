package org.gradecalculator;

import java.util.List;

public class Courses {

    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    // (학점 * 교과목 평점)의 합계
    public double multiplyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();
    }
    // 수강신청 총학점 수
    public int totalCompleateCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();

    }
}
