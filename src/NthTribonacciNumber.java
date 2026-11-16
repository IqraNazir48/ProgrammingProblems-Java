class NthTribonacciNumber {
    public static int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int first=0;
        int second=1;
        int third=1;

        for(int i=0;i<n-2;i++){
            int temp1=second;
            int temp2=third;
            third=first+second+third;
            second=temp2;
            first=temp1;
        }
        return third;
    }
    public static void main(String[] args){
        System.out.println("Tribonacci Number for n=0 : "+ tribonacci(0));
        System.out.println("Tribonacci Number for n=1 : "+ tribonacci(1));
        System.out.println("Tribonacci Number for n=3 : "+ tribonacci(3));
        System.out.println("Tribonacci Number for n=4 : "+ tribonacci(4));
        System.out.println("Tribonacci Number for n=25 : "+ tribonacci(25));
    }
}