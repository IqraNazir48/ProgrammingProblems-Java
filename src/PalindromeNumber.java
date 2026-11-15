public class PalindromeNumber{
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int number=x;
        int val=1;
        
        while(number>=10){
            number=number/10;
            val*=10;
        }
        int newnumber=0;
        number=x;
        int modulus=0;
        while(number>=10){
            modulus=number%10;
            number=number/10;
            newnumber+=modulus*val;
            val/=10;
        }
        newnumber+=number*val;
        if(newnumber==x){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args){
        int num1=131;
        int num2=1221221;
        int num3=1;
        int num4=-121;

        System.out.println("Number "+num1+" is Plaindrome: "+isPalindrome(num1));
        System.out.println("Number "+num2+" is Plaindrome: "+isPalindrome(num2));
        System.out.println("Number "+num3+" is Plaindrome: "+isPalindrome(num3));
        System.out.println("Number "+num4+" is Plaindrome: "+isPalindrome(num4));
    }
}