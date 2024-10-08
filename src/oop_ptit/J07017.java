/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
class Pair<T, S> {

    private T first;
    private S second;

    public Pair() {

    }

    public Pair(T a, S b) {
        first = a;
        second = b;
    }

    public boolean check(int n) {
        int sqr = (int) Math.sqrt(n);
        for (int i = 2; i <= sqr; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isPrime() {
        return check((Integer) first) && check((Integer) second);
    }

    @Override
    public String toString() {
        return first + " " + second;
    }

}

public class J07017 {

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        list.add("51535101021");
        list.add("3232300000000000");
        for (String s : list) {
            String res = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1' || s.charAt(i) == '0') {
                    res += s.charAt(i);
                }
            }
            int ketqua = Integer.parseInt(res, 2);
            System.out.println(res + " " + ketqua);
        }
    }
}
