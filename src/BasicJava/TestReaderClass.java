package BasicJava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TestReaderClass  {
    public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReader("D:\\Download_Chrome\\Java Developer Resume.txt");
        char [] array =new char[1000];
        System.out.println("ready methods  "+fileReader.ready());
        fileReader.read(array);
        System.out.println("file content is "+String.valueOf(array));
        fileReader.close();
    }
     }
