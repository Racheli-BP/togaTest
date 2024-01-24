public class Main {
    public static int findPeek(int[] nums, int start, int end) {

        int mid = start + (end - start) / 2;

        if ((mid == 0 || nums[mid] > nums[mid - 1]) && (mid == nums.length - 1 || nums[mid] > nums[mid + 1]))
            return mid;

        if (start == end)
            return start;

        if (mid < nums.length - 1 && nums[mid] < nums[mid + 1])
            return findPeek(nums, mid + 1, end);

        if (mid > 0 && nums[mid] < nums[mid - 1])
            return findPeek(nums, start, mid - 1);

        return -1;
    }


    public static void main(String[] args) {

        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Result: " + findPeek(arr, 0, arr.length - 1));
    }
}