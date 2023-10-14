interface sample {
    void meth1();

    void meth2();
}

interface childSample extends sample { // like class you ca inherit interface using extends
    void meth3();

    void meth4();

}

class sampleclass implements childSample{
    public void meth1(){
        System.out.println("hello");
    }
    public void meth2(){
        System.out.println("hello");
    }
    public void meth3(){
        System.out.println("hello");
    }
    public void meth4(){
        System.out.println("hello");
    }
}public class inheritence_in_interface {
   public static void main(String[] args) {
    
   } 
}
