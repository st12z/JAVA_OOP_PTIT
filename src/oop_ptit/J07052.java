/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
class ThiSinh implements Comparable<ThiSinh> {

    private String ma, ten;
    private double dT, dL, dH, total, plus;
    private String status;

    public ThiSinh(String ma, String ten, double dT, double dL, double dH) {
        this.ma = ma;
        this.ten = "";
        String a[] = ten.trim().toLowerCase().split("\\s+");
        for (int i = 0; i < a.length; i++) {
            a[i] = Character.toUpperCase(a[i].charAt(0)) + a[i].substring(1);
            this.ten += a[i] + " ";
        }
        this.ten = this.ten.trim();
        this.dT = dT;
        this.dL = dL;
        this.dH = dH;
        plus = 0;
        if (ma.startsWith("KV1")) {
            total = dT * 2 + dL + dH + 0.5;
            plus = 0.5;
        } else if (ma.startsWith("KV2")) {
            total = dT * 2 + dL + dH + 1;
            plus = 1;
        } else {
            plus = 2.5;
            total = dT * 2 + dL + dH + 2.5;
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public int compareTo(ThiSinh o) {

        if (this.total < o.total) {
            return 1;
        }
        if (this.total > o.total) {
            return -1;
        }

        return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        String res = ma + " " + ten + " ";
        if ((int) plus == this.plus) {
            res += (int) plus + " ";
        } else {
            res += String.format("%.1f", plus) + " ";
        }
        if ((int) total == this.total) {
            res += (int) total + " ";
        } else {
            res += String.format("%.1f", total) + " ";
        }
        res += status;
        return res;
    }

}

public class J07052 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/oop_ptit/THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        int chiTieu = sc.nextInt();
        Collections.sort(list);
        double diemChuan = list.get(chiTieu - 1).getTotal();
        for (ThiSinh x : list) {
            if (x.getTotal() >= diemChuan) {
                x.setStatus("TRUNG TUYEN");
                diemChuan = x.getTotal();
            } else {
                x.setStatus("TRUOT");
            }
        }
        System.out.println(String.format("%.1f", diemChuan));
        for (ThiSinh x : list) {
            System.out.println(x);
        }

    }
}
