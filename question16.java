import java.util.HashSet;

public class question16 {

    // Find duplicate number in aray
    //simple loops
    public static void  duplicate_number_in_arr(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("duplicate element is :"+arr[i]);
                    return;
                }
            }
        }


    }
//using hashset 
    public static  void duplicate_number_in_arr_usinghashset(int arr[]){

        HashSet<Integer> arr1 = new HashSet<>();
        for(int i : arr){
            if(arr1.contains(i)){
                System.out.println("duplicate element is :" +i);
                return;
            }else{
                arr1.add(i);
            }

        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,6};
        duplicate_number_in_arr(arr);
     duplicate_number_in_arr_usinghashset(arr);
    }
}
