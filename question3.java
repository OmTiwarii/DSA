
import java.util.Scanner;
import java.util.Arrays;
// Find the 'Kth' max and min element of an array

public class question3 {
    public static void main(String[] args) {
      Scanner val = new Scanner(System.in);
      System.out.print("enter the value of kth term : ");
      int k = val.nextInt();

      int arr[]={21,3,5,6,7,};
     // Arrays.sort(arr);
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
     }
      
      int kthmin = arr[k-1];
      int kthmax = arr[arr.length-k];

      System.out.println("the Kth min element is :" + kthmin);
      System.out.println("the Kth max element is :" + kthmax);
      

    }
}
