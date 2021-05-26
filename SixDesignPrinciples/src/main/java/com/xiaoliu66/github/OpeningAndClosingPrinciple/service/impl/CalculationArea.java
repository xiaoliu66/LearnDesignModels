package com.xiaoliu66.github.OpeningAndClosingPrinciple.service.impl;

import com.xiaoliu66.github.OpeningAndClosingPrinciple.service.ICalculationArea;

/**
 * @author xiaoliu66@github.com
 * @version 1.0
 * @since 2021/5/26 22:59
 */
public class CalculationArea implements ICalculationArea {
    private final static double π = 3.14d;

    @Override
    public double rectangleArea(double x, double y) {
        return x * y;
    }

    @Override
    public double triangleArea(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    public double circleArea(double r) {
        return π * r * r;
    }
}
