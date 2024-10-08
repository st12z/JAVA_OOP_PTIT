/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> res1 = new ArrayList<>();
        ArrayList<String> res2 = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[m];
        int check[] = new int[100001];
        int b[] = new int[100001];
        String word = "";
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            check[x] = 1;
            if (i >= 1 && a[i - 1] == x - 1) {
                word += "-" + x;
            } else {
                if (word.compareTo("") != 0) {
                    res1.add(word);
                }
                word = "";
                word += x;
            }
            a[i] = x;
        }
        if (word.compareTo("") != 0) {
            res1.add(word);
        }
        word = "";
        System.out.print("Errors: ");
        String error = Helper.getString(res1);
        System.out.println(error);
        int index = 0;
        word="";
        for (int i = 1; i <= n; i += 1) {
            if (check[i] == 0) {
                if (index >= 1 && b[index - 1] == i - 1) {
                    word += "-" + i;
                } else {
                    if (word.compareTo("") != 0) {
                        res2.add(word);
                    }
                    word = "";
                    word += i;
                }
                b[index++] = i;
 
            }
        }
        if (word.compareTo("") != 0) {
            res2.add(word);
        }
        System.out.print("Correct: ");
        String success=Helper.getString(res2);
        System.out.println(success);
    }
}
