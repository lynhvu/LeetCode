class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> res = new LinkedList<>(); // store result
        for (int[] interval : intervals) {
            // result is empty or no overlap
            if (res.isEmpty() || res.getLast()[1] < interval[0]) {
                res.add(interval); // add new interval to result list
            } else { // there's overlap
                res.getLast()[1] = Math.max(res.getLast()[1], interval[1]); 
            }
        }
        
        return res.toArray(new int[res.size()][]);
    }
}