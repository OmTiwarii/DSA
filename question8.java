public class question8 {
    public static void main(String[] args) {
        // Kadane's Algorithm - Maximum Subarray Sum
        int arr[]={3,2,1,-7,-4};
    int maxsofar = Integer.MIN_VALUE;
    int currentmax = 0;
        
    for(int i=0;i<arr.length;i++){
        currentmax = Math.max( arr[i], currentmax + arr[i]);
        maxsofar= Math.max(currentmax, maxsofar );
    
    }
    System.out.println(maxsofar);

    }
}
