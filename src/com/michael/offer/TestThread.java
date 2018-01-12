package com.michael.offer;

public class TestThread {
    public static void main(String[] args) {
        // Student studentA = new Student("Jordan");
        Student studentB = new Student("Kobe");





        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                studentB.study("basketball");
            }
        });
        threadA.start();

        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
//                synchronized (studentB) {
//                    try {
                        System.out.println("threadB start sleep");
//                        Thread.sleep(7 * 1000);
                        studentB.study("cooking");
                        System.out.println("threadB stop sleep");
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
            }
        });
        threadB.start();

    }




}

class Student {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public synchronized void study(String what) {
        System.out.println(name + " start to study " + what);
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " stop to studying " + what);
    }



}
