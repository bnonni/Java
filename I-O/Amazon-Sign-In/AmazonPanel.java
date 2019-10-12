import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AmazonPanel extends JPanel {
 private JLabel labelAmazon;
 private JLabel labelSignIn;
 private JLabel labelEmail;
 private JLabel labelPassword;
 private JTextField fieldEmail;
 private JPasswordField fieldPassword;
 private JButton btnSignIn;
 private JButton btnCancel;
 private JButton btnForgetPassword;

 public AmazonPanel() {
  setLayout(new GridLayout(0, 1));

  labelAmazon = new JLabel("Amazon");
  labelAmazon.setFont(new Font("Arial", Font.BOLD, 54));

  labelSignIn = new JLabel("Sign In");
  labelSignIn.setFont(new Font("Arial", Font.BOLD, 30));

  labelEmail = new JLabel("Email");
  labelEmail.setFont(new Font("Arial", Font.BOLD, 30));

  labelPassword = new JLabel("Password");
  labelPassword.setFont(new Font("Arial", Font.BOLD, 30));

  JCheckBox chkSignIn = new JCheckBox("Keep me signed in.");
  chkSignIn.setFont(new Font("Arial", Font.BOLD, 25));

  fieldEmail = new JTextField(10);
  fieldPassword = new JPasswordField(10);

  btnSignIn = new JButton("Sign In");
  btnSignIn.addActionListener(new ButtonListener());
  btnSignIn.setBackground(Color.yellow);

  btnCancel = new JButton("Cancel");
  btnCancel.addActionListener(new ButtonListener());

  btnForgetPassword = new JButton("Forget Password");
  btnForgetPassword.addActionListener(new ButtonListener());

  add(labelAmazon);
  add(labelSignIn);
  add(labelEmail);
  add(fieldEmail);
  add(labelPassword);
  add(fieldPassword);
  add(btnSignIn);
  add(btnCancel);
  add(btnForgetPassword);
  add(chkSignIn);

  setPreferredSize(new Dimension(400, 400));
 }

 private class ButtonListener implements ActionListener {
  public void actionPerformed(ActionEvent event) {
   if (event.getSource() == btnSignIn) {
    String email = fieldEmail.getText();
    char[] password = fieldPassword.getPassword();

    if (email.indexOf('@') < 0) {
     JOptionPane.showMessageDialog(null, "Email Address Invalid! Please try again.");
    } else if (password.length <= 8) {
     JOptionPane.showMessageDialog(null, "Password isn't long enough. Please try again.");
    }
   } else if (event.getSource() == btnCancel) {
    fieldEmail.setText("");
    fieldPassword.setText("");
   } else if (event.getSource() == btnForgetPassword) {
    JOptionPane.showMessageDialog(null, "An email reset link has been sent to your email.");
   } else if (event.getSource() == btnSignIn) {
    JOptionPane.showMessageDialog(null, "Welcome to your account!");
   }
  }
 }
}
