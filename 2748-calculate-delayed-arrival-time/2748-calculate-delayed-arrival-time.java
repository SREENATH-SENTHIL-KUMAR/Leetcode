class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int a=arrivalTime,b=delayedTime;
        if((a+b)>=24){
            return (a+b)-24;
            }
            return a+b;
       
    }
}