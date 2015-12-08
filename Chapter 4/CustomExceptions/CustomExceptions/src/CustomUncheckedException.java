
public class CustomUncheckedException extends RuntimeException {
  private static final long serialVersionUID = -93880852459468571L;

  public CustomUncheckedException() {
    super("A custom unchecked exception has been encountered!");
  }

  public CustomUncheckedException(String msg) {
    super(msg);
  }
}
