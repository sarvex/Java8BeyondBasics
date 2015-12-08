import javax.swing.JFrame;

public class JFrameExample extends JFrame {

  private static final long serialVersionUID = -862755184663277442L;

  public JFrameExample() {
    setLocation(250, 250);
    setSize(GUIProgram.width + 20, GUIProgram.height + 60);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("My JFrame Example");
    setBounds(0, 0, GUIProgram.width + 20, GUIProgram.height + 60);
    setVisible(true);
  }
}
