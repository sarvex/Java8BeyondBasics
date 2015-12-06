public class Animal {
  private String name;
  private String breed;

  /** Default Animal. */
  public Animal() {
    // do nothing
  }

  /** Complex Animal.
   *
   * @param name String representing animal name
   * @param breed String representing animal breed */
  public Animal(String name, String breed) {
    this.name = name;
    this.breed = breed;
  }

  /** Set the name of the animal.
   *
   * @param value String representing Animal name. */
  public void setName(String value) {
    name = value;
  }

  /** Get the name of the animal.
   *
   * @return String representing the name of the animal. */
  public String getName() {
    return name;
  }

  /** Set the breed of the animal.
   *
   * @param value String representing breed. */
  public void setBreed(String value) {
    breed = value;
  }

  /** Get the breed of the animal.
   *
   * @return String representing the breed. */
  public String getBreed() {
    return breed;
  }

  /** Get the state of the animal as a String.
   *
   * @return String representing Animal state. */
  @Override
  public String toString() {
    return String.format("[%s] Breed: %s\tName: %s\n", getClass().getName(), getBreed(), getName());
  }
}
