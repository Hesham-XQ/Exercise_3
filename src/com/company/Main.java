package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rn = new Random();
        int listitems_1 = rn.nextInt(11) + 5;
        int listitems_2 = rn.nextInt(11) + 10;
        //   int range = rn.nextInt(501) + 50;

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        ArrayList<Integer> even1AndOdd2 = new ArrayList<Integer>();

        System.out.println("List one :");
        System.out.println(listitems_1);

        for (int i = 0; i < listitems_1; i++) {
            int range = rn.nextInt(501) + 50;
            list1.add(range);
            System.out.println(list1.get(i));
        }
        System.out.println("List two :");
        System.out.println(listitems_2);

        for (int i = 0; i < listitems_2; i++) {
            int range = rn.nextInt(501) + 50;
            list2.add(range);
            System.out.println(list2.get(i));
        }

        for (int i = 0; i < listitems_1; i++) {
            if (list2.contains(list1.get(i))) {
                continue;
            } else {
                list3.add(list1.get(i));
            }
        }
        System.out.println("The items that are in list 1 and NOT in list 2 :");
        System.out.println(list3.size());
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }
        System.out.println("The elements of list 1 that are even and the elements of list 2 that are odd :");
        for (int i = 0; i < listitems_1; i++) {
            if (list1.get(i) % 2 == 0) {
                even.add(list1.get(i));
            }
        }

        for (int i = 0; i < listitems_2; i++) {
            if (list2.get(i) % 2 != 0) {
                odd.add(list2.get(i));
            }
        }
        even1AndOdd2.addAll(even);
        even1AndOdd2.addAll(odd);
        for (int i = 0; i < even1AndOdd2.size(); i++) {
            System.out.println(even1AndOdd2.get(i));
        }


    }
}
