import com.googlecode.lanterna.*;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;

import java.nio.charset.Charset;

public class Main {
    public static void main(String[] arg) throws InterruptedException {

        Terminal terminal = TerminalFacade.createTerminal(System.in,
                System.out, Charset.forName("UTF8"));

        terminal.enterPrivateMode();
        terminal.setCursorVisible(false);

        Board board = new Board(terminal);
       Player player = new Player(terminal);
       Monster[]monsters = new Monster[4];
       for (int i=0; i<monsters.length; i++){
           monsters[i]=new Monster(terminal);
       }

        boolean gameIsRunning = true;

        while (gameIsRunning) {



            player.movePlayer(terminal);
            for (int i=0; i<monsters.length; i++) {
                monsters[i].moveMonster(terminal, player);
            }
            gameIsRunning = checkPlayerAlive(monsters, player);

            board.updateScreen(terminal, player, monsters);


        }


    }

    public static boolean checkPlayerAlive(Monster[] monsters, Player player){
        for (int i=0; i<monsters.length; i++){
        if(monsters[i].getMonsterX() == player.getX() && monsters[i].getMonsterY() == player.getY()){
            return false;
        }
        }
        return true;
    }
}
