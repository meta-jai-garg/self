import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DriverClass {

	public static void main(String[] args) throws FileNotFoundException,
			ParseException {
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject) parser
				.parse("{\"one\":1,\"two\":2,\"three\":3,\"four\":4,\"five\":5}");
		Dictionary<String, Integer> dictionary = new BST<String, Integer>(
				jsonObject);
		// dictionary.add(5, "Hello");
		// dictionary.add(3, "Hi");
		// dictionary.add(7, "World");
		// dictionary.add(4, "Niraj");
		// dictionary.add(8, "Jai");
		List<BSTNode<String, Integer>> list = dictionary.getSortedList("one",
				"three");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Key: " + list.get(i).getKey() + ", Value: "
					+ list.get(i).getValue());
		}
		System.out.println();
	}
}
