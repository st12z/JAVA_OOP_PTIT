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
public class J01018 {
    public static boolean check(String s){
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            int a=s.charAt(i)-'0';
            int b=s.charAt(i+1)-'0';
            sum+=a;
            if(Math.abs(a-b)!=2) return false;
        }
        sum+=s.charAt(s.length()-1)-'0';
        return sum%10==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            String s=sc.next();
            if(check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
