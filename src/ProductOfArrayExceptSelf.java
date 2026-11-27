import java.util.*;
class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> right=new ArrayList<>();
        ArrayList<Integer> left=new ArrayList<>();
        int[] result=new int[nums.length];

        int product1=1;
        int product2=1;

        for(int i=0;i<nums.length;i++){
            right.add(product1);
            product1=product1*nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){
            left.add(product2);
            product2=product2*nums[i];
        }

        int j=nums.length-1;
        for(int i=0;i<nums.length;i++){
            result[i]=right.get(i)*left.get(j);
            j-=1;
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums1 = new int[]{1, 2, 3, 4};
        int[] nums2 = new int[]{-1, 1, 0, -3, 3};

        int[] result1=productExceptSelf(nums1);
        int[] result2=productExceptSelf(nums2);

        for(int i=0;i<result1.length;i++){
            System.out.print(result1[i]+" ");
        }

        System.out.println();

        for(int i=0;i<result2.length;i++){
            System.out.print(result2[i]+" ");
        }
    }
}