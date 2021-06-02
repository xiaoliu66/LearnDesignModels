package com.xiaoliu66.github.LeastKnowledgePrinciple.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/2 23:30
 * @version 1.0
 */
public class Teacher {
    private String name;
    private String clazz; // 班级
    private static List<Student> studentList; // 学生人数

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
}
