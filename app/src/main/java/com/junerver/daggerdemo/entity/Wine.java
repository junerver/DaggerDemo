package com.junerver.daggerdemo.entity;

import javax.inject.Inject;

/**
 * Created by Junerver on 2016/12/21.
 * Feature: 原浆类
 * Updated:
 */
public class Wine {
    private Grape mGrape;
    private FermentBarrel mFermentBarrel;

    @Inject
    public Wine(Grape grape, FermentBarrel fermentBarrel) {
        mGrape = grape;
        mFermentBarrel = fermentBarrel;
    }

    @Override
    public String toString() {
        return mGrape.toString()+"发酵的原浆";
    }
}
