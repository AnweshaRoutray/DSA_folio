package DSA_Sheet.Arrays;
//returning the length of subarray with maximum sum
public class MaxSubArray {
    public static void main(String[] args) {
        int nums[]={5,4,-1,7,8};
        int n=nums.length;
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            curr_sum+=nums[i];
            if(curr_sum<0)
            {
                curr_sum=0;
            }
            if(curr_sum>max_sum)
            {
                max_sum=curr_sum;
            }

        }
        System.out.println(max_sum);
    }
    
}
