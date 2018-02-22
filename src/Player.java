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
    public void movePlayer(Terminal terminal) throws InterruptedException {
        Key key;
        do {
            Thread.sleep(5);
            key = terminal.readInput();
        }
        while (key == null);


        // Key.Kind keyPressed = key.getKind();// ej klar

        switch (key.getKind()) {
            case ArrowDown:
                y = ((y<19)? y+1 : 19);
                System.out.println("Player x: " + x + " Player y: " + y);
                break;
            case ArrowUp:
                y = ((y>1) ? y - 1 : 1);
                System.out.println("Player x: " + x + " Player y: " + y);
                break;
            case ArrowLeft:
                x = (x>1) ? x - 1 : 1;
                System.out.println("Player x: " + x + " Player y: " + y);
                break;
            case ArrowRight:
                x = (x<19) ? x + 1 : 19;
                System.out.println("Player x: " + x + " Player y: " + y);
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
