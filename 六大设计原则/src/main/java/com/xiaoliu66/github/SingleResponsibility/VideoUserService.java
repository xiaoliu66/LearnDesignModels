package com.xiaoliu66.github.SingleResponsibility;

/**
 * @Description:
 * @author: xiaoliu66@github.com
 * @date: 2021/5/25 23:20
 * @Version: 1.0
 */
public class VideoUserService {
    public void serveGrade(String userType) {
        if ("VIP会员".equals(userType)) {
            System.out.println("VIP会员,视频1080P蓝光。");
        }else if ("普通会员".equals(userType)) {
            System.out.println("普通会员,视频720P超清。");
        }else if ("访客用户".equals(userType)) {
            System.out.println("访客用户,视频480P高清。");
        }
    }
}
