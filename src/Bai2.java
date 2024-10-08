/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T
 */
import java.util.*;
import java.io.*;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> res = new ArrayList<>();
        List<String> error = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[m];
        String word = "";
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            if (i >= 1 && a[i - 1] == x - 1) {
                word += "-" + x;
            } else {
                if (word.compareTo("") != 0) {
                    res.add(word);
                }
                word = "";
                word += x;
            }
            a[i] = x;
        }
        if (word.compareTo("") != 0) {
            res.add(word);
        }
        System.out.println("Errors: ");
        for (int i = 0; i < res.size(); i++) {
            String[] x = res.get(i).split("-");
            String x1 = x[0];
            String s = x1;
            String x2 = "";
            if (x.length > 1) {
                x2 = x[x.length - 1];
                s += "-" + x2;
            }
            if (i < res.size() - 2) {
                s += ", ";
            } else if(i==res.size()-2) {
                s = s+" and ";
            }
            System.out.print(s);
        }
    }
}
