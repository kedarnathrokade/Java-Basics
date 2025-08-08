package learn.strings.OccurenceOfCharater;
import java.util.Map;
import java.util.TreeMap;
public class OccurrenceOfCharacterUsingTreeMap {

    public static void main(String[] args) {
        String s = "Java Development". toLowerCase();

        s = s.replaceAll("\\s+","");

        Map<Character, Integer> map = new TreeMap<>();
        for (char c : s.toCharArray()){

            map.put(c, map.getOrDefault(c, 0)+1);


        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        

    }

}
