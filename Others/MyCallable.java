
interface Callable{
	void call();
}

public class MyCallable {
	public static void main(String[] args) {
		Callable c=()->System.out.println("Callable");
	}
}
