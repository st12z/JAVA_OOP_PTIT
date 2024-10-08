/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
class SinhVien {

    private String maSV = "B20DCCN";
    private String ten, lop, namSinh;
    private double gpa;

    public SinhVien() {

    }

    public SinhVien(int index, String ten, String lop, String namSinh, double gpa) throws ParseException {
        this.maSV=String.format("B20DCCN%03d", index);
        this.ten = ten;
        this.lop = lop;
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        this.namSinh = date.format(date.parse(namSinh));
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return maSV + " " + ten + " " + lop + " " + namSinh + " " + String.format("%.2f", gpa);
    }

}

public class J07010 {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        File f = new File("src/oop_ptit/SV.in");
        Scanner sc = new Scanner(f);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            SinhVien a = new SinhVien(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            System.out.println(a);
        }
    }
}
