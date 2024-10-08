/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class J07071 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/oop_ptit/DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            list1.add(s);
            String a[] = s.split("\\s+");
            s = "";
            for (int j = 0; j < a.length; j++) {
                s += a[j].charAt(0);
            }
            list2.add(s);
        }
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<String> result = new ArrayList<>();
            String s = sc.nextLine();
            String a[] = s.split("\\.");
            s = "";
            for (int i = 0; i < a.length; i++) {
                s += a[i].charAt(0);
            }
            for (int i = 0; i < list2.size(); i++) {
                if (list2.get(i).length() == s.length()) {
                    int cnt = 0;
                    for (int j = 0; j < s.length(); j++) {
                        if (list2.get(i).charAt(j) == s.charAt(j)) {
                            cnt++;
                        }
                    }
                    if (cnt == s.length() - 1) {
                        result.add(list1.get(i));
                    }
                }
            }
            Collections.sort(result, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    String str1[] = o1.split("\\s+");
                    String str2[] = o2.split("\\s+");
                    if (str1[str1.length - 1].equals(str2[str2.length - 1])) {
                        return str1[0].compareTo(str2[0]);
                    }
                    return str1[str1.length - 1].compareTo(str2[str2.length - 1]);
                }
            });
            for(String x:result) System.out.println(x);
        }
    }
}
