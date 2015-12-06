
public class Cat extends Animal {
  private boolean isDeclawed;

  public Cat () {
    super();
  }

  public Cat (String name, String breed, boolean isDeclawed) {
    super(name, breed);
    this.isDeclawed = isDeclawed;
  }

  @Override
  public String toString() {
    return String.format("%s\t%s\t%b\n", super.toString(), getClass().getName(), Boolean.valueOf(isDeclawed));
  }
}
