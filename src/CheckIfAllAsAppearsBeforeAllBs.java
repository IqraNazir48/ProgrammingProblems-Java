public class CheckIfAllAsAppearsBeforeAllBs{
    public static boolean checkString(String s) {
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)=='b' && s.charAt(j)=='a'){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s1= "aaabbb";
        String s2="abab";
        String s3="bbb";

        System.out.println(checkString(s1));
        System.out.println(checkString(s2));
        System.out.println(checkString(s3));
    }
}