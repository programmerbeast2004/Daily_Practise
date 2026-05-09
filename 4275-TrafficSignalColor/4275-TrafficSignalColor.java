// Last updated: 5/9/2026, 11:22:05 AM
class Solution {
    public String trafficSignal(int timer) {
        if(timer==0)return "Green";
        else if(timer==30)return "Orange";
        else if(30<timer && timer<=90)return "Red";
        else return "Invalid";
    }
}