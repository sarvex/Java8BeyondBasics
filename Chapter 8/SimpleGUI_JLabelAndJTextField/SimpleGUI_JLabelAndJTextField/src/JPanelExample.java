import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelExample extends JPanel {

  private static final long serialVersionUID = -6237922307532299049L;

  public JPanelExample() {
    setBorder(BorderFactory.createLineBorder(Color.black, 10, true));

    JLabel label1 = new JLabel("Please enter your name:");

    /*
     * JTextField jtf1 = new JTextField("Edward"); jtf1.setColumns(25);
     */
    JTextFieldExample jtfe = new JTextFieldExample("Pamela", 30);
    add(label1);
    // add(jtf1);
    add(jtfe);
  }
}
