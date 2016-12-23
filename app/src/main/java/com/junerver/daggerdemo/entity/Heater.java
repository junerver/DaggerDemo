package com.junerver.daggerdemo.entity;

import javax.inject.Inject;

/**
 * Created by Junerver on 2016/12/23.
 * Feature: 加热器
 * Updated:
 */
public class Heater {

    @Inject
    public Heater() {
    }

    @Override
    public String toString() {
        return "加热器";
    }
}
