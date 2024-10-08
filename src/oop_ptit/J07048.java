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
class Product implements Comparable<Product>{
    private String ma,ten;
    private int giaBan;
    private int baoHanh;

    public Product(String ma, String ten, int giaBan, int baoHanh) {
        this.ma = ma;
        this.ten = ten;
        this.giaBan = giaBan;
        this.baoHanh = baoHanh;
    }

    @Override
    public int compareTo(Product o) {
        if(this.giaBan!=o.giaBan){
            return o.giaBan-this.giaBan;
        }
        return this.ma.compareTo(o.ma);
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+giaBan+" "+baoHanh;
    }
    
}
public class J07048 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/oop_ptit/SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Product>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(list);
        for(Product x:list){
            System.out.println(x);
        }
    }
}
