package BasicJava;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestWriterClass {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("D:\\Download_Chrome\\Resume.txt");
        System.out.println("file is okay ");
        writer.write("its new resume text file ");
        writer.close();
    }
}
