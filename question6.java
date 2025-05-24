import java.util.ArrayList;

public class question6 {
    // Union and Intersection of array
    public static void main(String[] args) {
        int A[]={3,4,5,7};
        int B[]={2,4,5,8};
      ArrayList<Integer> AUB = new ArrayList<>();
      ArrayList<Integer> ANB = new ArrayList<>();
        //int AUB[]={};
       // int ANB[]={};
   for(int i=0;i<A.length;i++){
    if(A[i]==B[i]){
        AUB.add(A[i]);
    }else{
       
        ANB.add(A[i]);
        ANB.add(B[i]);
    }
   }
   System.out.println("union of array A and B is" + AUB);
   System.out.println("intersection of array A and B is" + ANB);
   
        
    }
}