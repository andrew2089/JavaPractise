package games.SnakeGame;

import javax.swing.*;

public class SnakeGame extends JFrame {

    public void Snake(){
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        SnakeGame mw = new SnakeGame();

    }
}
