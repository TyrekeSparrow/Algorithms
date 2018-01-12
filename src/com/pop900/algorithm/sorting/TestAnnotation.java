package com.pop900.algorithm.sorting;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by michael on 17-9-3.
 */
public class TestAnnotation {
    public static void main(String[] args) {


//        Annotation annotation = InsertionSort.class.getAnnotation(SortMethod.class);
//        System.out.println("annotation = " + annotation);

        try {
            Method method = TestAnnotation.class.getDeclaredMethod("sortBalls");
            Annotation annotation = method.getAnnotation(SortMethod.class);
            System.out.println("annotation = " + annotation);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }


    @SortMethod
    public void sortBalls() {





    }



}
