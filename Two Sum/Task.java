class Solution {
    public static int[] twoSum(int[] nums, int target) 
    {
        int[] results = new int[2];

        int i = 0, j = 1;
        
        while (results[0] == 0 && results[1] == 0) 
        {
            if(j == nums.length)
            {
                i += 1;
                j = i + 1;
                continue;
            }
            else if (nums[i] + nums[j] == target) 
            {
                results[0] = i;
                results[1] = j;
                break;
            }
            else if(nums[i] + nums[j] != target)
            {
                j++;
            }
        }
        return results;
    }

    public static void main(String args[])
    {
        int[] ara = {2,7,11,15};
        int tt = 9;
        int[] baba = twoSum(ara, tt);
        System.out.println(baba[0]+","+baba[1]);;
    }
} 