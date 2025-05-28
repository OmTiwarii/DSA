import java.util.ArrayList;

public class question11 {
    public static void main(String[] args) {
        //Rearrange array in alternating positive & negative items

        int arr[]={5,9,7,5,-10,-9};
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                positives.add(arr[i]);
            }else{
                negatives.add(arr[i]);
            }

        }
        int pos=0;
        int neg=0;
      
         for(int i=0;i<arr.length;i=i+2){
            arr[i]= positives.get(pos++);
            
        }
        for(int i=1;i<arr.length;i+=2){
            arr[i]=negatives.get(neg++);
        }



        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
         
    }
}
