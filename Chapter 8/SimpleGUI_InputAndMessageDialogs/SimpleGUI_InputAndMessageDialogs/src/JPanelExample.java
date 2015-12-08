import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelExample extends JPanel {

  private static final long serialVersionUID = 529660384324264827L;
  private JTextFieldExample jtfe;

  public JPanelExample() {
    setBorder(BorderFactory.createLineBorder(Color.black, 10, true));

    JLabel label1 = new JLabel("Please enter your name:");

    jtfe = new JTextFieldExample("Pamela", 30);
    add(label1);
    add(jtfe);
  }

  public void setTextFieldName(String name) {
    if (jtfe == null)
      throw new IllegalStateException();
    if (name == null)
      throw new IllegalArgumentException();
    jtfe.setText(name);
  }
}
