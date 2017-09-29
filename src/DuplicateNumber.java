public class DuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i+1) {
                i++;
            } else if(nums[nums[i]-1] != nums[i]) {
                swap(nums,i, nums[i]-1);
            } else {
                return nums[i];
            }
        }
        return -1;
    }


    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,2,2,3,4,5}));
        System.out.println(findDuplicate(new int[]{5,5,2,1,3,4}));
    }
}
