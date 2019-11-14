package com.czl.design.sington.hungry;

public class HungrySington {
    private HungrySington(){}
    private static final HungrySington hungrySington = new HungrySington();
    public static HungrySington getInstance(){
        return hungrySington;
    }
}
