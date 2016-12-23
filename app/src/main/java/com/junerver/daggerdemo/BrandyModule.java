package com.junerver.daggerdemo;

import com.junerver.daggerdemo.entity.Grape;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Junerver on 2016/12/23.
 * Feature:
 * Updated:
 */
@Module
public class BrandyModule {

    @Provides
    public Grape provideGrape() {
        return new Grape("解百纳");
    }

}
