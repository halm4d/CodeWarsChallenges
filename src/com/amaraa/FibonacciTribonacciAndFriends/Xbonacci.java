package com.amaraa.FibonacciTribonacciAndFriends;


import java.util.Arrays;

// Challenge is available on this link: https://www.codewars.com/kata/556e0fccc392c527f20000c5/train/java
public class Xbonacci {

    public double[] xbonacci(double[] signature, int n) {

        double[] result = Arrays.copyOf(signature,n);

        int lengthOfSignature = signature.length;
        for (int i = lengthOfSignature; i < n; i++) {
            double resultOfCurrentItem = 0;
            for (int j = i; j > i - lengthOfSignature; j--) {
                resultOfCurrentItem = (resultOfCurrentItem + result[j-1]);
            }
            result[i] = resultOfCurrentItem;
        }

        return result;
    }
}