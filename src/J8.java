import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

//@FunctionalInterface can have only one/single abstract method(SAM) and any number of default and static methods.
@FunctionalInterface
interface Sayable{
	void say(String msg);
	default void default1() {
		System.out.println("Default 1 method");
	}
	default void default2() {
		System.out.println("Default 2 method");
	}
	static void static1() {
		System.out.println("Static 1 method");
	}
	static void static2() {
		System.out.println("Static 2 method");
	}
	//also can declare Object class method
	//public String toString();
}
public class J8 implements Sayable{
	@Override
	public void say(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Welcome \""+msg+"\".");
	}
	
	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		J8 obj=new J8();
		obj.say("Maninder");
		obj.default1();
		obj.default2();

		//Static method call
		Sayable.static1();
		Sayable.static2();
		
		System.out.println("---Java Stream---");
		List<Integer> numberList=Arrays.asList(11,22,33,44,55,66,77);
		System.out.println(numberList.stream().filter(number -> number%2 ==0).mapToInt(number -> number).sum());
		
		// Optional Example
		System.out.println("---Optional Example to handle NullPointerException---");
		String[] strArr=new String[10];
	//	String out=strArr[5].toLowerCase();
	//	System.out.println(out);
		
		Optional<String> chk=Optional.ofNullable(strArr[5]);
		
		if(chk.isPresent()) {
			String out=strArr[5].toLowerCase();
			System.out.println(out);
		}
		else{
			System.out.println("String at location 5 is not present.");
		}
		
		System.out.println("---Functional Interface implementation using Anonymous method and Lambda Expression.---");
		//Functional Interface implementation using Anonymous method
		Runnable r=new Runnable() {
			public void run() {
				System.out.println("Using Anonymous method.");
			};
		};
		Thread t=new Thread(r);
		t.start();
		
		//Functional Interface implementation using Lambda Expression
		Runnable r1=() ->{
				System.out.println("Using Lambda Expression.");

		};
		Thread t1=new Thread(r1);
		t1.start();
		
		// Nashorn Example
		ScriptEngine ee=new ScriptEngineManager().getEngineByName("Nashorn");
		//to read the hello.js file
		ee.eval(new FileReader("F:\\Study\\hello.js"));
		
		/*
		List<Integer> numbers = Arrays.asList(1,3,4,6,2,7);	
		int	sum	=	0;
		for	(int	number	:	numbers)
		if	(number	%	2	!=	0)
		sum	+=	number;
		System.out.println("sum "+sum);
		*/
		//assertEquals(11,	sum);
		
		List<String> nameList=new ArrayList<String>();
		nameList.add("Maninder");
		nameList.add("Test");
		nameList.add("User");
		nameList.add("Employee");
		nameList.add("Customer");
		
		System.out.println("nameList-->"+nameList);
		
		// Iterate using Lambda Expression
		nameList.forEach((n)->System.out.println(n));
		
		//(Lambda expressions allow you to define your own parameters and perform a lot more logical processing each time 
		//but Method Reference doesn't support it)
		nameList.forEach((n)->System.out.println(n+"+Singh"));
		//numberList.forEach((n)->System.out.println(n*2));  // "numberList" is defined above 
		
		// Iterate using Method Reference
		nameList.forEach(System.out::println);
		
	}
}
