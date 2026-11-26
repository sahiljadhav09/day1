package com.sahil;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println(list.getFirst());

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}