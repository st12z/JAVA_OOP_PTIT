/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class J03015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        String s = String.valueOf(a.subtract(b));
        System.out.println(s);
    }
}
