public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int xor = 0;
        for(int i : nums) {
            xor ^= i;
        }
        return xor;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{0,0,1,1,2,2,4}));
    }
}
