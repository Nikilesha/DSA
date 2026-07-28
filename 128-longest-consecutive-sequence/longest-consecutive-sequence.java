class Solution {
    public int longestConsecutive(int[] nums) {
        
        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        // Store all numbers in the HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Check each number
        for (int num : set) {

            // Start counting only if this is the beginning of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentStreak = 1;

                // Count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }
}