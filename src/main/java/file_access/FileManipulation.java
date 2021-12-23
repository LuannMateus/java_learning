package file_access;

import java.io.File;
import java.io.IOException;

public class FileManipulation {
  public static void main(String[] args) {
    File file = new File("./src/main/java/files_access/file.txt");

    if (file.exists()) {
      System.out.printf("The file exists!\n");
      System.out.printf("The file can be read: [%b]\n", file.canRead());
      System.out.printf("The file can be write: [%b]\n", file.canWrite());
      System.out.printf("Length: [%s]\n", file.length());
      System.out.printf("File Path: [%s]\n", file.getPath());
    } else {
      try {
        if (file.createNewFile()) {
          System.out.println("File created!");
        } else {
          System.out.println("File not created!");
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
