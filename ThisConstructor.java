package thisPrograms;
class ThisConstructorExample
{
	ThisConstructor tc;
	ThisConstructorExample(ThisConstructor tc)
	{
		this.tc=tc;
	}
	void display() {
	System.out.println("Name: "+tc.name);
	}
}
public class ThisConstructor {
	String name="Archana Sargam";
	ThisConstructor()
	{
		ThisConstructorExample tce=new ThisConstructorExample(this);
		tce.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstructor tc=new ThisConstructor();

	}

}
