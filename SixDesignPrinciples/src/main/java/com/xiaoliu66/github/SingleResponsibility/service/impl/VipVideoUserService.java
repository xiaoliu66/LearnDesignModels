package com.xiaoliu66.github.SingleResponsibility.service.impl;

import com.xiaoliu66.github.SingleResponsibility.service.IVideoUserService;

/**
 * @author xiaoliu66@github.com
 * @version 1.0
 * @since 2021/5/26 22:29
 */
public class VipVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("VIP会员，1080P");
    }

    @Override
    public void advertisement() {
        System.out.println("VIP会员，视频无广告。");
    }
}
