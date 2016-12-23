package com.junerver.daggerdemo;

import com.junerver.daggerdemo.entity.Brandy;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Junerver on 2016/12/23.
 * Feature:
 * Updated:
 */
public class TestDagger {

    @Inject
    Brandy mBrandy;

    @Inject
    @Named("CabernetSauvignon")
    Brandy mCSBrandy;

    public TestDagger() {
        DaggerBrandyComponent.create().inject(this);
    }

    @Override
    public String toString() {
        return mBrandy.toString()+"\n"+mCSBrandy.toString();
    }
}
