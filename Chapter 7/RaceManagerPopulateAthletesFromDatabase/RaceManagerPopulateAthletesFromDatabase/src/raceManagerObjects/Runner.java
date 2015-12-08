package raceManagerObjects;

import java.io.Serializable;

/** A runner.
 *
 * @author sarvex
 * @version 1.0 */
public class Runner extends Athlete implements Serializable {
  private static final long serialVersionUID = -7952291901731021213L;
  private String _shoeBrand;

  /** Create a new runner. */
  public Runner() {
    // do nothing.
  }

  /** Create a new runner with properties set.
   *
   * @param name String name for the Runner
   * @param age int age for the Runner
   * @param racerId int racerId for the Runner */
  public Runner(String name, int age, int racerId, String brand) {
    super(name, age, racerId);
    _shoeBrand = brand;
  }

  public String getShoeBrand() {
    return _shoeBrand;
  }

  public void setShoeBrand(String value) {
    _shoeBrand = value;
  }

  /** The race Activity for the Runner.
   *
   * @return String representing the Runner's race activity. */
  @Override
  public String performRaceActivity() {
    if (getIsInjured()) {
      throw new AthleteInjuredException("The runner broke their foot.");
    }

    return "Running...";
  }

  @Override
  public String performRaceActivitySafe() {
    if (getIsInjured()) {
      return "Could not Run: currently injured";
    }
    return "Running...";
  }

  /** Get the state of the Runner as a String.
   *
   * @return String containing state of the Runner. */
  @Override
  public String toString() {
    return String.format("%s %s]\tActivity: %s\tIs Running with shoes: %s\n", super.toString(), getClass(),
        performRaceActivity(), getShoeBrand());
  }

  /** Get the data String for a Runner
   *
   * @return String to match: RUNNER|name=somestring;age=someint;...;shoes=somestring */
  @Override
  public String toDataString() {
    return String.format("RUNNER|%s;shoes=%s", super.toDataString(), getShoeBrand());
  }
}
