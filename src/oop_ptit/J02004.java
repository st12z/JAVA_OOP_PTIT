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
public class J02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int l=0;
            int r=n-1;
            int check=1;
            while(l<r){
                if(a[l]!=a[r]){
                    check=0;
                    break;
                }
                l++;
                r--;
            }
            if(check==1) System.out.println("YES");
            else{
                System.out.println("NO");
            }
        }
    }
}
