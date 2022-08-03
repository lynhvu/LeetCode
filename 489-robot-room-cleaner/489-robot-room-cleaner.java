/**
 * // This is the robot's control interface.
 * // You should not implement it, or speculate about its implementation
 * interface Robot {
 *     // Returns true if the cell in front is open and robot moves into the cell.
 *     // Returns false if the cell in front is blocked and robot stays in the current cell.
 *     public boolean move();
 *
 *     // Robot will stay in the same cell after calling turnLeft/turnRight.
 *     // Each turn will be 90 degrees.
 *     public void turnLeft();
 *     public void turnRight();
 *
 *     // Clean the current cell.
 *     public void clean();
 * }
 */

class Solution {
    // up, right, down, left
    int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}}; 
    
    public void cleanRoom(Robot robot) {
        clean(robot, 0, 0, 0, new HashSet<String>());
    }
    
    private void clean(Robot robot, int col, int row, int curDirection, Set<String> cleaned) {
        // get in a new room, so clean it
        robot.clean();
        cleaned.add(col + " " + row);
        
        // check all the directions
        for (int dirIndex = curDirection; dirIndex < curDirection + 4; dirIndex++) {
            int rowIndex = directions[dirIndex % 4][0] + row;
            int colIndex = directions[dirIndex % 4][1] + col;
            if (!cleaned.contains(colIndex + " " + rowIndex) && robot.move()) {
                clean(robot, colIndex, rowIndex, dirIndex % 4, cleaned);
            }
            robot.turnRight();
        }
        // backtracking, move back and still keep the direction
        robot.turnRight();
        robot.turnRight();
        robot.move();
        robot.turnRight();
        robot.turnRight();
    }
}