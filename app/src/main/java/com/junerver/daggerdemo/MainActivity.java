package com.junerver.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.junerver.daggerdemo.entity.Brandy;
import com.junerver.daggerdemo.entity.Distiller;
import com.junerver.daggerdemo.entity.FermentBarrel;
import com.junerver.daggerdemo.entity.Grape;
import com.junerver.daggerdemo.entity.Wine;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    @Inject
    Distiller mDistiller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.text);

        DaggerBrandyComponent.create().inject(this);

        //传统制酒流程
        System.out.println(new Brandy(new Distiller(), new Wine(new Grape("赤霞珠"), new FermentBarrel())).toString());


    }
}
