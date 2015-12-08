import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ButtonPressAction implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent arg0) {
    JButton jb = (JButton) arg0.getSource();

    JOptionPane.showMessageDialog(null, "Button: " + jb.getName() + " pressed!");
  }

}
