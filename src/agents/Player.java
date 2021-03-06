package agents;

/**
 * Created by M on 15-09-08.
 */

import resources.Constants;

import javax.swing.*;
import java.awt.event.KeyEvent;


public class Player extends Sprite implements Constants {

    private final int START_Y = 280;
    private final int START_X = 270;
    private String player = "blue.jpg";
    private int width;
    private int height;

    public Player() {

        ImageIcon ii = new ImageIcon(this.getClass().getResource(player));

        width = ii.getImage().getWidth(null);
        height = ii.getImage().getWidth(null);

        setImage(ii.getImage());
        setX(START_X);
        setY(START_Y);
    }

    public void act() {

        x += dx;
        this.setX(this.x);

        y += dy;
        this.setY(this.y);

        if (y <= 2)
            y = 2;
        if (y >= BOARD_HEIGHT - 2*height)
            y = BOARD_HEIGHT - 2*height;

        if (x <= 2)
            x = 2;
        if (x >= BOARD_WIDTH - 2*width)
            x = BOARD_WIDTH - 2*width;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP) {
            dy = -4;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 4;
        }

        if (key == KeyEvent.VK_LEFT) {
            dx = -4;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 4;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }
}
