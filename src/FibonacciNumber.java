public class FibonacciNumber {
    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        int first=0;
        int second=1;

        for(int i=0;i<n-1;i++){
            int temp=second;
            second=first+second;
            first=temp;
        }

        return second;
    }
    public static void main(String[] args){
        System.out.println("Fibonacci Number for n=0 : "+ fib(0));
        System.out.println("Fibonacci Number for n=1 : "+ fib(1));
        System.out.println("Fibonacci Number for n=3 : "+ fib(3));
        System.out.println("Fibonacci Number for n=5 : "+ fib(5));
        System.out.println("Fibonacci Number for n=8 : "+ fib(8));
    }
}