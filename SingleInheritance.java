/*Create a parent class called "Person" with attributes such as name, age, and a method called "speak".
 *  Create a child class called "Student" that inherits from Person and has an additional attribute called "grade" and a method called "study".
 *  Create an object of the Student class and call both the "speak" and "study" methods.*/
package inheritance;
class Person
{
	String name="Archana Sargam";
	int age=20;
	void speak()
	{
		System.out.println("Person is speaking");
	}
}
class Student extends Person 
{
	char grade='A';
	void study()
	{
		System.out.println("Name: "+name+"\nAge: "+age+"\nGrade: "+grade);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.speak();		
		s.study();

	}

}

/*Output:
 * Person is speaking
Name: Archana Sargam
Age: 20
Grade: A
*/
