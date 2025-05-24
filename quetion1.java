public class quetion1 {
    //minimum and maximum element in an array
        public static void main(String[] args) {
       int arr[]={21,3,5,6,7,};
       int max=0;
       int min = arr[0];
       for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }

       }
       System.out.println("the mininum and maximum element are :" + min + " "+ max);
    }
}