package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveNegativeNumbers {
    public static void main(String[] args) {
        new MoveNegativeNumbers().init();
    }
    private void init(){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=input.nextInt();
        }
//        move(a,n);
        rearrange(a,n);
    }
//    private void move(int[] a,int n){
//        int left=0,right=n-1;
//        while (left<=right){
//            if (a[left]<0 && a[right]<0){
//                left++;
//            }
//           else if (a[left]>0 && a[right]<0){
//                int temp=a[left];
//                a[left]=a[right];
//                a[right]=temp;
//                left++;
//                right--;
//            }
//           else if (a[left]>0 && a[right]>0){
//                right--;
//            }
//            else {
//                left++;
//                right--;
//            }
//        }
//        System.out.println(Arrays.toString(a));
//    }
static void rearrange(int arr[], int n)
{
    int j = 0, temp;
    for (int i = 0; i < n; i++) {
        if (arr[i] == 0) {
            if (i != j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
    }
    System.out.println(Arrays.toString(arr));
}
}
