class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];
        // loop through each row and collumn
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                // check if it's a valid island and we haven't check this
                // one yet
                if (grid[r][c] == '1' && visited[r][c] == false) {
                    checkIslands(grid, r, c, visited);
                    count++;         
                }
            }
        }
        return count;
    }
    
    void checkIslands(char[][] grid, int r, int c, boolean[][] visited) {
        int row = grid.length;
        int col = grid[0].length;
        if (r < 0 || c < 0 || r >= row || c >= col || grid[r][c] == '0'
           || visited[r][c] == true) {
            return;
        }
        visited[r][c] = true;
        checkIslands(grid, r, c - 1, visited);
        checkIslands(grid, r, c + 1, visited);
        checkIslands(grid, r - 1, c, visited);
        checkIslands(grid, r + 1, c, visited);
    }
}