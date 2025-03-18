import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TTTTileButton extends JButton {

    int row, col;
    TTTBoard board;
    Game game;

    public TTTTileButton(int row, int col, TTTBoard board, Game game){
        this.row = row;
        this.col = col;
        this.board = board;
        this.game = game;
        setFont(getFont().deriveFont(24.0f));

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (getText().isEmpty()) {
                    String symbol = game.getCurrentPlayer().getSymbol();
                    if (board.makeMove(row, col, symbol)) {
                        setText(symbol);
                        if (game.checkWinner()) {
                            JOptionPane.showMessageDialog(null, "Player " + symbol + " wins!");
                            game.resetGame();
                        } else {
                            game.switchTurn();
                        }
                    }
                }
            }
        });
    }
}


