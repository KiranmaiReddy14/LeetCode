class SmallestInfiniteSet {
    PriorityQueue<Integer> pq;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        for (int i = 1; i < 1001; i++)
            pq.add(i);
    }

    public int popSmallest() {
        if (!pq.isEmpty()) {
            int num = pq.poll();
            return num;
        }
        return -1;
    }

    public void addBack(int num) {
        if (!pq.contains(num))
            pq.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */