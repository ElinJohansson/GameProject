import com.googlecode.lanterna.terminal.Terminal;

import java.util.Random;

public class Monster {

    private int x;
    private int y;
    Random random = new Random();

    public char monsterCharacter = '\u03DE';

    public Monster(Terminal terminal) {
        x = random.nextInt(19);
        y = random.nextInt(19);
        terminal.moveCursor(x, y);
        terminal.putCharacter(monsterCharacter);

    }
    //public boolean samePosition(int x, int y) {

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
//}
