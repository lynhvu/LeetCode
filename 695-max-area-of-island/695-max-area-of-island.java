class Solution {
    int maxArea;
    int numRow;
    int numCol;
    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        numRow = grid.length;
        numCol = grid[0].length;
        boolean[][] visited = new boolean[numRow][numCol];
        int[] curArea = new int[1];
        int maxArea = 0;
        for (int r = 0; r < numRow; r++) {
            for (int c = 0; c < numCol; c++) {
                if (grid[r][c] == 1 && visited[r][c] == false) {
                    curArea[0] = 0;
                    checkIsland(grid, r, c, visited, curArea);
                    maxArea = Math.max(maxArea, curArea[0]);
                }
            }
        }
        return maxArea;
    }
    
    private void checkIsland(int[][] grid, int r, int c, boolean[][] visited, int[] area) {
        if (r < 0 || c < 0 || r >= numRow || c >= numCol || grid[r][c] == 0 || visited[r][c] == true) {
            return;
        }
        visited[r][c] = true;
        area[0]++;
        checkIsland(grid, r - 1, c, visited, area);
        checkIsland(grid, r + 1, c, visited, area);
        checkIsland(grid, r, c - 1, visited, area);
        checkIsland(grid, r, c + 1, visited, area);     
        
    }
}