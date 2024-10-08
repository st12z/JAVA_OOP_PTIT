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
public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum=0;
        while(t-->0){
            int n=sc.nextInt();
            for(int i=2;i<=Math.sqrt(n);i++){
                while(n%i==0){
                    sum+=i;
                    n/=i;
                }
            }
            if(n!=1){
                sum+=n;
            }
        }
        System.out.println(sum);
    }
}
