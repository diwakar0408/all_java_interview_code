import java.util.*;
class Frequency{
public static void main(String args[]){
	String s="aabbbcccc";
	Map<Character,Integer> m=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
			if(!m.containsKey(s.charAt(i))){
				m.put(s.charAt(i),1);
			}else{
				m.put(s.charAt(i),m.get(s.charAt(i))+1);
			}
		}
		List<Map.Entry<Character,Integer>> l=new ArrayList<Map.Entry<Character,Integer>>(m.entrySet());
		Collections.sort(l,new mycomp());
		System.out.println(l);
}	
}
class mycomp implements Comparator<Map.Entry<Character,Integer>>{
	public int compare(Map.Entry<Character,Integer> a1,Map.Entry<Character,Integer> a2){
		return -(a1.getValue()).compareTo(a2.getValue());
	}
}
