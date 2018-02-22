import com.googlecode.lanterna.terminal.Terminal;

public class Board {

    Monster[] monsters;

    int[][] board;

    public Board(Terminal terminal) {
        this.board = new int[20][20];
        drawBoard(terminal);

    }


    public void updateScreen(Terminal terminal, Player player, Monster[] monsters){
        terminal.clearScreen();
        drawBoard(terminal);
        terminal.moveCursor(player.getX(), player.getY());
        terminal.putCharacter('\u263a');
        for (int i=0; i<monsters.length; i++){

            terminal.moveCursor(monsters[i].getMonsterX(), monsters[i].getMonsterY());
            terminal.putCharacter('\u00A4');
        }
    }



    public void drawBoard(Terminal terminal) {


        for(int i = 0; i < 21; i++) {
            terminal.moveCursor(i,0);
            terminal.putCharacter('*');

            }

        for (int k = 1; k < 20; k++) {
            terminal.moveCursor(0,k);
            terminal.putCharacter('*');
            terminal.moveCursor(20, k);
            terminal.putCharacter('*');

            }

        for(int i = 0; i < 21; i++) {
            terminal.moveCursor(i,20);
            terminal.putCharacter('*');
        }


    }





    }



