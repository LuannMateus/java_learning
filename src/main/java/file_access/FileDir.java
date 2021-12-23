package file_access;

import java.io.File;

public class FileDir {
  public static void main(String[] args) {
    File dir = new File("./src/main/java/files_access/fiap");

    if (dir.exists()) {
      System.out.println("The dir exists!");
    } else {
      if (dir.mkdir()) {
        System.out.println("Dir created!");
      } else {
        System.out.println("Dir not created!");
      }
    }

  }
}
