package com.pop900.algorithm.fundamenal;

/**
 * Created by michael on 17-9-13.
 */
public class TestDaemon {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("before sleep");
                    Thread.sleep(5 * 1000);
                    System.out.println("after sleep");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("no daemon thread beofre sleep");
                    Thread.sleep(3 * 1000);
                    System.out.println("no daemon thread after sleep");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();



    }
}
