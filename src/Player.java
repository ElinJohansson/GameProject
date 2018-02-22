import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;

import static com.googlecode.lanterna.input.Key.Kind.*;

public class Player {

    private int x;
    private int y;

    public char playerCharacter = '\u263a';

    //Konstruktorn
    public Player(Terminal terminal) {
        this.x = 10;
        this.y = 10;
        terminal.moveCursor(x, y);
        terminal.putCharacter(playerCharacter);

    }
    //Metod som flyttar spelaren
    public void movePlayer(Terminal terminal, Key.Kind key) {// ej klar

        switch (key) {
            case ArrowDown:
                y=y+1;
                //terminal.moveCursor(x,y-1);
                //terminal.putCharacter('\u263a');
                break;
            case ArrowUp:
                y=y-1;
                //terminal.moveCursor(x, y+1);
                //terminal.putCharacter('\u263a');
                break;
            case ArrowLeft:
                x=x-1;
                //terminal.moveCursor(x-1, y);
                //terminal.putCharacter('\u263a');
                break;
            case ArrowRight:
                x=x+1;
                //terminal.moveCursor(x+1, y);
                //terminal.putCharacter('\u263a');
                break;
        }
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
