/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class J07001_DocFileVanBan {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("src/oop_ptit/DATA.in");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
