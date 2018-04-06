import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileApp {
  public static void main(String[] args) {
    String fileName = "meals.csv";
    try {
      URL file = FileApp.class.getResource(fileName);
      BufferedReader reader =
          Files.newBufferedReader(Paths.get(file.toURI()));

      while (true) {
        String line = reader.readLine();
        if (line == null) {
          break;
        }
        String[] items = line.split(",");
        MealOrder mealOrder = new MealOrder(items[0], items[1]);
        mealOrder.display();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (URISyntaxException e) {
      e.printStackTrace();
    }
  }
}
