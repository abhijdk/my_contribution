

abstract class Ab{
	abstract void m1();
}
interface Bc{
	abstract void m1();
}
public class AbstractClass_Interface_With_SameAbstractMethodName extends Ab implements Bc {

	public static void main(String[] args) {
		new AbstractClass_Interface_With_SameAbstractMethodName().m1();
	}

	@Override
	public void m1() {
		System.out.println("AbstractClass_Interface_With_SameAbstractMethodName");
	}

}
