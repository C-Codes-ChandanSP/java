package base_01;

class Animal{
	void eat() {
		System.out.println("");
	}
	void sleep() {
		System.out.println("");
	}
}

class Tiger extends Animal{
	void eat() {
		System.out.println("eats flesh");
	}
}

class Deer extends Animal{
	void eat() {
		System.out.println("eats veg");
	}
}

public class Polimorpism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ref = new Tiger();
		ref.eat();
		Animal ref1 = new Deer();
		ref1.eat();
	}

}
