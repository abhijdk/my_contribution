package mar_17_2023;

public class Exception_Handling {
	public static void main(String[] args) {
		try {
			double a1=12.3;
			double a2=0;
			double a3=a1/a2;
			System.out.println(a3);
				try {
					int i1=12;
					int i2=0;
					int i3=i1/i2;
					System.out.println(i3);
				} catch (Exception e) {
					System.err.println(e);
				}
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
