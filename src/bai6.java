/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T
 */
import java.util.*;
import java.io.*;

public class bai6 {

    static String chuanHoa(String s) {
        String a[] = s.trim().toLowerCase().split("\\s+");
        String email = "";
        for (int i = 0; i < a.length - 1; i++) {
            email += a[i].charAt(0);
        }
        email = a[a.length - 1] + email;
        return email;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        Set<String> set = new LinkedHashSet<>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        while (sc.hasNext()) {
            String s[] = sc.nextLine().toLowerCase().trim().split("\\s+");
            String word="";
            for(String x:s){
                word+=x+" ";
            }
            set.add(word);
        }
        for (String s : set) {
            String email = chuanHoa(s);
            if (map.containsKey(email)) {
                map.put(email, map.get(email) + 1);
                email += (map.get(email) + 1) + "@ptit.edu.vn";

            } else {
                map.put(email,0);
                email+="@ptit.edu.vn";
            }
            System.out.println(email);
        }
    }
}
