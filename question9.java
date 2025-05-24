public class question9 {
    //Check if array is sorted and rotated
    public static void main(String[] args) {
        int arr[]={4,5,6,1,2,3};
       // int arr[]={11,7,89,8,9};
        int count =0;
        int n=arr.length;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[(i+1)%n]){
                count ++;
            }
        }
        if(count==1){
            System.out.println("array is sorted and rotated");
        }else{
            System.out.println("array is  not sorted and rotated");
        }
    
        
        
    }
}
