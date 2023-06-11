package may_18_2023;

// Copy Constructor 
// Pass Object referance to a constructor
public class Copy_Constructor {
	int a;
	String s;
	public Copy_Constructor()
	{
		a=353;
		s="OMM";
		System.out.println(a+" -> "+s);
	}
	public Copy_Constructor(Copy_Constructor cc)
	{
		a=cc.a;
		s=cc.s;
		System.out.println(a+" --> "+s);
	}
	public static void main(String[] args) {
		Copy_Constructor cc=new Copy_Constructor();
							new Copy_Constructor(cc);
	}
}
