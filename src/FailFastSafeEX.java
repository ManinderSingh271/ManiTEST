import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastSafeEX {
	public static void main(String[] args) {
		/*  ConcurrentModificationException Using ArrayList
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(5);
		ar.add(1);
		ar.add(7);
		ar.add(8);
		ar.add(2);
		
		//ArrayList ar2=(ArrayList) Arrays.asList(1,8,5,9,4);
		//System.out.println(ar2.size());
		
		//System.out.println(ar);
		System.out.println("------ArrayList------");
		Iterator<Integer> itr= ar.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//ar.add(90);  //It will throw concurrentModificationException
		}
		*/
		//Fail-FAST
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(101, 10);
		map.put(102, 20);
		map.put(103, 30);
		map.put(104, 40);
		map.put(105, 50);
		System.out.println("------Map------");
		System.out.println(map);
		
		Iterator<Map.Entry<Integer,Integer>> itr2=map.entrySet().iterator();
		while(itr2.hasNext()) {
			Map.Entry<Integer, Integer> entry=itr2.next();
			System.out.println("Keys:"+entry.getKey()+" Value:"+entry.getValue());
			//System.out.println(entry.getValue());
			//map.put(106, 60); //It will throw concurrentModificationException
			
		}
		///Fail-SAFE
		ConcurrentHashMap<Integer,Integer> cmap=new ConcurrentHashMap<>();
		cmap.put(101, 10);
		cmap.put(102, 20);
		cmap.put(103, 30);
		cmap.put(104, 40);
		cmap.put(105, 50);
		System.out.println("------ConcurrentMap------");
		System.out.println(cmap);
		
		Iterator<Map.Entry<Integer,Integer>> itr3=cmap.entrySet().iterator();
		while(itr3.hasNext()) {
			Map.Entry<Integer, Integer> entry=itr3.next();
			System.out.println("Keys:"+entry.getKey()+" Value:"+entry.getValue());
			//System.out.println(entry.getValue());
			cmap.put(106, 60); //It will throw concurrentModificationException
			
		}
		//cmap.put(107, 70);  disadvantage user will not always get update data if it is NOT updated in itegartor itself  
		
		
		HashSet set=new HashSet();
		set.add(1);
		set.add(50);
		set.add(20);
		set.add(25);
		set.add(10);
		set.add(50);
		set.add(null);

		System.out.println("------SET------");
		System.out.println(set);
		
		
	}

}
