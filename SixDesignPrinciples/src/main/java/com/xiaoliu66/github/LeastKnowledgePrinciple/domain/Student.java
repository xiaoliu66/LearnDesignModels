package com.xiaoliu66.github.LeastKnowledgePrinciple.domain;
/**
 * @author xiaoliu66@github.com
 * @since 2021/6/2 23:28
 * @version 1.0
 */
public class Student {
    private String name;
    private int rank; // 总排名
    private double score; // 总分

    public Student() {
    }

    public Student(String name, int rank, double score) {
        this.name = name;
        this.rank = rank;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                ", score=" + score +
                '}';
    }
}
