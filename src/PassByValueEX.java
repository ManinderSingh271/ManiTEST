class Person{
	String name;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
}
public class PassByValueEX {
	public static void main(String[] args) {
		Person obj1=new Person("mani",20);
		System.out.println("obj1-->"+obj1.name);

		Person obj2;
		obj2=obj1;
		
		System.out.println("obj2-->"+obj2.name);
		obj2.name="Ram";
		System.out.println("obj1-->"+obj1.name);
		System.out.println("obj2-->"+obj2.name);
		
		Person obj3=new Person("Sita",19);
		
		System.out.println("obj1-->"+obj1.name);
		System.out.println("obj2-->"+obj2.name);
		System.out.println("obj3-->"+obj3.name);
		
		obj1=obj3;
		System.out.println("obj1-->"+obj1.name);
		System.out.println("obj2-->"+obj2.name);
		System.out.println("obj3-->"+obj3.name);
		
		
	}
}
