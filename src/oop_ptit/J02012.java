/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.Scanner;

/**
 *
 * @author T
 */
public class J02012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Buoc " + (i) + ": ");
            int pos = i-1;
            int min = a[i];
            while (pos >= 0 && min < a[pos]) {
                a[pos+1] = a[pos];
                pos--;
            }
            if(pos<0) a[pos+1]=min;
            for (int j = 0; j <= i; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println("");
        }

    }
}
