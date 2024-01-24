public class Main {
    public static int findPeek(int[] nums, int start, int end) {

        if (nums.length == 0)
            return -1;

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
        if (System.getenv("PARAMS") != null)
        {
            String[] params = System.getenv("PARAMS").split(" ");
            int[] arr = new int[params.length];
            for (int i = 0; i < params.length; i++)
            {
                arr[i] = Integer.parseInt(params[i]);
            }
            while (true)
                System.out.println("Result: " + findPeek(arr, 0, arr.length - 1));
        }
        else while (true)
            System.out.println("No parameters found.");
    }
}