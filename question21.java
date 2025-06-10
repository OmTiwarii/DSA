public class question21 {
    //Reverse a string
    public static void Reverse_a_string(String str){
   //  char [] arr= str.toCharArray();
      StringBuilder strrev = new StringBuilder();
  for(int i=str.length()-1;i>=0;i--){
    strrev.append(str.charAt(i));
  }
  System.out.println(strrev);


    }


    public static void main(String[] args) {
        String str ="tiwari";
        Reverse_a_string(str);
        
    }
    
}
