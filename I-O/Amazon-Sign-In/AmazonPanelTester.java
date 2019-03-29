
import javax.swing.*;

public class AmazonPanelTester {
 public static void main(String[] args) {
  JFrame frame = new JFrame("Amazon Sign-In");
  frame.getContentPane().add(new AmazonPanel());
  frame.setLocation(500, 400);
  frame.pack();
  frame.setVisible(true);
 }
}