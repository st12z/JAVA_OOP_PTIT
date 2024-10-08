/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/oop_ptit/DATA.in");
        Scanner sc = new Scanner(f);
        BigInteger x = sc.nextBigInteger();
        String s = x.toString();
        while(s.length()>1){
            int n=s.length();
            String s1=s.substring(0,n/2);
            String s2=s.substring(n/2);
            BigInteger x1 =new BigInteger(s1);
            BigInteger x2 =new BigInteger(s2);
            BigInteger x3 = x1.add(x2);
            s=x3.toString();
            System.out.println(s);
        }
    }
}
