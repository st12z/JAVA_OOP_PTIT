
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
public class J02027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            Integer a[]=new Integer[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            long cnt=0;
            for(int i=0;i<n;i++){
                int l=i+1;
                int r=n-1;
                int index=-1;
                while(l<=r){
                    int mid=(l+r)/2;
                    if(a[mid]-a[i]<k){
                        index=mid;
                        l=mid+1;
                    }
                    else{
                        r=mid-1;
                    }
                }
                if(index!=-1){
           
                    cnt+=(index-i);
                }
            }
            System.out.println(cnt);  
        }
    }
}
