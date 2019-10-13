package com.wwm.pattern.singleton;

public class HungryLoad {


    private static final HungryLoad INSTANCE = new HungryLoad();

    private HungryLoad(){}

    public static HungryLoad getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++){
            new Thread(() -> {
                System.out.println(HungryLoad.getInstance());
            }).start();
        }
    }
}
