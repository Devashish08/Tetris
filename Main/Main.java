package Main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

//        add GamePanel to the window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack(); // Resize the window to fit the panel

        window.setLocationRelativeTo(null);
        window.setVisible(true); // Show the window

    }
}
