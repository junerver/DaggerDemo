package com.junerver.daggerdemo;

import com.junerver.daggerdemo.entity.Distiller;

import javax.inject.Inject;

/**
 * Created by Junerver on 2016/12/23.
 * Feature:
 * Updated:
 */
public class TestDagger {
    @Inject
    Distiller mDistiller;

    public TestDagger() {
        DaggerBrandyComponent.create().inject(this);
    }

    @Override
    public String toString() {
        return mDistiller.toString();
    }
}
