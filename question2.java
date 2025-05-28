public class question2 {
    // Reverse an array in place
    public static void main(String[] args) {
        int arr[]={21,3,5,6,7,9};
        int left =0;
        int right =arr.length-1;
       
        while (left<=right){
          int  temp =arr[left];
          arr[left]=arr[right];
          arr[right]=temp;

          left++;
          right--;

        }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }

    }
}
