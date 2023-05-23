

//<T> type parameter :
//---------------------
//-> It is known as Type parameter.
//
//-> It is independent type which will accept all the Warpper     
//   classes and userdefined class
//
//Program :
//---------
class Test<T> {
	T obj;

	public void setObj(T obj) //setter
	{
		this.obj = obj;
	}

	public T getObj() //getter
	{
		return this.obj;
	}
}

public class T_Type_Parameter {
	public static void main(String [] args)
	{
       Test<Integer> ti = new Test<Integer>();
	   ti.setObj(353);
	   System.out.println(ti.getObj());

	   Test<String> ts = new Test<String>();
	   ts.setObj("OMM");
	   System.out.println(ts.getObj());
      
	}
}