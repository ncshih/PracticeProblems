
public class FirstPositiveMissing {

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == i+1 || nums[i] <= 0 || nums[i] > nums.length) {
                i++;
            } else if(nums[nums[i]-1] != nums[i]) {
                swap(nums,i,nums[i]-1);
            } else {
                i++;
            }
        }

        i = 0;
        while(i < nums.length && nums[i] == i+1) {
            i++;
        }
        return i+1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{3,4,-1,1}));
        System.out.println(firstMissingPositive(new int[]{1,2,0}));
        System.out.println(firstMissingPositive(new int[]{1,1}));
        System.out.println(firstMissingPositive(new int[]{1}));
    }

}
