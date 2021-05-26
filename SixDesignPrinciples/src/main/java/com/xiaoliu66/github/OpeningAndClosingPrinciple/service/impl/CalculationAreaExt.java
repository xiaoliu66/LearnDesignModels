package com.xiaoliu66.github.OpeningAndClosingPrinciple.service.impl;

import com.xiaoliu66.github.OpeningAndClosingPrinciple.service.ICalculationArea;

/**
 * @author xiaoliu66@github.com
 * @version 1.0
 * @since 2021/5/26 23:02
 */
public class CalculationAreaExt extends CalculationArea {
    private final static double π = 3.1415926d;

    @Override
    public double circleArea(double r) {
        return π * r * r;
    }
}
