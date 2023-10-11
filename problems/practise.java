// import java.util.*;


public class practise{
    // public static ArrayList<Integer> reversee(ArrayList<Integer> ar, int rev){
    //     ArrayList<Integer> reversed = new ArrayList<>();
    //     int minValue;
    //     // reversed.
    //     for(int i = ar.size(); i>0; i--){
    //         if(ar.size() <= rev){
    //             reversed.add(ar.get(i-1));
    //         }
    //     }
    //     return reversed;
    // }
    // //Function to reverse every sub-array group of size k.
    // public static ArrayList<Integer> reverseInGroups(ArrayList<Integer> arr, int n, int k) {
    //     // code here
    //     for(int i = 0; i < arr.size(); i++){
    //         if (arr.subList(i, k).size() < k){
    //             for(int j = 0; j< k; j++){
                    
    //             }
    //         }
    //         else{
    //             reversee((ArrayList<Integer>) arr.subList(i, k), k);
    //         }
    //     }
    //     return arr;
        
    // }
    public static void main(String[] args) {
        // ArrayList<Integer> a = new ArrayList<>();
        // a.add(1);
        // a.add(2);
        // a.add(3);
        // a.add(4);
        // a.add(5);
        // ArrayList<Integer> r = reverseInGroups(a, 5, 3);
        // System.out.println(r);
        // String s = "gegeekek";
        // String uni = "";
        // int count = 0;
        // for(int i = 0 ; i< s.length()-4; i++){
        //     if(s.substring(i, i+4).contentEquals("geek")){
                
        //         i = i+4;
        //         count += 1;
        //     }
        //     else{
        //         uni += String.valueOf(s.charAt(i));
        //         System.out.println(s.substring(i, i+4));
        //     }

        //     if(i == s.length() - 5  && s.substring(i, i+4) != "geek"){
        //         uni += s.substring(i, i+4);
        //     }

        //     if(uni == "geek"){
        //         uni = "";
        //         count++;
        //     }
        // }
        // if (uni == "geek"){
        //     count++;
        //     System.out.println(count);
        //     // System.out.println("yes");
        // }
        // // System.out.println(s.substring(2, 6));
        // System.out.println(uni);


        // System.out.println(1.5-1);





        String haystack = "sadbudsad";
        String needle = "sad";
        for(int i = 0; i<haystack.length(); i++){
            if(i+needle.length() <= haystack.length()){
                System.out.println(haystack.substring(i, i+needle.length()));
            if(haystack.substring(i, i+needle.length()) == needle){
                
                System.out.println(i);
            }
            }
        }

        System.out.println(haystack.substring(0,3).equals(needle));

        


    }
}