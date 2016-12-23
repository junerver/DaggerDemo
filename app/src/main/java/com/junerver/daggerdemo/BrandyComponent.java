package com.junerver.daggerdemo;

import dagger.Component;

/**
 * Created by Junerver on 2016/12/23.
 * Feature:
 * Updated:
 */
@Component(modules = BrandyModule.class,dependencies = BaseComponent.class)
@Lalala
public interface BrandyComponent {
    void inject(MainActivity mainActivity);
    void inject(TestDagger testDagger);
    void inject(OtherTest otherTest);
}
