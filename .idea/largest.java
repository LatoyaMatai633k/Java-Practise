class Largest {
    public static void large() {
        int[] nums = {5, 3, 9, 1, 7, 2, 8, 4, 6};
        int max = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
    }
}