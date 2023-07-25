class Solution {
    public boolean areNumbersAscending(String s) {
        int prev = Integer.MIN_VALUE; // previous value
        // loop through each substring that is separated by space 
        for (String cur : s.split(" ")) {
            try { // use try catch
                // convert string into int using parseInt
                int num = Integer.parseInt(cur);
                if (num <= prev) return false;
                prev = num; // update previous num
            } catch (Exception e){}
        }
        return true;
    }
}