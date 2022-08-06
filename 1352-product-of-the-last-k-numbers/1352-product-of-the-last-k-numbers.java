class ProductOfNumbers {
    List<Integer> storage;
    int lastProduct;
    public ProductOfNumbers() {
        storage = new ArrayList<>();
        storage.add(1);
        lastProduct = 1;
    }
    
    public void add(int num) {
        if(num == 0) { // reset the storage
            storage = new ArrayList<>();
            storage.add(1);
            lastProduct = 1;
        } else {
            lastProduct *= num;
            storage.add(lastProduct);
        }
    }
    
    public int getProduct(int k) {
        if (k >= storage.size()) {
            return 0;
        } else {
            return lastProduct/ storage.get(storage.size() - k - 1);
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */