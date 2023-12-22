import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class PracticeUseMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 18);
        hashMap.put("b", 19);
        hashMap.put("c", 20);
        hashMap.put("d", 21);
        hashMap.put("e", 22);
        System.out.println("Display entry in a hashMap");
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display when use treeMap");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(100, 0.76f, true);
        linkedHashMap.put("a", 18);
        linkedHashMap.put("b", 19);
        linkedHashMap.put("c", 20);
        linkedHashMap.put("d", 21);
        linkedHashMap.put("e", 22);

        System.out.println("age of c is " + linkedHashMap.get("c"));
    }
}
