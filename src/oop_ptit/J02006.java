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
public class J02006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[m+n];
        int f[] = new int[1001];
        for(int i=0;i<m+n;i++){
            int x=sc.nextInt();
            f[x]++;
        }
        for(int i=0;i<=1000;i++){
            if(f[i]>=1){
                System.out.print(i+" ");
            }
        }
    }
}
