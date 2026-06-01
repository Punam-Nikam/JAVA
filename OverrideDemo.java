class Animal {
	void sound() {
		System.out.println("Animal makes sound");
		}
}
class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}
public class OverrideDemo {
	public static void main(String[] a) {
		Animal obj=new Dog();
		obj.sound();
	}
}