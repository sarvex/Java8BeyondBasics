import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JPanelExample extends JPanel {

  private static final long serialVersionUID = -662912285089823531L;
  private JTextFieldExample jtfe;

  public JPanelExample() {
    setBorder(BorderFactory.createLineBorder(Color.black, 10, true));

    JLabel label1 = new JLabel("Please enter your name:");

    jtfe = new JTextFieldExample("Pamela", 30);
    add(label1);
    add(jtfe);

    JButton jb = new JButton("Press Me");
    jb.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        String name = JOptionPane.showInputDialog(null, "Please enter your name");
        jtfe.setText(name);
      }

    });

    add(jb);

    JButton jb2 = new JButton("Press Me Too!");
    jb2.setName("BUTTON_TWO");
    jb2.addActionListener(new ButtonPressAction());
    add(jb2);
  }

  public void setTextFieldName(String name) {
    if (jtfe == null)
      throw new IllegalStateException();
    if (name == null)
      throw new IllegalArgumentException();
    jtfe.setText(name);
  }
}
