//class Cust{
//	private int id;
//	private String name;
//	
//	
//}
public class Singleton {
	Singleton sig=null;
	
	Singleton getResource() {
		if(sig == null) {
			return new Singleton();
		}
	return sig;
	}
	
}
