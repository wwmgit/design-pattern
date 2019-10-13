package com.wwm.pattern.singleton;

public class LazyLoad {

    private static LazyLoad INSTANCE;

    private LazyLoad(){}

    public static LazyLoad getInstance() throws InterruptedException {
        if(null == INSTANCE){
            Thread.sleep(1);
            return new LazyLoad();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            new Thread(() -> {
                try {
                    System.out.println(LazyLoad.getInstance());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

}
