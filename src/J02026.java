
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author T
 */
public class J02026 {

    static int n, k;
    static int x[];
    static int a[];

    static void in() {
        for (int i = 1; i <= k; i++) {
            System.out.print(a[x[i]] + " ");
        }
        System.out.println("");
    }

    static void sinh() {
        while (true) {
            in();
            int i = k;
            while (x[i] == n - k + i && i >= 1) {
                i--;
            }
            if (i == 0) {
                return;
            }
            x[i] += 1;
            for (int j = i + 1; j <= k; j++) {
                x[j] = x[j - 1] + 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            x=new int[k+1];
            a=new int[n+1];
            for (int i = 1; i <= k; i++) {
                x[i] = i;
            }
            for (int i = 1; i < n + 1; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            sinh();
        }

    }
}
