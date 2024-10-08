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
class MonThi implements Comparable<MonThi>{
    private String ma,tenMon,hinhThuc;

    public MonThi(String ma, String tenMon, String hinhThuc) {
        this.ma = ma;
        this.tenMon = tenMon;
        this.hinhThuc = hinhThuc;
    }

    @Override
    public int compareTo(MonThi o) {
        return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma+" "+tenMon+" "+hinhThuc;
    }
    
}
public class J07058 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/oop_ptit/MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<MonThi> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new MonThi(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(list);
        for(MonThi x:list){
            System.out.println(x);
        }
    }
}
