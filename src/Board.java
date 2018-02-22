import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.terminal.Terminal;

public class Board {

    Monster[] monsters;
    //Player player;
    int[][] board;

    public Board(Terminal terminal) {
        this.board = new int[20][20];
        drawBoard(terminal, board);
        //this.player = new Player(terminal);
    }

    //public void clearScreen(Terminal terminal){
     //   terminal.clearScreen();
    //}
    public void updateScreen(Terminal terminal, Player player, Monster monster){
        terminal.clearScreen();
        terminal.moveCursor(player.getX(), player.getY());
        terminal.putCharacter('\u263a');

        terminal.moveCursor(monster.getX(), monster.getY());
        terminal.putCharacter('\u03DE');
    }


//    public void fillBoard(int[][] board) {
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                board[i][j] = 'X';
//            }
//        }
//    }

    public void drawBoard(Terminal terminal, int[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                terminal.moveCursor(j, i);

            }
        }

    }


}
