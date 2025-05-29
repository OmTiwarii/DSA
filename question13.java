public class question13 {
    public static void main(String[] args) {
        //Find all pairs with a given sum

        int arr[]={1,2,3,4,5};
        int sum =5;
       

        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
               System.out.println("pairs are :"+ arr[i]+","+ arr[j]);     
                }
            }
            



           
          
        }
    }
}
