class Address implements Cloneable{
	String city;
	public Address(String city) {
		this.city=city;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

class User implements Cloneable{
	String name;
	int age;
	Address address;
	public User(String name,int age,Address address) {
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public String toString() {
		return "{name:"+name+" age:"+age+" address:"+address.city+"}";
	}
//	//Shallow Copy Method
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
	//Deep Copy method
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		User user=(User)super.clone();
		user.address=(Address)address.clone();
		return user;
	}
}
public class CopyShallowDeepFINAL {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address=new Address("Mohali");
		
		User original=new User("mani",20,address); 
		System.out.println("original>>>> "+original);
		
		// Copy
		User cloned=(User)original.clone();
		System.out.println("cloned>>>> "+cloned);
		cloned.address.city="Chandigarh";
		
		System.out.println("After modification:");
		System.out.println("original>>>> "+original);
		System.out.println("cloned>>>> "+cloned);
		
		
	}
}
