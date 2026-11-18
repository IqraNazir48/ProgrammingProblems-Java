class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles;
        int previous=numBottles;
        int empty=0;
        int remaining=0;

        while(previous>=numExchange){
            empty=previous/numExchange;
            remaining=previous%numExchange;
            count+=empty;
            previous=empty+remaining;
        }

        return count;
    }
    public static void main(String[] args){
        int numBottles1=9;
        int numExchange1=3;
        System.out.println(numWaterBottles(numBottles1,numExchange1));

        int numBottles2=15;
        int numExchange2=4;
        System.out.println(numWaterBottles(numBottles2,numExchange2));
    }
}