package com.junerver.daggerdemo.entity;

import javax.inject.Inject;

/**
 * Created by Junerver on 2016/12/21.
 * Feature: 蒸馏器类
 * Updated:
 */
public class Distiller {

    @Inject
    public Distiller() {
    }

    @Override
    public String toString() {
        return "蒸馏器";
    }
}
