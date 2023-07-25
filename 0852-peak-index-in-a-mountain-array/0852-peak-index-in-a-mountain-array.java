class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            if (cur > max) {
                max = cur;
            } else {
                if (arr[i - 1] == max) index = i - 1;             
            }
        }
        return index;
    }
}