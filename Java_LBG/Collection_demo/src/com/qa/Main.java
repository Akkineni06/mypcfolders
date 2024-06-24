package com.qa.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {


    public static void main(String[] args) {
//        int i = null;
        String s  = null;

        int [] nums = {1,2,3,4};
        System.out.println(nums);


        List<Integer> numList = new ArrayList<>();

        numList.add(12);
        numList.add(243);
        numList.add(null);
        numList.add(999);

        System.out.println(numList.size());

        System.out.println(numList);
        numList.remove(2);
        numList.add(0, 27);
        System.out.println(numList);

        for (int i = 0; i < numList.size(); i++) {
            System.out.println("I: " + i + " NUM: " + numList.get(i));
        }

        for (Integer num : numList) {
            System.out.println("NUM: " + num);
        }

        Set<Integer> numSet = new HashSet<>();

        numSet.add(1);
        numSet.add(2);
        numSet.add(3);
        numSet.add(4);
        numSet.add(5);

        System.out.println("SET: " + numSet);
    }

}
@Akkineni06
Comment

Leave a comment

        Footer
© 2024 GitHub, Inc.
        Footer navigation
Terms
        Priva