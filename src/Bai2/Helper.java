/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T
 */
public class Helper {

    public static String getString(ArrayList<String> res) {
        String word="";
        for (int i = 0; i < res.size(); i++) {
            String[] x = res.get(i).split("-");
            String x1 = x[0];
            String s = x1;
            String x2 = "";
            if (x.length > 1) {
                x2 = x[x.length - 1];
                s += "-" + x2;
            }
            if (i < res.size() - 2) {
                s += ", ";
            } else if (i == res.size() - 2) {
                s = s + " and ";
            }
            word+=s;
        }
        return word;
    }
}
