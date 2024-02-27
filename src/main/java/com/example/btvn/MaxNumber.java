package com.example.btvn;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap day so: ");

        for (int i=0; i<10;i++){
            System.out.print("so thu" + (i+1) + ":");
            array[1] = scanner.nextInt();
        }

        int max = array[0];
        for (int i=1;i<10;i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("so lon nhat la:" + max);
    }
}
