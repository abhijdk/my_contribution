/*	======================Question==============================
 	* Create an abstract class School with abstract methods play() and eat().

	* Create another class Students that extends School. 
	* In this class, implement only the play() method.
	
	* Create another class Play_With_Abstract with a main method. 
	* This class extends from Students and implements only the eat() method.
 */
abstract class School{
	 abstract void play();
	 abstract void eat();	 
}
abstract class Students extends School{
	@Override
	public void play() {
		System.out.println("Student's are Playing Kabadi");
	}
}
public class Play_With_Abstract extends Students {
	
	@Override
	void eat() {
		System.out.println("Student's are Eating Tiffine");	
	}
	
	public static void main(String[] args) {
		Students s=new Play_With_Abstract();
		s.play();
		s.eat();
	}
}

/*			======Description========
 * The School class is defined as an abstract class.
 * It declares two abstract methods: play() and eat().
 * The Students class extends the School class and provides 
 * an implementation for the play() method, which prints 
 * "Student's are Playing Kabadi".
 * The Play_With_Abstract class extends the Students class.
 * It overrides the eat() method and provides an implementation
 * that prints "Student's are Eating Tiffine".
 * In the main() method of the Play_With_Abstract class, 
 * a Students object s is created and assigned an instance 
 * of the Play_With_Abstract class.
 * The play() and eat() methods are called on the s object, 
 * which invokes the corresponding methods overridden in the
 *  Students and Play_With_Abstract classes, respectively.	
 */