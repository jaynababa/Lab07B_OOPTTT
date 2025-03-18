import javax.swing.*;
import java.awt.*;

public class TTTGUI extends JFrame {

    TTTTileButton[] [] buttons;
    Game game;
    TTTBoard board;

    public TTTGUI(Game game, TTTBoard board) {
        this.game = game;
        this.board = board;

        setTitle("Tic Tac Toe");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        buttons = new TTTTileButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j] = new TTTTileButton(i, j, board, game);
                add(buttons[i][j]);
            }
        }

        setVisible(true);
    }

    public void updateBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i][j].setText("");
            }
        }
    }
}
