import java.util.HashMap;
import java.util.Map;

public class WordPattern {


    public static boolean wordPattern(String pattern, String str) {
        // parse str into space separated list
        String[] parts = str.split(" ");
        Map<Character,String> map = new HashMap<>();
        // the scenario where letters in pattern do not map 1 to 1 with words in str
        if(parts.length == 0 || pattern.equals("")) {
            return false;
        }
        if(parts.length % pattern.length() != 0) {
            return false;
        }



        int i = 0;
        while(i < pattern.length()) {
            Character key = pattern.charAt(i);
            String word = parts[i];
            if(map.containsKey(key)) {
                if(!map.get(key).equals(word)) {
                    return false;
                }
            } else {
                if(map.containsValue(word)) {
                    return false;
                } else {
                    map.put(key,word);
                }
            }
            i++;
        }

        return true;
    }

    public static void main(String[] args) {
//        System.out.println("should be true, was: "+wordPattern("abba", "dog cat cat dog"));
//        System.out.println("should be false, was: "+wordPattern("abba", "dog cat cat fish"));
//        System.out.println("should be false, was: "+wordPattern("aaaa", "dog cat cat dog"));
        System.out.println("should be false, was:"+wordPattern("abba", "dog dog dog dog"));
        System.out.println("should be false, was:"+wordPattern("", "beef"));
        // I would ask if multiple lowercase letters could denote one word, e.g. is "aabb" and "cat dog" true
    }
}
