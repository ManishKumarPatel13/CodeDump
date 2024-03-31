import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\CodeDump\\java tut\\packagessJava\\File I\\O\\output.txt"));
            System.out.println(reader.ready()); // Check if the file is ready to read
            String data = reader.readLine(); // reads the line of the file and points to next line when called again
            System.out.println(data);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
