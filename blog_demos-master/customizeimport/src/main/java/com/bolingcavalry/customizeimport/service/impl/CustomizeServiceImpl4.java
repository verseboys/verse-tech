package com.bolingcavalry.customizeimport.service.impl;

import com.bolingcavalry.customizeimport.service.CustomizeService4;
import com.bolingcavalry.customizeimport.util.Utils;

/**
 * @Description: 测试实现类3
 * @author: willzhao E-mail: zq2599@gmail.com
 * @date: 2018/9/9 13:21
 */
public class CustomizeServiceImpl4 implements CustomizeService4 {

    public CustomizeServiceImpl4() {
        Utils.printTrack("construct : " + this.getClass().getSimpleName());
    }

    @Override
    public void execute() {
        System.out.println("execute : " + this.getClass().getSimpleName());
    }
}
