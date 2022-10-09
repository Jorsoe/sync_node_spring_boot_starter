package org.rkzl.sync.service.data;

/**
 * @Author: Renke
 * @DateTime: 2022/10/9 14:35
 * @Description: pull & push data
 */
public interface DataService {

    /**
     * pull data
     */
    void pull();

    /**
     * push data
     */
    void push();
}