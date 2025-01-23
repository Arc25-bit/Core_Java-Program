package thisPrograms;
class ThisMethodExample
{
	String name="Archana Sargam";
	int roll_no=77141;
	void display(ThisMethodExample tme)
	{
		System.out.println("Roll No: "+roll_no+"\nName: "+name);
	}
	void show()
	{
		display(this);
		System.out.println("display method called");
	}
}
public class ThisMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisMethodExample tme=new ThisMethodExample();
		tme.show();

	}

}
