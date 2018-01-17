package com.michael.algorithm.others;

import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * Created by michael on 16-9-22.
 */
public class TestJava {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();
        Student student1 = new Student();
        Student student2 = new Student();
        students.add(student1);
        students.add(student2);
        students.add(student1);

//        System.out.println("students size = " + students.size());
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(7);
        pq.add(3);
        pq.add(5);
        pq.add(9);
        pq.add(9);
        pq.add(3);
//        System.out.println("pq size = " + pq.size());
//        System.out.println("peek " + pq.peek());
//        System.out.println("peek " + pq.peek());

        while (!pq.isEmpty()) {
            System.out.println("poll " + pq.poll());
        }








    }
}

class Student {

}
