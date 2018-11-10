package com.sand_corporation.www.dragger2basicpart1;

public class MyStringClass implements MyString {

    private String myName;

    public MyStringClass() {
        this.myName = "Saifullah Al Mujahid";
    }

    @Override
    public String myName() {
        return myName;
    }
}
