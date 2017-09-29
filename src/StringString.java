public class StringString {

    public static int strStr(String haystack, String needle) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("index should be 0, was: "+strStr("haystack","hay"));
        System.out.println("index should be 1, was: "+strStr("1haystack","hay"));
        System.out.println("index should be 0, was: "+strStr("haystackhay","hay"));
        System.out.println("index should be -1, was: "+strStr("hayhay","b"));
        System.out.println("index should be 4, was: "+strStr("mississippi","issip"));
    }
}
