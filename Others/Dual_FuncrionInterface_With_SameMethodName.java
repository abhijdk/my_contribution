package may_21_2023;

@FunctionalInterface
interface A{
	void m1();
}
@FunctionalInterface
interface B{
	void m1();
}

public class Dual_FuncrionInterface_With_SameMethodName implements A,B {

	@Override
	public void m1() {
		System.out.println("Dual_FuncrionInterface_With_SameMethodName");
	}
	public static void main(String[] args) {
		new Dual_FuncrionInterface_With_SameMethodName().m1();
	}

}
