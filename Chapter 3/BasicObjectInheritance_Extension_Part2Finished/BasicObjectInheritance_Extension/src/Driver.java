
public class Driver {
	public static void main(String[] args) 
	{
		Animal a = new Animal();
		System.out.println(a);
		Animal a2 = new Animal("Fido", "Dog");
		System.out.println(a2);
		Animal a3 = new Animal("Fluffy", "Cat");
		System.out.println(a3);
		
		Dog d = new Dog("Fido", "Dog", false);
		System.out.println(d);
		
		Cat c = new Cat("Fluffy", "Cat", true);
		System.out.println(c);
	}
}
