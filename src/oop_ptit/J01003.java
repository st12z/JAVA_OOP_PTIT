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
public class J01003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==0 && b==0){
            System.out.println("VSN");
        }
        else if(a==0 && b!=0){
            System.out.println("VN");
        }
        else{
            System.out.println(String.format("%.2f", (float)-b/a));
        }
              
              
    }
}
