import java. util. Scanner;
class gci

{
	private int age;         //encapsulation
	String name;
	gci(int age,String name)   //polymorphism
	{
			this.age=age;
			this.name=name;
	}
	gci(int age)         //polymorphism
	{
			this.age=age;
			
	}
	void getter()
	{
		Scanner in = new Scanner(System. in);
		System.out.println("Enter your name:");
		name = in. nextLine();
		System.out.println("Enter your age:");
		age=in.nextInt();
	}
	void setter()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		
	}
	 
}	





class childgci extends gci         //inheritance
{
	private int cls;
	childgci(int age,String name,int cls)
	{
		super(age,name);
		this.cls=cls;
	}
	childgci(int age)
	{
		super(age);
		
	}
	void setter()
	{
		super.setter();
		System.out.println("Class: "+cls);
	}
	
	
	 public static void main(String args[])
	 {
		 childgci ob=new childgci(16,"hacker",11);
		 childgci ob2=new childgci(15);
		
		ob.setter();
		ob2.setter();
		
		
		
	 }
}