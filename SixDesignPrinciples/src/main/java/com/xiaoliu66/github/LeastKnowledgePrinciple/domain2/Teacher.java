package com.xiaoliu66.github.LeastKnowledgePrinciple.domain2;

import com.xiaoliu66.github.LeastKnowledgePrinciple.domain.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/4 23:16
 * @version 1.0
 */
public class Teacher {
    private String name;
    private String clazz;
    private static List<Student> studentList;

    public Teacher() {
    }

    public Teacher(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void setStudentList(List<Student> studentList) {
        Teacher.studentList = studentList;
    }

    static {
        studentList = new ArrayList<>();
        studentList.add(new Student("花花",10,589));
        studentList.add(new Student("豆豆",54,356));
        studentList.add(new Student("秋雅",23,439));
        studentList.add(new Student("皮皮",2,665));
        studentList.add(new Student("蛋蛋",19,502));
    }

    // 总分
    public double clazzTotalScore() {
        List<Student> studentList = this.getStudentList();
        double totalScore = 0;
        for (Student student : studentList) {
            totalScore += student.getScore();
        }

        return totalScore;
    }

    // 班级人数
    public int clazzStudentCount() {
        return studentList.size();
    }

    // 平均分
    public double clazzAverageScore() {
        int i = clazzStudentCount();
        double v = clazzTotalScore();
        return i / v;
    }
}
