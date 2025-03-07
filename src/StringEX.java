import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringEX {
	private int id;

	public StringEX() {
		//this.id=100;
		//this(500);  // used to call any constructor in same class
		//result();   //constructor can	 call a method
	}
	public  StringEX(int id) {
		this.id=id;
	}
	public String toString() {
		return "Id :"+id;
	}
	public void result() {
		System.out.println("------------Method called---------");
	}
	public static void main(String[] args) {
		// 
		//System.out.println("args value "+args.toString());
//		int a;
//		String str="mani";
//		System.out.println("str "+str);
		
	//	Vector v1=new Vector(987654321);    //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
		List al=new ArrayList();
		al.add(987654321);
		al.add(685);
		al.add(254122551);
		System.out.println(al);
		
		
		String regex="(?=.*[0-9])$";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher m=pattern.matcher("1");
		
		//if(matcher.find()) {
			System.out.println("Pattern  "+m);
		//}
		
			
		Integer num1=new Integer(15);
		System.out.println(num1);
		
		Boolean b=new Boolean("dab");
		System.out.println("value: "+b);  //false
		
		Integer num2= Integer.valueOf("111",2);
		System.out.println(num2);
		
		String str="abcdefgh";
		System.out.println("CharAt(2);" +str.charAt(2));
		
		System.out.println("length: " +str.length());
		System.out.println("subtring(2):" +str.substring(2));
		System.out.println("subtring(2,7):" +str.substring(2,7));	
		
		String str1="ABC";
		String str2="ABC";
		String str3=new String("ABC");
		String str4=new String("ABC");
		System.out.println(str1.equals(str2));	//true
		System.out.println(str1==str2);			//true
		System.out.println(str1.equals(str3));	//true
		System.out.println(str1==str3);			//false
		
		System.out.println(str3.equals(str4));	//true
		System.out.println(str3==str4);			//false
		
		String str5=str4.intern();
		System.out.println(str3==str4);
		System.out.println(str3==str5);	
		
		StringEX obj1=new StringEX();
		System.out.println("Default Constructor: "+obj1.toString());
		StringEX obj=new StringEX(12);
		System.out.println("Parameterized Constructor "+obj.toString());
		
		
		int	n	=	15;	
		if(n>20)	
		if(n<20)	
		System.out.println("n>20");	
		else	
		System.out.println("Who	am	I?");
		
		for	(int	i	=	0,j	=	0;	i	<	10;	i++,j--)	{	
			System.out.print(j);	
			}	
		
	}
		
//	public static void main(String args[]){  
//		System.out.println("Hello java");  
//		}  
}
