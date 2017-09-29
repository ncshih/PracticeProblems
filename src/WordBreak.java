import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {





    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] found = new boolean[s.length()];



        return ans;
    }


    public static void main(String[] args) {
        System.out.println("true " + wordBreak("leetcode", new ArrayList<String>(Arrays.asList("leet","code"))));
    }
}
