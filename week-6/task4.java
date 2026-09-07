package com.mycompany.mavenproject2;
import java.util.Arrays;
import java.util.Scanner;
public class NewClass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];

        System.out.println("min=" + min);
        System.out.println("max=" + max);

        input.close();
    }
}

