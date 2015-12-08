package raceManagerObjects;

import java.io.Serializable;

/** A Swimmer.
 *
 * @author sarvex
 * @version 1.0 */
public class Swimmer extends Athlete implements Serializable {
  private static final long serialVersionUID = -7656263221113289276L;

  /** Create a new Swimmer. */
  public Swimmer() {
    // do nothing.
  }

  /** Create a new Swimmer with properties set.
   *
   * @param name String name for the Swimmer
   * @param age int age for the Swimmer
   * @param racerId int racerId for the Swimmer */
  public Swimmer(String name, int age, int racerId) {
    super(name, age, racerId);
  }

  /** The race Activity for the Swimmer.
   *
   * @return String representing the Swimmer's race activity. */
  @Override
  public String performRaceActivity() {
    if (getIsInjured()) {
      throw new AthleteInjuredException("The swimmer has swimmer's ear.");
    }
    return "Swimming...";
  }

  @Override
  public String performRaceActivitySafe() {
    if (getIsInjured()) {
      return "Could not Swim: currently injured";
    }
    return "Swimming...";
  }

  /** Get the state of the Swimmer as a String.
   *
   * @return String containing state of the Swimmer. */
  @Override
  public String toString() {
    return String.format("%s %s]\tActivity: %s\n", super.toString(), getClass(), performRaceActivity());
  }

  /** Get the data String for a Swimmer
   *
   * @return String to match: SWIMMER|name=somestring;age=someint;... */
  @Override
  public String toDataString() {
    return String.format("SWIMMER|%s", super.toDataString());
  }
}
