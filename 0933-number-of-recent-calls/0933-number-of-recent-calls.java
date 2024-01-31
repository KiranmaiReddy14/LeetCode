class RecentCounter {
    List<Integer> list = new ArrayList<>();

    public RecentCounter() {
    }

    public int ping(int t) {
        RecentCounter rc = new RecentCounter();
        int min = t - 3000;
        if (t >= min)
            list.add(t);
        list.removeIf(l -> l < min);
        return list.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */