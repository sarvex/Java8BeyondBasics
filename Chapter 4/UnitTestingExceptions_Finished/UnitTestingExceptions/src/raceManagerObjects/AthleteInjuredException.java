package raceManagerObjects;

public class AthleteInjuredException extends RuntimeException {
  private static final long serialVersionUID = 2270846790864831307L;

  public AthleteInjuredException() {
    super("The athlete was unable to complete the race due to injury.");
  }

  public AthleteInjuredException(String msg) {
    super(msg);
  }
}
