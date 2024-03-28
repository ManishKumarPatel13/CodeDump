public class deb {
    public static boolean func(String n){
        int l = n.length();
        for(int i = 2; i< l;i++){
            int s = Character.getNumericValue(n.charAt(i-1)) + Character.getNumericValue(n.charAt(i-2));
            if (s == Character.getNumericValue(n.charAt(i))){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        boolean ret = func("1235813");
        System.out.println(ret);
    }
}  