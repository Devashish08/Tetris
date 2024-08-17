package Main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    final int FPS = 60;
    Thread gameThread;



    public  GamePanel() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.BLACK);
        this.setLayout(null);
    }

    public void launchGame() {
        gameThread = new Thread(this);
        gameThread.start();
    }
//  in every game loop we have two main methods: update and render
    @Override
    public void run() {
       double drawInterval = System.nanoTime();
       double delta = 0;
       long lastTime = System.nanoTime();
       long currentTime;

       while(gameThread != null) {
           currentTime = System.nanoTime();
           delta += (currentTime - lastTime) / drawInterval;
           lastTime = currentTime;
              if(delta >= 1) {
                update();
                repaint();
                delta--;
              }
       }
    }

    public void update() {}
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
