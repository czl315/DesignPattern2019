package com.czl.design.sington.hungry;

public class HungryStaticSington {
    private HungryStaticSington(){}
    private static final HungryStaticSington hungrySington ;
    static {
        hungrySington = new HungryStaticSington();
    }
    public static HungryStaticSington getInstance(){
        return hungrySington;
    }
}
