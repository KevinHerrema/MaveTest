package com.nhlstenden.jallersma.maventemplate;

import com.google.inject.Inject;

public class MyMathMock {
    public class MyMath {
    private final User user;
    
    @Inject
    public MyMath(User user) {
        this.user = user;
    }

    
}

public int power() {
    return 4;
}
}
