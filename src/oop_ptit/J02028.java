/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_ptit;

import java.util.Scanner;

/**
 *
 * @author T
 */
public class J02028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            long f[]=new long[n+1];
            f[0]=0;
            for(int i=1;i<=n;i++){
                f[i]=f[i-1]+a[i-1];
            }
            int check=0;
            for(int i=0;i<=n;i++){
                int l=i;
                int r=n;
                while(l<=r){
                    int mid=(l+r)/2;
                    if(f[mid]-f[i]==k && mid!=i){
                        check=1;
                        break;
                    }
                    else if(f[mid]-f[i]<k){
                        l=mid+1;
                    }
                    else{
                        r=mid-1;
                    }
                }
                if(check==1) break;
            }
            if(check==1) System.out.println("YES");
            else{
                System.out.println("NO");
            }
        }
    }
}
