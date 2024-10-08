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
public class J01009 {
    public static long f[] =new long[21];
    public static void solve(){
        f[1]=1;
        for(int i=2;i<=20;i++){
            f[i]=f[i-1]*i;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve();
        int n=sc.nextInt();
        long sum=0;
        for(int i=1;i<=n;i++){
            sum+=f[i];
        };
        System.out.println(sum);
    }
}
