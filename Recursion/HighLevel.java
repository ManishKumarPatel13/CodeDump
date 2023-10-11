public class HighLevel {

    public static char reverseStr(String str, char rev, int n){
        if(n==0){
            System.out.print(str.charAt(n));
            return rev;
        }
        rev = str.charAt(n);
        System.out.print(rev);
        return reverseStr(str, rev, n-1);
    }

    public static String pieReplace(String str, int n, int i, String pied){
        if (i == n){
            return pied;
        }
        else if(str.charAt(i) == 'p' && str.charAt(i+1) == 'i'){
            pied += 3.14;
            return pieReplace(str, n, i+2, pied);
        }
        pied += String.valueOf(str.charAt(i));
        return pieReplace(str, n, i+1, pied);
    }

    public static void TowerofHanoi(int n, char src, char dest, char helper){
        if (n==0){
            System.out.println(0);
            return;
        }
        TowerofHanoi(n-1, src, helper, dest);
        System.out.println("Move from " + src + " to " + dest);
        System.out.println(n);
        TowerofHanoi(n-1, helper, dest, src);
        // System.out.println("h");
    }

    // public static String RemoveDublicate(String str){
    //     if(str.length() == 0){
    //         return "";
    //     }
    //     char head = str.charAt(0);
    //     String ans = RemoveDublicate(str.substring(1));
    //     if(head == ans.charAt(0)){
    //         return ans;
    //     }

    //     return head+ans;
    // }


        public static String moveEnd(String str){
            if (str.length() == 0){
                return "";
            }

            char ch = str.charAt(0);
            String ans = moveEnd(str.substring(1));

            if (ch == 'x'){
                return ans + ch;
            }
            return ch+ans;
        }

        public static void givesubstr(String str, String ans){
            if(str.length() == 0){
                System.out.println(ans); // printing the substrings 
                return;
            }
            char head = str.charAt(0);
            String Ros = str.substring(1); // In ros the rest of string in present excluding the first char
            givesubstr(Ros, ans); // giving the parameters as the main string var is the ros in which first char is removed 
            givesubstr(Ros, ans+String.valueOf(head)); // Now the first char is added to the main ans var
        }

        public static void givesubans(String str, String ans){
            if(str.length() == 0){
                System.out.println(ans); // printing the substrings 
                return;
            }
            char head = str.charAt(0);
            int code = head;
            String Ros = str.substring(1); // In ros the rest of string in present excluding the first char
            givesubans(Ros, ans); // giving the parameters as the main string var is the ros in which first char is removed 
            givesubans(Ros, ans+String.valueOf(head)); // Now the first char is added to the main ans var
            givesubans(Ros, ans + String.valueOf(code));
        }

        public static void getWordsFromNumber(String s, String ans){
            String[] letters = {"", "./", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            if(s.length() == 0){
                System.out.println(ans);
                return;
            }
            char head = s.charAt(0);
            String code = letters[head-'0']; // this will give the int value by subtracting the ascii value of 0 from ascii value of head
            String Ros = s.substring(1);
            for(int i = 0; i< code.length(); i++){

                getWordsFromNumber(Ros, ans+String.valueOf(code.charAt(i)));
            }
        }
     
    public static void main(String[] args) {
        // String a = "manish patel";
        // char re = ' ';
        // System.out.println();
        // char r = reverseStr(a, re, a.length() - 1); 
        // String np = "aaaaaabbbbbbbbbcccccccccddddddddd";
        // String pied = "";
        // String p = pieReplace(np, np.length(), 0, pied);
        // System.out.println(p);
        // TowerofHanoi(2, 'A', 'C', 'B');
        // String nodub = RemoveDublicate(np);
        // System.out.println(RemoveDublicate(np));
        // System.out.println(moveEnd("ddfdxxasdxgs"));
        // givesubstr("ABC", "");

        // givesubans("AB", "");

        getWordsFromNumber("23", "");
    }
}
