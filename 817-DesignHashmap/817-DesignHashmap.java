// Last updated: 5/9/2026, 11:30:20 AM
class MyHashMap {
    int[] ans;
    public MyHashMap() {
        ans=new int[1000001];
        Arrays.fill(ans,-1);
    }
    
    public void put(int key, int value) {
        ans[key]=value;
    }
    
    public int get(int key) {
        return ans[key];
    }
    
    public void remove(int key) {
        ans[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */