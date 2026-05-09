// Last updated: 5/9/2026, 11:30:21 AM
class MyHashSet {
    private BitSet bitset;

    public MyHashSet() {
        bitset = new BitSet(1_000_001);
    }

    public void add(int key) {
        bitset.set(key);
    }

    public void remove(int key) {
        bitset.clear(key);
    }

    public boolean contains(int key) {
        return bitset.get(key);
    }
}
