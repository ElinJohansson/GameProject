import com.googlecode.lanterna.input.Key;
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

    public void moveMonster(Terminal terminal, Player player) {// ej klar
        int playerX = player.getX();
        int playerY = player.getY();
        Random random = new Random();

        if (playerX == x) {
            if (playerY > y) {
                y = y + 1;
            } else {
                y = y - 1;
            }
        } else if (playerY == y) {
            if (playerX > x) {
                x = x + 1;
            } else {
                x = x - 1;
            }
        } else if (playerX > x && playerY > y) {
            if (random.nextInt(1) == 1) {
                x = x + 1;
            } else {
                y = y + 1;
            }
        } else if (playerX < x && playerY < y) {
            if (random.nextInt(1) == 1) {
                x = x - 1;
            } else {
                y = y - 1;
            }
        } else if (playerX > x && playerY < y) {
            if (random.nextInt(1) == 1) {
                x = x + 1;
            } else {
                y = y - 1;
            }
        } else if (playerX < x && playerY > y) {
            if (random.nextInt(1) == 1) {
                x = x - 1;
            } else {
                y = y + 1;
            }
        } else if (playerX < x && playerY == y) {
            x = x - 1;
        } else if (playerX > x && playerY == y) {
            x = x + 1;
        } else if (playerX == x && playerY < y) {
            y = y - 1;
        } else if (playerX == x && playerY > y) {
            y = y + 1;
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
//}
