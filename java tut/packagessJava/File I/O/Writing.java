import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) {
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\CodeDump\\java tut\\packagessJava\\File I\\O\\output.txt"));
        writer.write("hello this is my first text file"); // Erases all contents and writes this
        writer.newLine(); // This adds a new line like \n
        writer.write("Second line");
        writer.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    }

}
