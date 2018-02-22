import com.googlecode.lanterna.terminal.Terminal;

import java.util.Random;

public class Monster {

    private int monsterX;
    private int monsterY;
    Random random = new Random();

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

        if (monsterX == playerX) {
            if (monsterY<playerY) {
                moveDown();
            } else {
                moveUp();
            }
        } else if (monsterY == playerY) {
            if (monsterX < playerX) {
                moveRight();
            } else if(monsterX > playerX){
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

//        else if (playerX < monsterX && playerY == monsterY) {
//            monsterX = monsterX - 1;
//        } else if (playerX > monsterX && playerY == monsterY) {
//            monsterX = monsterX + 1;
//        } else if (playerX == monsterX && playerY < monsterY) {
//            monsterY = monsterY - 1;
//        } else if (playerX == monsterX && playerY > monsterY) {
//            monsterY = monsterY + 1;
//        }
        System.out.println("Monster monsterX:"+ monsterX +" Monster monsterY: "+ monsterY);


    }

    public void moveRight(){
        monsterX = monsterX+1;
    }

    public void moveLeft(){
        monsterX = monsterX-1;
    }

    public void moveUp(){
        monsterY = monsterY-1;
    }

    public void moveDown(){
        monsterY=monsterY+1;
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
