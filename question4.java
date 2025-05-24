public class question4 {
    //Sort an array of 0s, 1s and 2s (Dutch National Flag Problem)
    public static void main(String[] args) {
        int arr[]={1,2,0,1,0,2};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

            

    }

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
}
}
