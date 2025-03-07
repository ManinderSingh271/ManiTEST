import java.util.ArrayList;

class Car{
	public String name;
	public ArrayList<String> colors;
	
	public Car(String name,ArrayList<String> colors) {
		this.name=name;
		this.colors=colors;
	}
}
public class CopyShallowDeepEX {

	public static void main(String[] args) {
		ArrayList<String> hondaColors= new ArrayList<String>();
		hondaColors.add("Red");
		hondaColors.add("Blue");
		hondaColors.add("Green");
		
		Car honda=new Car("Honda", hondaColors);
		System.out.println("Original---");
		for(String colors:honda.colors) {
			System.out.println(colors);
		}
		
		//Shallow Copy
		Car copyHonda=honda;
		copyHonda.colors.add("Orange");
		System.out.println("Shallow Copy---");
		for(String colors:copyHonda.colors) {
			System.out.println(colors);
		}
		
		//Deep Copy
		Car deepCopyHonda=new Car(honda.name,new ArrayList<String>(honda.colors));
		deepCopyHonda.colors.add("Black");
		System.out.println("Deep Copy---");
		for(String colors:deepCopyHonda.colors) {
			System.out.println(colors);
		}
	}
}
