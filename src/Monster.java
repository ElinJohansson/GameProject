import com.googlecode.lanterna.terminal.Terminal;

import java.util.Random;

public class Monster {

    private int monsterX;
    private int monsterY;
    Random random = new Random();
    public static String message = "Game Over";

    public char monsterCharacter = '\u03DE';

    public Monster(Terminal terminal) {
        monsterX = random.nextInt(19);
        monsterY = random.nextInt(19);
        terminal.moveCursor(monsterX, monsterY);
        terminal.putCharacter(monsterCharacter);
    }

    public void moveMonster(Terminal terminal, Player player) {// ej klar
        int playerX = player.getX();
        int playerY = player.getY();
        Random random = new Random();

        if (monsterX == playerX && monsterY == playerY) {
            printText(10, 10, message, terminal);
        } else if (monsterX == playerX) {
            if (monsterY < playerY) {
                moveDown();
            } else {
                moveUp();
            }
        } else if (monsterY == playerY) {
            if (monsterX < playerX) {
                moveRight();
            } else if (monsterX > playerX) {
                moveLeft();
            }
        } else if (playerX > monsterX && playerY > monsterY) {
            if (random.nextInt(1) == 1) {
                moveRight();
            } else {
                moveDown();
            }
        } else if (playerX < monsterX && playerY < monsterY) {
            if (random.nextInt(1) == 1) {
                moveUp();
            } else {
                moveLeft();
            }
        } else if (playerX > monsterX && playerY < monsterY) {
            if (random.nextInt(1) == 1) {
                moveUp();
            } else {
                moveRight();
            }
        } else if (playerX < monsterX && playerY > monsterY) {
            if (random.nextInt(1) == 1) {
                moveDown();
            } else {
                moveLeft();
            }
        }

        System.out.println("Monster monsterX:" + monsterX + " Monster monsterY: " + monsterY);
    }


    public static void printText(int a, int b, String message, Terminal terminal) {
        for (int i = 0; i < message.length(); i++) {
            terminal.moveCursor(a, b);
            terminal.putCharacter(message.charAt(i));
            a = a + 1;
        }
    }

    public void moveRight() {
        monsterX = monsterX + 1;
    }

    public void moveLeft() {
        monsterX = monsterX - 1;
    }

    public void moveUp() {
        monsterY = monsterY - 1;
    }

    public void moveDown() {
        monsterY = monsterY + 1;
    }

    public int getMonsterX() {
        return monsterX;
    }

    public void setMonsterX(int monsterX) {
        this.monsterX = monsterX;
    }

    public int getMonsterY() {
        return monsterY;
    }

    public void setMonsterY(int monsterY) {
        this.monsterY = monsterY;
    }
}
//}
