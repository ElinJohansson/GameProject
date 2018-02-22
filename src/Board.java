import com.googlecode.lanterna.terminal.Terminal;

public class Board {

    Monster[] monsters;

    int[][] board;

    public Board(Terminal terminal) {
        this.board = new int[20][20];
        drawBoard(terminal, board);

    }


    public void updateScreen(Terminal terminal, Player player, Monster[] monsters){
        terminal.clearScreen();
        terminal.moveCursor(player.getX(), player.getY());
        terminal.putCharacter('\u263a');
        for (int i=0; i<monsters.length; i++){

            terminal.moveCursor(monsters[i].getMonsterX(), monsters[i].getMonsterY());
            terminal.putCharacter('\u03DE');
        }
    }



    public void drawBoard(Terminal terminal, int[][] board) {


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                terminal.moveCursor(j, i);

            }
        }

    }


}
