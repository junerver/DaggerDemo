package com.junerver.daggerdemo;

import com.junerver.daggerdemo.entity.Brandy;
import com.junerver.daggerdemo.entity.Distiller;
import com.junerver.daggerdemo.entity.FermentBarrel;
import com.junerver.daggerdemo.entity.Grape;
import com.junerver.daggerdemo.entity.Wine;

import javax.inject.Named;

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

    @Provides
    @Named("CabernetSauvignon")
    public Grape provideOtherGrape() {
        return new Grape("赤霞珠");
    }

    @Provides
    @Named("CabernetSauvignon")
    public Wine provideOtherWine(@Named("CabernetSauvignon") Grape grape, FermentBarrel fermentBarrel) {
        return new Wine(grape, fermentBarrel);
    }

    @Provides
    @Named("CabernetSauvignon")
    public Brandy provideOtherBrandy(@Named("CabernetSauvignon") Wine wine, Distiller distiller) {
        return new Brandy(distiller, wine);
    }
}
