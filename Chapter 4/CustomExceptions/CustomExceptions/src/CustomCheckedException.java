
public class CustomCheckedException extends Exception {
  private static final long serialVersionUID = 7007177171355934801L;

  public CustomCheckedException() {
    super("A Custom Checked Exception has been encountered");
  }

  public CustomCheckedException(String msg) {
    super(msg);
  }
}
