
import java.util.*;

public class maxSubStrWithoutRepeating {
    public static void msswr(String s){
        ArrayList<Character> dict = new ArrayList<>();
        int maxlen = 1, start = 0;
        for(int i = 0; i<s.length(); i++){
            if(!dict.contains(s.charAt(i))){
                start += 1;
                dict.add(s.charAt(i));
                // Collections.min(dict);
            }
            
            else{
                if (start > maxlen){
                    maxlen = start;
                }
                start = 0;
            }
        }
        System.out.println(dict.subList(0, 3).size());
        System.out.println(maxlen); 
    }
    public static void main(String[] args) {
        msswr("bedeh");
    }
}
