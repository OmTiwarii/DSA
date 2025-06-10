import java.util.ArrayList;
public class question18 {

//Trapping Rain Water 
    public static void Trapping_Rain_Water(int arr[]){
     ArrayList<Integer> leftMax = new ArrayList<>();
     ArrayList<Integer> rightMax = new ArrayList<>();

     for(int i=0;i<arr.length;i++){
        int lmax=0;
        for(int j=i;j>=0;j--){
            if(arr[j]>lmax){
                lmax=arr[j];
            }
        }
        leftMax.add(lmax);
     }

     for(int i=0;i<arr.length;i++){
        int Rmax =0;
        for(int j=i;j<arr.length;j++){
            if(arr[j]>Rmax){
                Rmax = arr[j];
            }
        }
        rightMax.add(Rmax);
     }

     int totalwater =0;

     for(int i=0;i<arr.length;i++){
        int water=0;
        water= Math.min( leftMax.get(i), rightMax.get(i))-arr[i];
        totalwater+=water;
     }
 System.out.println("the total water which is been stored is : "+totalwater+" units");
    // System.out.println(leftMax);
   //System.out.println(rightMax);
        

    }
    public static void main(String[] args) {
       int arr[]={3,1,2,4,0,1,3,2};
     // int arr[]={3,2,3};
        Trapping_Rain_Water(arr);
    }
}
