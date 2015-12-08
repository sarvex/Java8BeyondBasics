/** A Swimmer is an athlete that swims.
 *
 * @author sarvex */
public class Swimmer {
  private int raceID;

  /** Default Constructor. */
  public Swimmer() {
    // do nothing.
  }

  /** Explicit Constructor.
   *
   * @param racerID int representing ID of the swimmer */
  public Swimmer(int racerID) {
    raceID = racerID;
  }

  /** add the mutators/accessors for swimmer **/
  /** Get the raceID for this swimmer.
   *
   * @return int representing raceID */
  public int getRaceID() {
    return raceID;
  }

  /** Set the raceID for this swimmer.
   *
   * @param value the int representing this swimmer's race ID */
  public void setRaceID(int value) {
    raceID = value;
  }

  /** Make the swimmer perform.
   *
   * @return the action of this athlete */
  public String performSport() {
    return "Swimming";
  }

  /** Get the swimmer toString() details.
   *
   * @return String representing state of the swimmer. */
  @Override
  public String toString() {
    return String.format("%d is %s\n", Integer.valueOf(getRaceID()), performSport());
  }
}
