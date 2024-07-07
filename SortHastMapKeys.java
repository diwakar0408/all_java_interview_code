import java.util.*;
class SortHastMapKeys{
	public static void main(String args[]){
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		h.put("love",1);
		h.put("ram",1);
		h.put("a",1);
		h.put("love2",3);
		h.put("hi",1);
		System.out.println(h);
		//Map<String,Integer> m=new TreeMap<String,Integer>(h);
		//System.out.println(m);
		Set<String> s=h.keySet();
		ArrayList<String> s1=new ArrayList<String>(s);
		System.out.println(s1);
		Collections.sort(s1);
		System.out.println(s1);
		
	}
}