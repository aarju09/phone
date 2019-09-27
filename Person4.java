import java.util.*;

class Person4
{
	String name;
	int age;
	Address home_address;
	Address office_address;
	Phone_number home;
	Phone_number office;
	Person4(String name,int age,Address home_address,Address office_address,Phone_number home,Phone_number office)
	{
		this.name = name;
		this.age = age ;
		this.home_address = home_address;
		this.office_address = office_address;
		this.home = home;
		this.office = office;

	}
	public void show()
	{
		System.out.println("name is"+name);
		System.out.println("age is"+age);
		System.out.println("home address is"+home_address);
		System.out.println("office address is"+office_address);
		System.out.println("Home phonr numbe is"+home);
		System.out.println("office phone is"+office); 
	}

	public static void main(String[] args)
	{
       Address a = new Address("Siddhivinaya carona",411014,"pune","maha");
       Address b = new Address("MESCOE",411012,"pune","maha");
       Phone_number p = new Phone_number("7758025527");
       Phone_number t = new Phone_number("8007041142");
       Person4 q = new Person4("Aarju",21,a,b,p,t);
       Person4 m = new Person4("Rubina",26,a,b,p,t);
       //Person4 s = new 
       ArrayList<Person4>al = new ArrayList<Person4>();
       al.add(q); q.show();
       al.add(m); m.show();

	}
}