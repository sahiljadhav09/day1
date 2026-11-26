package com.sahil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class PracticeOfArraylist {
    public static void main(String[] args) {
     List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());
        List<String> list1 = Arrays.asList("Monday","tuseday");
        System.out.println(list.getClass().getName());

    }
}
//ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        list.set(2,20);
//
//        for(Integer i:list){
//        System.out.println(i);
//        }
//                System.out.println(list.contains(3));