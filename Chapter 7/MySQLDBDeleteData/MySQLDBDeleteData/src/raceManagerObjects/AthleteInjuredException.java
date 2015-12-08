package raceManagerObjects;

import java.io.Serializable;

public class AthleteInjuredException extends RuntimeException implements Serializable {
  private static final long serialVersionUID = 3854343739977182910L;

  public AthleteInjuredException() {
    super("The athlete was unable to complete the race due to injury.");
  }

  public AthleteInjuredException(String msg) {
    super(msg);
  }
}
