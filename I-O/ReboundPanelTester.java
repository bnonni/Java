
/**
* @author bryan
* @version 1
* Learn recursion, searching, sorting, and GUI
*/
import javax.swing.*;

public class ReboundPanelTester {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Animation");
    frame.getContentPane().add(new ReboundPanel());
    frame.pack();
    frame.setVisible(true);
  }
}