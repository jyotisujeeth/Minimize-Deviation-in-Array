# Minimize-Deviation-in-Array
/*
You are given an array nums of n positive integers.

You can perform two types of operations on any element of the array any number of times:

If the element is even, divide it by 2.
For example, if the array is [1,2,3,4], then you can do this operation on the last element, and the array will be [1,2,3,2].
If the element is odd, multiply it by 2.
For example, if the array is [1,2,3,4], then you can do this operation on the first element, and the array will be [2,2,3,4].
The deviation of the array is the maximum difference between any two elements in the array.

Return the minimum deviation the array can have after performing some number of operations.

 */
 class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i:nums){
            if(i%2==1){
                set.add(i*2);
            }else{
                set.add(i);
            }
        }
        int diff=Integer.MAX_VALUE;
        while(true){
            int max=set.last();
            int min=set.first();
            int currDiff=max-min;
            diff=Math.min(diff,currDiff);
            if(max%2==0){
                set.remove(max);
                set.add(max/2);
            }else{
                return diff;
            }
        }
    }
}

