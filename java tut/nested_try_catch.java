public class nested_try_catch {
    public static void main(String[] args) {
        int a = 78;
        try{
            System.out.println("level 1");
            try{
                System.out.println("level 0");
            }
            catch(Exception e){
                System.out.println(e);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
