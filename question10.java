import java.util.ArrayList;

public class question10 {
    public static void main(String[] args) {
        //Leaders in an array
        int arr[]={30,8,7,19,7};
        int n=arr.length;
        ArrayList<Integer> arrled = new ArrayList<>();

        for(int i=0;i<n;i++){
            int count =0;
            for(int j=i+1;j<n;j++){
                if(arr[i]> arr[j]){
                  count++;
                }else{
                    count--;
                }
               
            }

            if(count ==(n-1)-i){
                arrled.add(arr[i]);
            }
        }
        System.out.println("the leaders in the array are: "+ arrled);

        

    }
}
