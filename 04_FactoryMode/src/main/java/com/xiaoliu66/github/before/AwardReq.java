package com.xiaoliu66.github.before;
/**
 * @author xiaoliu66@github.com
 * @since 2021/6/9 21:27
 * @version 1.0
 */
public class AwardReq {
    private String uId;
    private int awardType;

    public int getAwardType() {
        return awardType;
    }

    public void setAwardType(int awardType) {
        this.awardType = awardType;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }
}
