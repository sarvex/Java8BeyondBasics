import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class JPanelExample extends JPanel {

  private static final long serialVersionUID = -6237922307532299049L;

  public JPanelExample() {
    setBorder(BorderFactory.createLineBorder(Color.black, 10, true));
  }
}
