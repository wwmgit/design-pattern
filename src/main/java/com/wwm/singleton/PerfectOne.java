package com.wwm.singleton;

public class PerfectOne {

    private PerfectOne(){}

    private static class PerfectHolder{
        private static final PerfectOne INSTANCE = new PerfectOne();
    }

    public static PerfectOne getInstance(){
        return PerfectHolder.INSTANCE;
    }

}
