package com.sand_corporation.www.dragger2basicpart1.MyApplication;

import android.app.Application;

import com.sand_corporation.www.dragger2basicpart1.Dagger.DaggerMyComponent;
import com.sand_corporation.www.dragger2basicpart1.Dagger.MyComponent;
import com.sand_corporation.www.dragger2basicpart1.Dagger.MyStringModule;

public class MyApplication extends Application {

    private MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = createMyComponent();
    }

    private MyComponent createMyComponent() {
        return DaggerMyComponent.builder()
                .myStringModule(new MyStringModule())
                .build();
    }

    public MyComponent getMyComponent() {
        return myComponent;
    }
}
