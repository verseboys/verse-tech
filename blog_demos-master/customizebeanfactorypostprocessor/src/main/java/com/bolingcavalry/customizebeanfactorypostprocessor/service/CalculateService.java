package com.bolingcavalry.customizebeanfactorypostprocessor.service;

public interface CalculateService {
    /**
     * 整数加法
     * @param a
     * @param b
     * @return
     */
    int add(int a, int b);

    /**
     * 返回当前实现类的描述信息
     * @return
     */
    String getServiceDesc();
}
