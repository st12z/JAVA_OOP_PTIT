/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9;

/**
 *
 * @author T
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        List<SinhVien> list = new ArrayList<>();
        int n =Integer.parseInt(sc.nextLine());
        while(n-->0){
            String ten=sc.nextLine();
            String a[]=sc.nextLine().split(" ");
            int c=Integer.parseInt(a[0]);
            int s=Integer.parseInt(a[1]);
            list.add(new SinhVien(ten, c, s));
        }
        Collections.sort(list);
        for(SinhVien x:list){
            System.out.println(x);
        }
    }
}
