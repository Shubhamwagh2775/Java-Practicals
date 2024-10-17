import java.io.FileWriter;   
import java.io.IOException;  

public class WriteFile {
  public static void main(String[] args) {
    try {
      FileWriter p2 = new FileWriter("filename.txt");
      p2.write("File is written");
      p2.close();
      System.out.println("file is written");
    } catch (IOException e) {
      System.out.println("An error found");
      e.printStackTrace();
    }
  }
}

