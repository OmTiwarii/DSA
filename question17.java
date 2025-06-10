import java.util.HashSet;

public class question17 {
    //Find intersection of two sorted arrays
    public static void intersection_sortedarr(int arr[],int arr2[]){
   HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr2.length;j++){
            if(arr[i]==arr2[j]){
                set.add(arr[i]);
            }
        }

        }
        System.out.println("intersection of two sorted array is: "+set);

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int arr2[]={5,6,7,8,9,10};
        intersection_sortedarr(arr,arr2);
        
    }
}
