package com.xiaoliu66.github.LeastKnowledgePrinciple.domain;

import java.sql.Savepoint;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/3 23:22
 * @version 1.0
 * 校长类
 */
public class Principal {
    private Teacher teacher = new Teacher("丽华","3年级1班");
    // 查询班级信息、总分、学生人数、平均分
    public Map<String,Object> queryClazzInfoqueryClaz(String clazzId) {
        // 获取班级信息：总人数、总分、平均分
        int stuCount = clazzStudentCount();
        double totalScore = clazzTotalScore();
        double averageScore = clazzAverageScore();

        Map<String,Object> mapObj = new HashMap<>();
        mapObj.put("班级",teacher.getClazz());
        mapObj.put("老师姓名",teacher.getName());
        mapObj.put("学生人数",stuCount);
        mapObj.put("总分",totalScore);
        mapObj.put("平均分",averageScore);
        return mapObj;
    }

    public int clazzStudentCount() {
        int size = teacher.getStudentList().size();
        return size;
    }

    // 平均分
    public double clazzAverageScore() {
        double totalScore = clazzTotalScore();
        int i = clazzStudentCount();
        return i / totalScore;
    }

    // 总分
    public double clazzTotalScore() {
        double totalScore = 0;
        List<Student> studentList = teacher.getStudentList();
        for (Student student : studentList) {
            totalScore += student.getScore();
        }

        return totalScore;
    }



}
