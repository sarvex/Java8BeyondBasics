/** A Swimmer.
 *
 * @author sarvex
 * @version 1.0 */
public class Swimmer implements RaceParticipant, Person {
  private String _name;
  private int _age;
  private int _racerId;

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
    _name = name;
    _age = age;
    _racerId = racerId;
  }

  /** Get the name of the Swimmer.
   *
   * @return String representing Swimmer's name */
  @Override
  public String getName() {
    return _name;
  }

  /** Set the name of the Swimmer.
   *
   * @param value String to set as Swimmer's name */
  @Override
  public void setName(String value) {
    _name = value;
  }

  /** Get the age of the Swimmer.
   *
   * @return int representing Swimmer's age */
  @Override
  public int getAge() {
    return _age;
  }

  /** Set the age of the Swimmer.
   *
   * @param value int to set as Swimmer's age. */
  @Override
  public void setAge(int value) {
    _age = value;
  }

  /** Get the RacerID of the Swimmer.
   *
   * @return int representing Swimmer's racerId */
  @Override
  public int getRacerId() {
    return _racerId;
  }

  /** Set the racer id for the Swimmer.
   *
   * @param int to set as Swimmer's RacerId */
  @Override
  public void setRacerId(int value) {
    _racerId = value;
  }

  /** The race Activity for the Swimmer.
   *
   * @return String representing the Swimmer's race activity. */
  @Override
  public String performRaceActivity() {
    return "Swimming...";
  }

  /** Get the state of the Swimmer as a String.
   *
   * @return String containing state of the Swimmer. */
  @Override
  public String toString() {
    return String.format("%s]\tName: %s\tAge: %d\tRacerID: %d\tActivity: %s\n", getClass(), getName(), getAge(),
        getRacerId(), performRaceActivity());
  }
}
