public class question22 {
    //Check for palindrome
    public static void Check_for_palindrome(String str){
        char[] arr = str.toCharArray();
        int last = arr.length-1;
        int first = 0;
        int count=0;

        while(first<last){
            if(arr[first]== arr[last]){
                count++;
            }
   last--;
   first++;
        }
        if(count== (arr.length/2)){
            System.out.println("it is a palindrome");
        }else{
            System.out.println("it is not a palindrome");
        }
 
    }
    public static void main(String[] args) {
        String str = "tiwari";
        Check_for_palindrome(str);
        
    }
}
