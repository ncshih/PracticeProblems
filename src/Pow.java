public class Pow {


    public static double myPow(double x, int n) {
        double ans = 1;

        if(n > 0) {
           for(int i = 0; i < n; i++) {
               ans *= x;
           }
        }
        else if(n < 0) {
            for(int i = 0; i > n; i--) {
                ans /= x;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("2 squared should be 4, was: " + myPow(2,2));
        System.out.println("2 squared should be 4, was: " + myPow(2,-1));
    }
}
