package com.xiaoliu66.github.LeastKnowledgePrinciple.domain2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaoliu66@github.com
 * @since 2021/6/4 23:28
 * @version 1.0
 */
public class Principle {
    private Teacher teacher = new Teacher("丽华","3年级1班");

    public Map<String, Object> queryClazzInfo(String clazzId) {
        int stuCount = teacher.clazzStudentCount();
        double totalScore = teacher.clazzTotalScore();
        double averageScore = teacher.clazzAverageScore();

        Map<String, Object> map = new HashMap<>();
        map.put("班级",teacher.getClazz());
        map.put("老师姓名",teacher.getName());
        map.put("学生人数",stuCount);
        map.put("总分",totalScore);
        map.put("平均分",averageScore);
        return map;
    }
}
