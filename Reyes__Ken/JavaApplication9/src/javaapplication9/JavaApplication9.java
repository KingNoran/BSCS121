package javaapplication9;
import java.io.FileOutputStream;
import java.io.OutputStream;
public class JavaApplication9 {
    public static void main(String[] args) {
        String data = "This is a line of text inside the file.";

        try {
            OutputStream out = new FileOutputStream("output.txt");

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            out.write(dataBytes);
            System.out.println("The following data is written.");

            // Closes the output stream
            out.close();
        }

        catch (Exception e) {
        }
    }
}
    

