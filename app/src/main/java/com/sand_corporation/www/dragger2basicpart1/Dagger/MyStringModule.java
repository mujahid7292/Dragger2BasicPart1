package com.sand_corporation.www.dragger2basicpart1.Dagger;

import com.sand_corporation.www.dragger2basicpart1.MyString;
import com.sand_corporation.www.dragger2basicpart1.MyStringClass;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyStringModule {

    @Provides
    @Singleton
    public static MyString providesMyString(){
        return new MyStringClass();
    }
}
