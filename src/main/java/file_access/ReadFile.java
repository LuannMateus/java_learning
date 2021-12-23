package file_access;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
  public static void main(String[] args) {
    try {
      FileReader fileStream = new FileReader("./src/main/java/files_access/file.txt");
      BufferedReader reader = new BufferedReader(fileStream);

      String line = reader.readLine();

      while (line != null) {
        System.out.println(line);
        line = reader.readLine();
      }

      reader.close();
      fileStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
