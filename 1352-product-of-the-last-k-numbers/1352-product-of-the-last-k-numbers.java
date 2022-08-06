class ProductOfNumbers {
    List<Integer> storage;
    public ProductOfNumbers() {
        storage = new ArrayList<>();
        storage.add(1);
    }
    
    public void add(int num) {
        if(num == 0) { // reset the storage
            storage.clear();
            storage.add(1);
        } else {
            storage.add(num * storage.get(storage.size() - 1));
        }
    }
    
    public int getProduct(int k) {
        if (k >= storage.size()) {
            return 0;
        } else {
            return storage.get(storage.size() - 1)/ storage.get(storage.size() - k - 1);
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */