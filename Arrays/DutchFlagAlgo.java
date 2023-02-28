package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DutchFlagAlgo {
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
        sorts(a,n);
    }
    private void sorts(int[] a,int n){
        int low=0,mid=0,high=n-1;
        while (low<=high){
            while (a[mid]==0){
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                low++;
                mid++;
            }
            while (a[mid]==1){
                mid++;
            }
            while (a[mid]==2){
                int temp=a[mid];
                a[mid]=a[low];
                a[low]=temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
