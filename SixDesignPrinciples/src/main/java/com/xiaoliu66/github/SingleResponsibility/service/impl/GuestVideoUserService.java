package com.xiaoliu66.github.SingleResponsibility.service.impl;

import com.xiaoliu66.github.SingleResponsibility.service.IVideoUserService;

/**
 * @author xiaoliu66@github.com
 * @version 1.0
 * @since 2021/5/26 22:26
 */
public class GuestVideoUserService implements IVideoUserService {
    @Override
    public void definition() {
        System.out.println("访客用户，480P");
    }

    @Override
    public void advertisement() {
        System.out.println("访客用户，有广告。");
    }
}
