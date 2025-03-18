public class TTTBoard {

    String [] [] grid;
    Game game;

    public TTTBoard(Game game) {
        this.game = game;
        grid = new String[3][3];
        resetBoard();
    }

    public boolean makeMove(int row, int col, String symbol) {
        if (grid[row][col] == null) {
            grid[row][col] = symbol;
            return true;
        }
        return false;
    }

    public boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (grid[i][0] != null && grid[i][0].equals(grid[i][1]) && grid[i][1].equals(grid[i][2])) return true;
            if (grid[0][i] != null && grid[0][i].equals(grid[1][i]) && grid[1][i].equals(grid[2][i])) return true;
        }
        if (grid[0][0] != null && grid[0][0].equals(grid[1][1]) && grid[1][1].equals(grid[2][2])) return true;
        if (grid[0][2] != null && grid[0][2].equals(grid[1][1]) && grid[1][1].equals(grid[2][0])) return true;
        return false;
    }

    public void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = null;
            }
        }
    }

    public String[][] getGrid() {
        return grid;
    }
}



