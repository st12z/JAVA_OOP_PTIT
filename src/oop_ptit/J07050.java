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
class Product_J07050 implements Comparable<Product_J07050>{
    private String ma,ten,nhom;
    private double giaMua,giaBan;
    private double profit;
    private static int cnt=1;
    public Product_J07050(String ten, String nhom, double giaMua, double giaBan) {
        this.ma=String.format("MH%02d", cnt++);
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.profit=giaBan-giaMua;
    }

    @Override
    public int compareTo(Product_J07050 o) {
        if(this.profit<o.profit){
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+nhom+" "+String.format("%.2f", profit);
    }
    
    
    
}
public class J07050 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/oop_ptit/MATHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Product_J07050> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Product_J07050(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(list);
        for(Product_J07050 x:list){
            System.out.println(x);
        }
    }
    
}
