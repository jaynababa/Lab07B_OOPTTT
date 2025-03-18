public class Game {

    Player playerX;
    Player playerO;
    Player currentPlayer;
    TTTBoard board;
    TTTGUI gui;

    public Game() {

        playerX = new Player("X");
        playerO = new Player("O");
        currentPlayer = playerX;
        board = new TTTBoard(this);
        gui = new TTTGUI(this, board);

    }
    public void switchTurn() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean checkWinner() {
        return board.checkWin();
    }

    public void resetGame() {
        board.resetBoard();
        gui.updateBoard();
        currentPlayer = playerX;
    }

    public static void main(String[] args) {
        new Game();  // Start the game
    }
}
