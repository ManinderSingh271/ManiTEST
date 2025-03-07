
class Priv{
	private int id;
	private void privMethod() {
		System.out.println("Private method"+id);
	}
}
public class AccessChk {

	private int rollno;
	private AccessChk() {
		// TODO Auto-generated constructor stub
	}
	private void privMethod1() {
		System.out.println("Private method1-->"+rollno);
	}
	public static void main(String[] args) {
		AccessChk obj=new AccessChk();
		obj.rollno=10;
		obj.privMethod1();
		AccessChk obj2=new AccessChk();
		obj2.rollno=1200;
		obj2.privMethod1();
		
		System.out.println(AccessChk.proveIt());
	}
	
	public static int proveIt() {
		try {
			System.out.println("in try start");
			//System.exit(0);
			throw new NoSuchFieldException();
			//return 1;
		}
		catch(Exception e) {
			e.printStackTrace();
			return 2;
		}
		finally {
			System.out.println("Finally block execution");
			return 100;
		}
	}
}
