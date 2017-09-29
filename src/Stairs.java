import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stairs {


    public static int climb(int n, ArrayList<Integer> lookup) {
        int ans;
        if(lookup == null) {
            lookup = new ArrayList<Integer>(Arrays.asList(0,1,2));
        }
        if(n < lookup.size()) {
            return lookup.get(n);
        } else {
            // need to calculate all numbers before n
            ans = climb(n-1, lookup) + climb(n-2, lookup);
            lookup.add(ans);
        }
        return ans;
    }

    public static int climbStairs(int n) {
        return climb(n, null);
    }


    public static void main(String[] args) {
        System.out.println("0 should be 0, was "+climbStairs(0));
        System.out.println("1 should be 1, was "+climbStairs(1));
        System.out.println("2 should be 2, was "+climbStairs(2));
        System.out.println("3 should be 3, was "+climbStairs(3));
        System.out.println("4 should be 5, was "+climbStairs(4));
        System.out.println("5 should be 8, was "+climbStairs(5));
        System.out.println("6 should be 13, was "+climbStairs(6));
        System.out.println("7 should be 21, was "+climbStairs(7));
    }
}
