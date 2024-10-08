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
public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int k=1;
        while(k<=t){
            System.out.println("Test "+k+":");
            int n =sc.nextInt();
            int f[] =new int[10001];
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                f[a[i]]++;
            }
            for(int i=0;i<n;i++){
                if(f[a[i]]!=0){
                    System.out.println(a[i] +" xuat hien "+f[a[i]]+" lan");
                    f[a[i]]=0;
                }
            }
            k++;
        }
    }
}
