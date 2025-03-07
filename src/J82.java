import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.Map;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	Float price;
	
	Product(int id, String name, Float price){
		this.id=id;
		this.name=name;
		this.price=price;		
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


	public Float getPrice() {
		return price;
	}


	public void setPrice(Float price) {
		this.price = price;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id-"+id+" name-"+name+" price-"+price;
	}
}

public class J82 {
	public static void main(String[] args) {
		List<Product> plist=new ArrayList<Product>();
		plist.add(new Product(1,"HP",10000.00f));
		plist.add(new Product(2,"ACER",30000.00f));
		plist.add(new Product(3,"DELL",20000.00f));
		plist.add(new Product(4,"LENOVA",50000.00f));
		plist.add(new Product(5,"ASUS",50000.00f));
		System.out.println("Original List--"+plist);
		
		List<Float> pplist=new ArrayList<Float>();
		for(Product p:plist) {
			if(p.price>20000f) {
				pplist.add(p.price);
			}
		}
		System.out.println("pplist--"+pplist);
		
		List<Float> pplist2=plist.stream().filter(p->p.price >20000f).map(p->p.price*5).collect(Collectors.toList()); //.map for calculations
		System.out.println("pplist2--"+pplist2);
		
		Set<Float> pplist3=plist.stream().filter(p->p.price >20000f).map(p->p.price*5).collect(Collectors.toSet());
		System.out.println("pplist To SET--"+pplist3);
		
		Map<Integer,Product> pplist4=plist.stream().filter(p->p.price >20000f).collect(Collectors.toMap(Product::getId,Function.identity()));
		System.out.println("pplist To Map--"+pplist4);
		
		Map<Integer,Product> pplist5=plist.stream().filter(p->p.price >20000f).collect(Collectors.toMap(Product::getId,Function.identity()));
		System.out.println("pplist To Map--"+pplist5);
		
		//Sequential and Parallel Stream
		List<String> list=Arrays.asList("a","b","c","d");
		System.out.println("List is: "+list);

		System.out.println("-----Sequential Stream");
		list.stream().forEach(element->System.out.println(element+" " +Thread.currentThread().getName()));
		
		System.out.println("-----parallelStream");
		list.parallelStream().forEach(element->System.out.println(element+" "+Thread.currentThread().getName()));
		
	}
}
