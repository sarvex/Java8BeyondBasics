
public class Cat extends Animal
{
	private boolean _isDeclawed;
	
	public Cat()
	{
		super();
	}
	
	public Cat(String name, String breed, boolean isDeclawed)
	{
		super(name, breed);
		_isDeclawed = isDeclawed;
	}
	
	public String toString()
	{
		return String.format("%s\tIs declawed: %b\n"
								, super.toString()
								, _isDeclawed
							);
	}
}
