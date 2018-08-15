package com.amaraa.FindTheOddInt;

import java.util.ArrayList;

// The challenge is available on this link: https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java

public class FindOdd {
    public static int findIt(int[] a) {

        if (a.length == 0) return 0;
        if (a.length == 1) return a[0];

        ArrayList<Integer> usedItems = new ArrayList<>();
        for (int i = 0; i < a.length-1; i++) {
            int count = 1;

            if (!usedItems.isEmpty()){
                boolean isUsed = false;
                for (int j = 0; j < usedItems.size(); j++) {
                    if (usedItems.get(j) == a[i]) isUsed = true;
                }
                if (isUsed) continue;
            }

            for (int j = i+1; j < a.length; j++) {
                if (a[i] == a[j]) count++;
            }
            usedItems.add(a[i]);
            if (count == 1 || (count%2) == 1) return a[i];
        }

        return 0;
    }
}