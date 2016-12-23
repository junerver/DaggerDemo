package com.junerver.daggerdemo;

import com.junerver.daggerdemo.entity.Distiller;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Junerver on 2016/12/23.
 * Feature:
 * Updated:
 */
@Component
@Singleton
public interface BaseComponent {
    Distiller anyName();
}
