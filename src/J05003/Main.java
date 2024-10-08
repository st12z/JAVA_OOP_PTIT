/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J05003;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        List<SinhVien>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new SinhVien(i+1, sc.nextLine(), sc.nextLine(),sc.nextLine(), Float.parseFloat(sc.nextLine())));
        }
        Collections.sort(list);
        for(SinhVien x:list){
            System.out.println(x);
        }
    }
}
