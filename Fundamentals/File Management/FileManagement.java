import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileManagement {
    public static void main(String[] args) throws IOException {

        // Using the `File` class
        File myFile = new File("Sample File.txt");
        // File myFile = new File("/Users/apple/Desktop/Java/Learning/File
        // Management/Sample File.txt"); // in full file path
        if (myFile.exists()) {
            System.out.println("The file exists");
            System.out.println(myFile.getPath());
            System.out.println(myFile.getAbsolutePath());
            System.out.println(myFile.isFile());
            // myFile.delete(); // delete the file
        } else {
            System.out.println("The file doesn't exist");
        }

        // Using the `FileWriter` class
        try {
            FileWriter writer = new FileWriter("Haiku.txt");
            writer.write("古池や\n蛙飛び込む\n水の音");
            writer.append("\n\n(ふるいけや\nかわずとびこむ\nみずのおと)\n\n松尾 芭蕉 (まつお ばしょう)");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Using the `FileReader` class
        /*
         * FILE READER
         * reads the contents as a stream of characters one by one
         * the `read()` method returns an integer value, which contains the byte value
         * - it returns -1 when it reaches the end of the file
         */
        try {
            FileReader reader = new FileReader("ASCII Art.txt");
            int read = reader.read();
            while (read != -1) {
                System.out.print((char) read);
                read = reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}