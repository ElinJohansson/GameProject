import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;

import static com.googlecode.lanterna.input.Key.Kind.*;

public class Player {

    Position position;
    char playerCharacter = '\u263a';

    public static void movePlayer(Terminal terminal, Key.Kind key) {// ej klar

        switch (key) {
            case ArrowDown:
                terminal.moveCursor(0, -1);
                terminal.putCharacter('X');
                break;
            case ArrowUp:
                terminal.moveCursor(0, 1);
                terminal.putCharacter('X');
                break;
            case ArrowLeft:
                terminal.moveCursor(-1, 0);
                terminal.putCharacter('X');
                break;
            case ArrowRight:
                terminal.moveCursor(0, -1);
                terminal.putCharacter('X');
                break;
        }

    }

    public Player(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
