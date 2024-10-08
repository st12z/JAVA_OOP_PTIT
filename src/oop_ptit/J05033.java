/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class J05033 {

    public static class Time implements Comparable<Time>{

        private int gio, phut, giay;

        public Time() {

        }

        public Time(int gio, int phut, int giay) {
            this.gio = gio;
            this.phut = phut;
            this.giay = giay;
        }

        public int getGio() {
            return gio;
        }

        public int getPhut() {
            return phut;
        }

        public int getGiay() {
            return giay;
        }

        @Override
        public String toString() {
            return gio + " " + phut + " " + giay;
        }

        @Override
        public int compareTo(Time o2) {
            if (this.getGio() != o2.getGio()) {
                return this.getGio() - o2.getGio();
            }
            if (this.getPhut() != o2.getPhut()) {
                return this.getPhut() - o2.getPhut();
            }
            return this.getGiay() - o2.getGiay();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Time(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
//        Comparator<Time> cmp = new Comparator<Time>() {
//            @Override
//            public int compare(Time o1, Time o2) {
//                if(o1.getGio()!=o2.getGiay()){
//                    return o1.getGio()-o2.getGio();
//                }
//                if(o1.getPhut()!=o2.getPhut()){
//                    return o1.getPhut()-o2.getPhut();
//                }
//                return o1.getGiay()-o2.getGiay();
//            }
//        };
//        Collections.sort(list, (o1, o2) -> {
//            if (o1.getGio() != o2.getGiay()) {
//                return o1.getGio() - o2.getGio();
//            }
//            if (o1.getPhut() != o2.getPhut()) {
//                return o1.getPhut() - o2.getPhut();
//            }
//            return o1.getGiay() - o2.getGiay();
//        });
        Collections.sort(list);
        for (Time x : list) {
            System.out.println(x.toString());
        }
    }
}
