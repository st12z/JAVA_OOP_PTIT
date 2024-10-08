/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07084;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author T
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int n= Integer.parseInt(sc.nextLine());
        List<TimeOnl> list = new ArrayList<>();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for(int i=0;i<n;i++){
            list.add(new TimeOnl(sc.nextLine(), df.parse(sc.nextLine()), df.parse(sc.nextLine())));
        }
        Collections.sort(list);
        for(TimeOnl t:list){
            System.out.println(t);
        }
    }
}
