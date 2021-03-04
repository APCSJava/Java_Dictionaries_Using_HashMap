import java.util.HashMap;

public class Main {

   public static void main(String[] args) {

      /* declare and initialize a map of strings to integers */
      HashMap<String, Integer> scores = new HashMap<>();

      /* insert several key-value pairs */
      scores.put("Albert", 95);
      scores.put("Boris", 84);
      scores.put("Carolyn", 97);

      /* examine the entries in the dictionary */
      System.out.println(scores);

      /* retrieve the value associated with a key */
      Integer bScore = scores.get("Boris"); // 84

      /* update the value associated with a key */
      scores.put("Boris", 86); // score updated to 86

      /* if not present set to 1; otherwise, increment */
      String name = "Dolores"; // no key with this name
      Integer count = scores.get(name);  // count is null
      if (count == null) scores.put(name, 1);
      else scores.put(name, count+1);

      name = "Boris";  // existing key with this name
      count = scores.get(name); // count not null
      if (count == null) scores.put(name, 1);
      else scores.put(name, count+1);

      /* verify changes */
      System.out.println(scores);

   }
}