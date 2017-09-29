public class WildCard {





    public static boolean isMatch(String s, String p) {
        return comparison(s,p);
    }
    public static boolean comparison(String str, String pattern) {
        int s = 0, p = 0, match = 0, starIdx = -1;
        while (s < str.length()){
            // advancing both pointers
            if (p < pattern.length()  && (pattern.charAt(p) == '?' || str.charAt(s) == pattern.charAt(p))){
                s++;
                p++;
            }
            // * found, only advancing pattern pointer
            else if (p < pattern.length() && pattern.charAt(p) == '*'){
                starIdx = p;
                match = s;
                p++;
            }
            // last pattern pointer was *, advancing string pointer
            else if (starIdx != -1){
                p = starIdx + 1;
                match++;
                s = match;
            }
            //current pattern pointer is not star, last patter pointer was not *
            //characters do not match
            else return false;
        }

        //check for remaining characters in pattern
        while (p < pattern.length() && pattern.charAt(p) == '*')
            p++;

        return p == pattern.length();
    }


    public static void main(String[] args) {
//        System.out.println("false "+isMatch("aa","a"));
//        System.out.println("true "+isMatch("aa","aa"));
//        System.out.println("false "+isMatch("aaa","aa"));
        System.out.println("true "+isMatch("aa","*"));
        System.out.println("true "+isMatch("aa","a******a"));
//        System.out.println("true "+isMatch("ab","?*"));
//        System.out.println("false "+isMatch("aab","c*a*b"));
//        System.out.println("true "+isMatch("","*"));
//        System.out.println("false "+isMatch("zacabz","*a?b*"));
//        System.out.println("false "+isMatch("babaaababaabababbbbbbaabaabbabababbaababbaaabbbaaab","***bba**a*bbba**aab**b"));
    }
}
