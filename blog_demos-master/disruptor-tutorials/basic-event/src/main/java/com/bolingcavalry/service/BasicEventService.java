package com.bolingcavalry.service;

/**
 * @author will (zq2599@gmail.com)
 * @version 1.0
 * @description: 定义服务接口
 * @date 2021/5/23 11:05
 */
public interface BasicEventService {

    /**
     * 发布一个事件
     * @param value
     * @return
     */
    void publish(String value);

    /**
     * 返回已经处理的任务总数
     * @return
     */
    long eventCount();
}
