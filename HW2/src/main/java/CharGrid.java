// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int max_x = -1;
        int max_y = -1;
        int min_x = 10000;
        int min_y = 10000;
        boolean found = true;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == ch) {
                    found = true;
                    max_x = Math.max(max_x, i);
                    max_y = Math.max(max_y, j);
                    min_x = Math.min(min_x, i);
                    min_y = Math.min(min_y, j);
                }
            }
        }

        if (found) {
            return Math.abs(max_x - min_x) * Math.abs(max_y - min_y);
        }
        return 0;
	}
	
	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
        int cnt_plus = 0;
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {
                int cnt_down = 1;
                int cnt_up = 1;
                int cnt_left = 1;
                int cnt_right = 1;
                for (int k = i + 1; k < grid.length; k++) {
                    if  (grid[k][j] == grid[k - 1][j]) {
                        cnt_down++;
                    }
                }
                for (int k = i - 1; k >= 0; k--) {
                    if (grid[k][j] == grid[k + 1][j]) {
                        cnt_up++;
                    }
                }
                for (int k = j + 1; k < grid[0].length; k++) {
                    if (grid[i][k] == grid[i][k - 1]) {
                        cnt_right++;
                    }
                }
                for (int k = j - 1; k >= 0; k--) {
                    if (grid[i][k] == grid[i][k + 1]) {
                        cnt_left++;
                    }
                }
                if (cnt_down == cnt_left && cnt_up == cnt_right && cnt_left == cnt_right) {
                    cnt_plus++;
                }
            }
        }
		return cnt_plus; // YOUR CODE HERE
	}
	
}
