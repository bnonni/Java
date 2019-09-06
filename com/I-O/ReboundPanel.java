
/**
   purpose: Use Java swing to create GUI application
   components: frame, panel, button, textfield
*/
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class ReboundPanel extends JPanel {
   private final int WIDTH = 800, HEIGHT = 800;
   private final int DELAY = 10, IMAGE_SIZE = 20;
   private ImageIcon image;
   private Timer timer;
   private int x, y, moveX, moveY;
   private Random random = new Random();

   private double getNextSpeed() {
      return 2 * Math.PI * (0.5 + random.nextDouble());
   }

   public ReboundPanel() {
      timer = new Timer(DELAY, new ReboundListener());
      image = new ImageIcon("happy_face.png");

      // #1: move diagonally from top left to bottom right
      // x = 0;
      // y = 0;
      // moveX = 3;
      // moveY = 3;

      // #2: move vertically from top left to bottom left
      // x = 0;
      // y = 0;
      // moveX = 0;
      // moveY = 3;
      // #3: move horizontally from top left to top right

      // int random = (int) Math.ceil(Math.random() * 99);

      x = WIDTH / 2;
      y = WIDTH / 2;

      moveX = (int) getNextSpeed() * (x > 0 ? -1 : 1);
      moveY = (int) getNextSpeed() * (y > 0 ? -1 : 1);

      setPreferredSize(new Dimension(WIDTH, HEIGHT));
      timer.start();
   }

   public void paintComponent(Graphics page) {
      super.paintComponent(page);
      image.paintIcon(this, page, x, y);
   }

   private class ReboundListener implements ActionListener {
      public void actionPerformed(ActionEvent event) {
         // #1: move diagonally from top left to bottom right
         x += moveX;
         y += moveY;

         // #2: move vertically from top left to bottom left

         // y += moveY

         // #3: move horizontally from top left to top right

         // x += moveX;

         if (x <= 0 || x >= WIDTH - IMAGE_SIZE)
            moveX = moveX * -1;
         if (y <= 0 || y >= HEIGHT - IMAGE_SIZE)
            moveY = moveY * -1;
         // you must activate the repaint() to move the icon
         repaint();
      }
   }
}