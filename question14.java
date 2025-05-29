
// Subarray with given sum (Two pointer / Sliding window)
public class question14 {


   public static void Sub_array_with_given_sum(int[]arr,int sum){
 int start =0,end=0,localsum=0;
 

 while(end<arr.length){

    localsum+=arr[end];


    while(localsum>sum && start<=end){
        localsum-=arr[start];
        start++;
    }

    if(localsum==sum){
        System.out.println("subarray is between index" + start +"-"+ end);
       return;
    }
    end++;
 }

    }

    public static void main(String[] args) {
        int arr[]={4,6,7,8,9,5};
        int sum=22;
        Sub_array_with_given_sum(arr,sum);
        
    }
}
