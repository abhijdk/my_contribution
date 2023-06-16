package may_23_2023;

//<T> type parameter :
//---------------------
//-> It is known as Type parameter.
//
//-> It is independent type which will accept all the Warpper     
//   classes and userdefined class
//
//Program :
//---------
class Test<T>{
	T obj;
	public void setObj(T obj) {
		this.obj=obj;
	}
	public T getObj() {
		return this.obj;
	}
}

public class T_Type_Parameter {
	public static void main(String[] args) {
		Test <Integer> t=new Test<Integer> ();
		t.setObj(353);
		System.out.println(t.getObj());
		
		Test<String> s=new Test();
		s.setObj("OMM");
		System.out.println(s.getObj());
	}
}