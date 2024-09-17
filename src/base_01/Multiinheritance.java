package base_01;

class A{
	int x=10;
	void display() {
		System.out.println(x);
	}
}

class B extends A{
	int x = 11;
	void display() {
		System.out.println(x);
		System.out.println(super.x);
	}
}

public class Multiinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.display();
	}

}
