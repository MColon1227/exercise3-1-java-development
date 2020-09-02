import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

/**
 * @author Marisol Colon
 * Exercise 3.1 java development
 */

public class Main {

        public static String printJsonFile(){
            JSONParser parser = new JSONParser();

            String AppSettings = null;

            try {
                Object obj = parser.parse(new FileReader("./test.json"));

                JSONObject jsonObject = (JSONObject) obj;

                AppSettings = jsonObject.get("AppSettings").toString();

            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return AppSettings;
        }


    public static void main(String[] args) {
        // Apply properties when calling the method.
        // Return type: string.
        System.out.println("The value based on the key: " + printJsonFile());
    }
}
