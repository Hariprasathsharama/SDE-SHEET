package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        new Sort012().init();
    }
    public void init(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=input.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=input.nextInt();
        }
        sort(a,n);
    }
    private void sort(int[] a,int n){
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;
        for (int i=0;i<n;i++){
            switch (a[i]) {
                case 0 -> zeroCount++;
                case 1 -> oneCount++;
                case 2 -> twoCount++;
            }
        }
        int j=0;
        while (j<zeroCount){
            a[j]=0;
            j++;
        }
        while (j<zeroCount+oneCount){
            a[j]=1;
            j++;
        }
        while (j<n){
            a[j]=2;
            j++;
        }
        System.out.println(Arrays.toString(a));
    }


}
