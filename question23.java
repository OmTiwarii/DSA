public class question23 {

     //Remove duplicates from a string
     public static void duplicatesinstr(  String str){
        char[] arr = str.toCharArray();
        StringBuilder str2 = new StringBuilder();

        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    count++;
                
            }
            
        }
        if(count== (arr.length-1)-i){
            str2.append(arr[i]);
        }
    
    
     }
     System.out.println(str2);
    }
    public static void main(String[] args) {
        String str ="tttttiiiww";
        duplicatesinstr(str);
        
    }
    

}
