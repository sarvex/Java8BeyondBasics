import java.awt.EventQueue;

public class GUIProgram {
  public static final int width = 640;
  public static final int height = 480;

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        try {
          JFrameExample jfe = new JFrameExample();

          // JPanel jp = new JPanel();
          // jp.setBorder(BorderFactory.createLineBorder(Color.blue, 8, false));

          // jfe.getContentPane().add(jp);

          JPanelExample jpe = new JPanelExample();
          jfe.getContentPane().add(jpe);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

}
