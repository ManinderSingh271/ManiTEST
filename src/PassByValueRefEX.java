//class User{
//	int data=50;
//	void change(int p) {
//		this.data=data+p;
//	}
//	
//	void changeRef(User u) {
//		u.data=u.data+100;
//	}
//}
public class PassByValueRefEX {
	
	int data=50;
	void change(int data) {
		data=data+100;
	}
	
	void changeRef(PassByValueRefEX u) {
		u.data=u.data+100;
	}
	
	public static void main(String[] args) {
		
		PassByValueRefEX obj=new PassByValueRefEX();
		System.out.println("Before change--"+obj.data);
		obj.change(500);
		System.out.println("Before change--"+obj.data);
		
		PassByValueRefEX objRef=new PassByValueRefEX();
		System.out.println("Before change By Rererence--"+objRef.data);
		obj.changeRef(objRef);
		System.out.println("Before change By Rererence--"+objRef.data);
	}
}
