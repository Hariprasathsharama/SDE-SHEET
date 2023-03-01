package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicRotate {
    public static void main(String[] args) {
        new CyclicRotate().init();
    }
    private void init(){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new  int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        rotate(a,n);
    }
    private void rotate(int[] a,int n){
        int i=0;
        while (i<n){
            int temp=a[i];
            a[i]=a[n-1];
            a[n-1]=temp;
            i++;
        }
        System.out.println(Arrays.toString(a));
    }
}
