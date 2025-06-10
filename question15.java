public class question15 {
//Missing number in array [1 to n]

    public static void missingnum(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=1){
                System.out.println( "missing term is :"+ ((arr[i])-1));
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7} ;
        missingnum(arr);

    }
}
