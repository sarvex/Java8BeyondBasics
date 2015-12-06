
public class Dog extends Animal {
	private boolean _isServiceAnimal;
	
	public Dog() {
		//do nothing
	}

	public Dog(String name, String breed, boolean isServiceAnimal) 
	{
		super(name, breed);
		_isServiceAnimal = isServiceAnimal;
	}

	public String toString()
	{
		return String.format("%s\tIs a service animal: %b\n"
								, super.toString()
								, _isServiceAnimal
							);
	}
}
