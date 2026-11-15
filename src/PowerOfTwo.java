class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        while(n>1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        if(n==1){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int n1=16;
        int n2=3;
        int n3=90;
        int n4=64;

        System.out.println("Number "+ n1+" is power of 2: "+isPowerOfTwo(n1));
        System.out.println("Number "+ n2+" is power of 2: "+isPowerOfTwo(n2));
        System.out.println("Number "+ n3+" is power of 2: "+isPowerOfTwo(n3));
        System.out.println("Number "+ n4+" is power of 2: "+isPowerOfTwo(n4));
    }
}