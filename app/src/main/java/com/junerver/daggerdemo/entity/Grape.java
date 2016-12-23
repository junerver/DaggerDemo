package com.junerver.daggerdemo.entity;

/**
 * Created by Junerver on 2016/12/21.
 * Feature: 葡萄类
 * Updated:
 */
public class Grape {
    String grapeType;

    public Grape(String grapeType) {
        this.grapeType = grapeType;
    }

    @Override
    public String toString() {
        return "这是"+grapeType+"葡萄";
    }
}
