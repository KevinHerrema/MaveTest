package com.nhlstenden.jallersma.maventemplate;

import com.google.inject.AbstractModule;

public class BasicModule extends AbstractModule {
 
    @Override
    protected void configure() {
        bind(User.class).toInstance(new User("tester"));
        bind(MyMath.class);
    }
}