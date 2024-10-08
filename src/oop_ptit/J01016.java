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
public class J01016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt4 = 0;
        int cnt7 = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='4') cnt4++;
            if(s.charAt(i)=='7') cnt7++;
        };
        if(cnt4+cnt7==7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
