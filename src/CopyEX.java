class Employee implements Cloneable{
	int id;
	String name;
	
	Employee(){
		
	}
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String GetData() {
		return id+"-"+name;
	}

	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		Employee e=new Employee(102,"Ram");
		//Employee e=new Employee();
		return e;
	}
}
public class CopyEX {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1=new Employee(101,"mani");
		//Employee e1=new Employee();
		e1.setId(501);
		e1.setName("John");
		Employee e2;
		e2=e1;
		Employee e3=(Employee)e1.clone();
//		/e3.setName("Shallow");
		
		System.out.println("e1--"+e1.GetData());
		System.out.println("e2--"+e2.GetData());
		System.out.println("e3--"+e3.GetData());
	}

}
