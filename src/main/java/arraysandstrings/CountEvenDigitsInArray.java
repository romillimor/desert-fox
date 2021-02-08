package arraysandstrings;

public class CountEvenDigitsInArray {

    public static int findNumbers(int[] nums) {

        int count = 0;

        if (nums.length == 0) {
            count = 0;
        } else {

            for (int i = 0; i < nums.length; i++) {
                String str = Integer.toString(nums[i]);
                if (str.length() % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{12,345,2,6,7896};
        int evenCount = findNumbers(nums);
        System.out.println(evenCount);
    }
}
