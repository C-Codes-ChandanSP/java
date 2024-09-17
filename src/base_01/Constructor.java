package base_01;

class Program1{
	int x,y;
	public Program1() {
		x=10;
		y=20;
	}
	public Program1(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

class Program2 extends Program1{
	int p,q;
	public Program2() {
		p=11;
		q=22;
	}
	public Program2(int p,int q) {
		super();
		this.p=p;
		this.q=q;
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(p);
		System.out.println(q);
	}
}

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 p2 = new Program2(78,90);
		p2.display();
	}

}
