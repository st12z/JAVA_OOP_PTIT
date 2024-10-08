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
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
class MonHoc_J07073 implements Comparable<MonHoc_J07073>{
    private String ma,ten;
    private int soTin;
    private String dayLT,dayTH;

    public MonHoc_J07073(String ma, String ten, int soTin, String dayLT, String dayTH) {
        this.ma = ma;
        this.ten = ten;
        this.soTin = soTin;
        this.dayLT = dayLT;
        this.dayTH = dayTH;
    }

    public String getDayTH() {
        return dayTH;
    }
    
    @Override
    public int compareTo(MonHoc_J07073 o) {
        return this.ma.compareTo(o.ma);
    }
    @Override
    public String toString() {
        return ma+" "+ten+" "+soTin+" "+dayLT+" "+dayTH;
    }
    
    
    
}
public class J07073 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/oop_ptit/MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<MonHoc_J07073> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new MonHoc_J07073(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),sc.nextLine() , sc.nextLine()));
        }
        Collections.sort(list);
        List<MonHoc_J07073> listOnl =new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(!list.get(i).getDayTH().equals("Truc tiep")) listOnl.add(list.get(i));
        }
        for(MonHoc_J07073 m :listOnl) System.out.println(m);
    }
}
