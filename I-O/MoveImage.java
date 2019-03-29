import javax.swing.*;

public class MoveImage {
 public static void main(String[] args) {
  JFrame frame = new JFrame("Move Images.");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  frame.add(new JLabel(new ImageIcon("/Users/husky/Desktop/bryanwnonni/public/img  ")));

  frame.pack();
  frame.setVisible(true);
 }
}