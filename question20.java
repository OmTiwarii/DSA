public class question20 {
//Maximum Product Subarray
public static void prosubarray(int arr[]){
    int maxpro=0;
//1,2,3,-4 
    for(int i=0;i<arr.length;i++ ){
        int localpro=1;
        for(int j=i;j<arr.length;j++){
            localpro*=arr[j];
            maxpro=Math.max(maxpro, localpro);
        }
        

    }
    System.out.println(maxpro);
}

public static void prosubarray2(int arr[]){
    int maxsofar = Integer.MIN_VALUE;
    int currentmax = 1;
        
    for(int i=0;i<arr.length;i++){
        currentmax = Math.max( arr[i], currentmax *arr[i]);
        maxsofar= Math.max(currentmax, maxsofar );
    
    }
    System.out.println(maxsofar);

}


    public static void main(String[] args) {
        int arr[] ={1,2,3,-4};
        prosubarray(arr);
        
    }
 
}
