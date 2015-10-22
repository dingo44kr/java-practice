package abstractionExample;

public abstract class Abstraction {

	public Abstraction() {
	}
	
	public int plus(int a, int b){
		int s = a;
		int i = b;
		
		return s+i;
	}
	
	
	public abstract int a(int one, int two);

}
