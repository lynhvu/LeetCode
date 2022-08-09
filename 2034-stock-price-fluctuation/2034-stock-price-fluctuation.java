class StockPrice {
    HashMap<Integer, Integer> record; // timestamp, price
    TreeMap<Integer, Integer> track; // price, frequency
    int latestTime;
    public StockPrice() {
        record = new HashMap<>();
        track = new TreeMap<>();
        latestTime = 0;
    }
    
    public void update(int timestamp, int price) {
        // keep track of the latest time and using as a key
        // in hashmap to retrive the price 
        latestTime = Math.max(latestTime, timestamp);
        // check if the timestamp exists already or not
        if (record.containsKey(timestamp)) {
            // get old price
            int oldPrice = record.get(timestamp);
            // use this track to track the max and min price. when an update happens, we replace the posible max/min price, but we don't want to remove it if there's another timestamp has this price --> keep track of the frequency to make sure it still exists
            if (track.get(oldPrice) == 1) { // if there's only one left
                track.remove(oldPrice); // remove it out of track
            } else {
                // there's more than 1, and it's probly from different timestamp
                track.put(oldPrice, track.getOrDefault(oldPrice, 0) - 1);
            }
        }
        // update the map
        record.put(timestamp, price);
        track.put(price, track.getOrDefault(price, 0) + 1);
    }
    
    public int current() {
        return record.get(latestTime);
    }
    
    public int maximum() {
        return track.lastKey();
    }
    
    public int minimum() {
        return track.firstKey();
    }
}

/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */