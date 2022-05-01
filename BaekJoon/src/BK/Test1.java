package BK;

class P{
	public P() {
		System.out.println("A");
	}
	
	public P(int a) {
		System.out.println("B");
	}
	
}
class C extends P{
	public C() {
		System.out.println("C");
	}
	
	public C(int a) {
		super(a);
		System.out.println("D");
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		C c = new C(5);
		
		
		
	}

}
