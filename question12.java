import java.util.HashMap;
import java.util.HashSet;

public class question12 {
    public static void main(String[] args) {
        //Count the number of occurrences of an element 
        int arr[]={1,2,2,2,3,3,4};
        HashSet<Integer> arr1 = new HashSet<>();
        
       for(int i=0;i<arr.length;i++){
        int count =0;
        if(arr1.contains(arr[i])){
            continue;
        }
        for(int j=i;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count ++;
            }
            arr1.add(arr[i]);
        }
        System.out.println(arr[i]+  "=" + count);
      
       }
     
      

   }
}
