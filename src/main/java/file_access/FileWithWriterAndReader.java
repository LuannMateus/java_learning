package file_access;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWithWriterAndReader {
  public static void main(String[] args) {
    File dir = new File("./src/main/java/files_access/dirForTest");

    if (dir.exists()) {
      System.out.println("The dir exists!");
    } else {
      if (dir.mkdir()) {
        System.out.println("Dir created!");
      } else {
        System.out.println("Dir not created!");
      }
    }

    File file = new File(dir, "file.txt");

    try {
      if (file.createNewFile()) {
        System.out.println("File created!");
      } else {
        System.out.println("File not created!");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      FileWriter fileWriterStream = new FileWriter(file);
      PrintWriter print = new PrintWriter(fileWriterStream);

      print.println("Hello World!");

      print.close();
      fileWriterStream.close();

      FileReader fileReaderStream = new FileReader(file);
      BufferedReader reader = new BufferedReader(fileReaderStream);

      String line = reader.readLine();

      while (line != null) {
        System.out.println(line);
        line = reader.readLine();
      }

      reader.close();
      fileReaderStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
