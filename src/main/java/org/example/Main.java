package org.example;
import org.example.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3, 5};
        int[] b = {3, 1, 6, 8, 6}; //неотсортированный массив
        int findA = Arrays.binarySearch(a, 2);
        int notFoundA = Arrays.binarySearch(a, 4);
        int findB = Arrays.binarySearch(b, 8);

        System.out.println(findA);
        System.out.println(notFoundA);
        System.out.println(findB);
    }
}