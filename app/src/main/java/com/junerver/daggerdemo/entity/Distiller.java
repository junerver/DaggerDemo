package com.junerver.daggerdemo.entity;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Junerver on 2016/12/21.
 * Feature: 蒸馏器类
 * Updated:
 */
@Singleton
public class Distiller {

    private Heater mHeater;

    @Inject
    public Distiller(Heater heater) {
        mHeater = heater;
    }

    @Override
    public String toString() {
        return "有"+mHeater.toString()+"的蒸馏器"+super.toString();
    }
}
