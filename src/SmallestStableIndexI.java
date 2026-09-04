import java.util.*;

class SmallestStableIndexI {
    public static int firstStableIndex(int[] nums, int k) {
        int[] score= new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int minimum=nums[i];
            int maximum=nums[i];

            for(int j=i;j>=0;j--){
                if(nums[j]>maximum){
                    maximum=nums[j];
                }
            }

            for(int l=i;l<nums.length;l++){
                if(nums[l]<minimum){
                    minimum=nums[l];
                }
            }

            score[i]=maximum-minimum;
        }


        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=0;i<score.length;i++){
            if(score[i]<=k){
                arr.add(i);
            }
        }

        if(arr.size()==0){
            return -1;
        }
        int fmin=arr.get(0);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<fmin){
                fmin=arr.get(i);
            }
        }
        return fmin;
    }
    public static void main(String args[]){
        int[] nums={3,2,1};
        int k=1;
        System.out.println(firstStableIndex(nums,k));

        int[] nums1={5,0,1,4};
        int k1=3;
        System.out.println(firstStableIndex(nums1, k1));
    }
}