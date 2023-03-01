package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        new MergeArray().init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int[] a=new int[n];
        int []b =new int[m];
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i]=input.nextInt();
        }
        merge(a,b,n,m);
    }
    private void merge(int[] a,int[] b,int n,int m){
        int i=n-1,j=0;
        while (i>=0 && j<m){
            if (a[i]>a[j]){
                swap(a,b,i,j);
            }
            i--;
            j++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a)+" "+Arrays.toString(b));
    }
    private void swap(int[]a ,int[] b,int indx1,int indx2){
        int  temp=a[indx1];
        a[indx1]=b[indx2];
        b[indx2]=temp;
    }
}
