public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i || nums[i] > nums.length-1) {
                i++;
            } else if(nums[nums[i]] != nums[i]) {
                swap(nums,i, nums[i]);
            } else {
                i++;
            }
        }
        i=0;
        while(i < nums.length && nums[i] == i) {
           i++;
        }
        return i;
    }


    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0,1,2,4}));
        System.out.println(missingNumber(new int[]{0,1,2,3,4,6}));
        System.out.println(missingNumber(new int[]{1,2,3,4,5}));

    }
}
