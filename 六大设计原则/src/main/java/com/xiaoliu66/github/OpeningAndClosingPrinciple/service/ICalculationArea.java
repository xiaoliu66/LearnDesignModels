package com.xiaoliu66.github.OpeningAndClosingPrinciple.service;

/**
 * @author xiaoliu66@github.com
 * @version 1.0
 * @since 2021/5/26 22:48
 */
public interface ICalculationArea {
    /**
     * 计算长方形面积
     * @param x
     * @param y
     * @return
     */
    double rectangleArea(double x, double y);

    /**
     * 计算三角形面积，利用海伦公式。
     * @param x
     * @param y
     * @param z
     * @return
     */
    double triangleArea(double x, double y, double z);

    /**
     * 计算圆形面积
     * @param r
     * @return
     */
    double circleArea(double r);
}
