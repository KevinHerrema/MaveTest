package com.nhlstenden.jallersma.maventemplate;

import com.google.inject.*;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BasicModule());
        MyMath myMath = injector.getInstance(MyMath.class);
        System.out.format("2^4 is %d", myMath.power(4));
    }
}
