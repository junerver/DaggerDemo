package com.junerver.daggerdemo.entity;

/**
 * Created by Junerver on 2016/12/21.
 * Feature: 白兰地类
 * Updated:
 */
public class Brandy {
    private Distiller mDistiller;
    private Wine mWine;

    public Brandy(Distiller distiller, Wine wine) {
        mDistiller = distiller;
        mWine = wine;
    }

    @Override
    public String toString() {
        return mWine.toString()+"在"+mDistiller.toString()+"蒸馏的白兰地";
    }
}
