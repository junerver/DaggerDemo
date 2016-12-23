package com.junerver.daggerdemo;

import com.junerver.daggerdemo.entity.Brandy;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Junerver on 2016/12/23.
 * Feature:
 * Updated:
 */
public class OtherTest {
    @Inject
    Brandy mBrandy;

    @Inject
    @Named("CabernetSauvignon")
    Brandy mCSBrandy;

    public OtherTest() {
//        DaggerBrandyComponent.create().inject(this);
        DaggerBrandyComponent
                .builder()
                .baseComponent(Singleton.getInstance().getBaseComponent())
                .build()
                .inject(this);
    }

    @Override
    public String toString() {
        return mBrandy.toString()+"\n"+mCSBrandy.toString();
    }
}
