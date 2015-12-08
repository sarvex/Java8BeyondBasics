import javax.swing.JTextField;

public class JTextFieldExample extends JTextField {

  private static final long serialVersionUID = 342622913106963506L;

  public JTextFieldExample(String text, int width) {
    super(text);
    setColumns(width);
  }
}
