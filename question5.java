public class question5 {
    // Move all negative numbers to beginning and positive to end
  public static void main(String[] args) {
    int arr[]={3,2,1,-7,-4};
    int n=arr.length;
    int left =0;
    int right = n-1;

    while(left<=right){
        if(arr[left]<0 && arr[right]<0){
            left++;
        }else if(arr[left]>0 && arr[right] <0){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

        }else if(arr[left]>0 && arr[right]>0){
            right--;
        }else{
            left++;
            right--;
        }
    }
    for(int i=0;i<n;i++){
        System.out.println(arr[i]+ " ");
    }

  
  }  
}
