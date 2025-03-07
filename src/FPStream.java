import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FPStream {
	public static void sumOfOddNumbers(){
		/* to Convert an String array to List  */
		String[] geeks = {"Rahul", "Utkarsh", "Shubham", "Neelam"};
		// Conversion of array to ArrayList
		// using Arrays.asList
		List al = Arrays.asList(geeks);
		//System.out.println(al);

		/* to Convert an Integer array to Integer List  */
		int[] ar= {5,4,1,8,7,6};
		List<Integer> arList=new ArrayList<Integer>(ar.length);
		for(int number:ar) {
			arList.add(number);
		}
		System.out.println(arList);

		/* to Convert an Integer array to List  */
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6);
		int sum=0;
		for(int element:numbers) {
			//System.out.println(element);
			if(element%2!=0)
				sum+=element;
		}
		System.out.println(sum);
	}
	
//	@FunctionalInterface	
//		public	interface	Predicate<T>	{	
//		boolean	test(T	t);	
//	}	
	public static void FPSumOfOddNumbers() {
		List<Integer> al=Arrays.asList(1,2,3,4,5,6);
		System.out.println("Using Lambda Expressions");
		al.stream().filter((number) ->(number%2!=0)).forEach(number->System.out.print(number));
		System.out.println();
		System.out.println("Using Method References");
		al.stream().filter((number) ->(number%2!=0)).forEach(System.out::print);
		//System.out.println("FPSumOfOddNumbers");
	}
	public static boolean isOdd(int number) {
		return number%2 !=0;
		
	}
	public static void main(String[] args) {
		//FPStream.sumOfOddNumbers();
		FPStream.FPSumOfOddNumbers();
		
		System.out.println();
		System.out.println("Lambda expressions and functional references together");
		Arrays.stream(new String[] {"Ram","mani","test","makhan"}).filter(s->s.startsWith("ma"))
		.map(String::toUpperCase).sorted().forEach(System.out::println);
		System.out.println();
		
		Arrays.stream(new String[] {"Ram","mani","test","makhan"}).forEach(System.out::println);
		Arrays.stream(new String[] {"Ram","mani","test","makhan"}).forEach(str ->System.out.println(str));
		
		/* Reduce  */
		List<Integer> arlReduce=Arrays.asList(1,2,3,4,5,6);
		int sum=arlReduce.stream().filter((number) -> (number%2 !=0)).reduce(0, Integer::sum);
		System.out.println("sum with reduce method----" +sum);
		//assertEquals(9,sum);

		/* collect  */
		List<Integer> arl=Arrays.asList(1,2,3,4,5,6);
		List<Integer> oddNumbers=arl.stream().filter((number) -> (number%2 !=0)).collect(Collectors.toList());
		System.out.println("oddNumbers with collect method----" +oddNumbers);
		
		
		List<Integer> lm=Arrays.asList(1,2,3,4,5,6);
		lm.forEach(n-> System.out.println("Lambda expressiosn withone parameter"));
		lm.forEach(n->{
			if(n%2==0)
				System.out.println(n);});
		//System.out.println("sum with reduce method----" +sum);
		
		/*
		List<Integer> arlFun=Arrays.asList(1,2,3,4,5,6);
		arlReduce.stream().filter(a::isOdd).reduce(0, Integer::sum);
		//System.out.println("sum----" +sum);
		 * 
		 * */

		Runtime r=Runtime.getRuntime();
		System.out.println("freeMemory--"+r.freeMemory());
		System.out.println("totalMemory--"+r.totalMemory());
		
		
	}

	private static void assertEquals(int i, int sum) {
		// TODO Auto-generated method stub
		
	}

}
