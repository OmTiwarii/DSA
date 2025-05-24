public class question7 {
    //Cyclically rotate an array by one
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n = arr.length;
        int arrlast =arr[n-1];

        for(int i=n-1;i>0;i--){
           arr[i]=arr[i-1];
        }
        arr[0]=arrlast;
        
        for(int i=0;i<=n-1;i++){
            System.out.println(arr[i]+ " ");
        }

    }
}
