package raceManagerSystem;

import java.awt.Color;

import javax.swing.JInternalFrame;

public class BaseInternalFrame extends JInternalFrame {

  private static final long serialVersionUID = 4924335991171374652L;

  public BaseInternalFrame() {
    SetupForm();
  }

  /** Common Setup features for all of our forms. */
  private void SetupForm() {
    setBackground(Color.WHITE);
    setClosable(true);
    setMaximizable(true);
    setResizable(true);

    // pack and show:
    pack();
    setVisible(true);
  }
}
