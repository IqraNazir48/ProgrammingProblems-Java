class StoneRemovalGame{
    public static boolean canAliceWin(int n) {
        int turn=0;
        int count=10;
        while(true){
            if(n-count<0){
                break;
            }
            n=n-count;
            count-=1;
            if(turn==1){
                turn=0;
            }
            else{
                turn=1;
            }

        }

        if(turn==1){
            return true;
        }
        return false;

    }
    public static void main(String[] args){
        int n1 = 12;
        int n2= 1;
        
        System.out.println("Can Alic win? for n="+n1+" : "+canAliceWin(n1));
        System.out.println("Can Alic win? for n="+n2+" : "+canAliceWin(n2));

    }
}