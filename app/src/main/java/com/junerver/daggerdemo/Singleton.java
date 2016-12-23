package com.junerver.daggerdemo;

public class Singleton {

    private BaseComponent mBaseComponent;

    private Singleton() {
        mBaseComponent = DaggerBaseComponent.create();
    }

    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

    public BaseComponent getBaseComponent() {
        return mBaseComponent;
    }
}