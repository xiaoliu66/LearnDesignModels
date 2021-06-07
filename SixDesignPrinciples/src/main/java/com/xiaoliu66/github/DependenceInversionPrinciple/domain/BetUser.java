package com.xiaoliu66.github.DependenceInversionPrinciple.domain;
/**
 * @author xiaoliu66@github.com
 * @since 2021/6/7 22:18
 * @version 1.0
 */
public class BetUser {
    private String userName; // 用户姓名
    private int userWeight; // 用户权重

    public BetUser() {
    }

    public BetUser(String userName, int userWeight) {
        this.userName = userName;
        this.userWeight = userWeight;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(int userWeight) {
        this.userWeight = userWeight;
    }

    @Override
    public String toString() {
        return "BetUser{" +
                "userName='" + userName + '\'' +
                ", userWeight=" + userWeight +
                '}';
    }
}
