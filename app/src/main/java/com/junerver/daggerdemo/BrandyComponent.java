package com.junerver.daggerdemo;

import dagger.Component;

/**
 * Created by Junerver on 2016/12/23.
 * Feature:
 * Updated:
 */
@Component(modules = BrandyModule.class)
public interface BrandyComponent {
    void inject(MainActivity mainActivity);
    void inject(TestDagger testDagger);
}
