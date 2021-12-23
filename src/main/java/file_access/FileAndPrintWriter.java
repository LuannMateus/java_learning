package file_access;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAndPrintWriter {
  public static void main(String[] args) {
    /**
     * FileWriter para abrir o arquivo.
     * PrintWriter para fazer as escritas no arquivo.
     */

    try {
      FileWriter fileStream = new FileWriter("./src/main/java/files_access/file.txt");
      PrintWriter print = new PrintWriter(fileStream);

      print.println("1 Linha");
      print.println("3 Linha");

      print.close();
      fileStream.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
