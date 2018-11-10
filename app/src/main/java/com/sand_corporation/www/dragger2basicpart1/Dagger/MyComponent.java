package com.sand_corporation.www.dragger2basicpart1.Dagger;

import com.sand_corporation.www.dragger2basicpart1.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = MyStringModule.class)
public interface MyComponent {
    void inject(MainActivity mainActivity);
}
