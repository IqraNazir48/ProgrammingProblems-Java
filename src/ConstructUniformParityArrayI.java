class ConstructUniformParityArrayI {
    public static boolean uniformArray(int[] nums1) {

        int[] result=new int[nums1.length];
        int f=1;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2!=0){
                f=0;
                break;
            }
        }
        if(f==1){
            return true;
        }
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                int flag=0;
                for(int j=0;j<nums1.length;j++){
                    if(nums1[i]-nums1[j]%2!=0 && i!=j){
                        result[i]=nums1[i]-nums1[j];
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    return false;
                }
            }
            else{
                result[i]=nums1[i];
            }
        }
        return true;

    }

    public static void main(String args[]){
        int[] nums1={2,3};
        System.out.println(uniformArray(nums1));

        int[] nums2={4,6};
        System.out.println(uniformArray(nums2));

        int[] nums3={23,86};
        System.out.println(uniformArray(nums3));





    }
}