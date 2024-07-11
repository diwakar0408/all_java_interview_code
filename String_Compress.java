import java.util.*;
class String_Compress{
	public static void main(String args[]){
		String s="aaabbbcc";
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
			if(!m.containsKey(s.charAt(i))){
				m.put(s.charAt(i),1);
			}else{
				m.put(s.charAt(i),m.get(s.charAt(i))+1);
			}
		}
		Set<Character> s1=new HashSet<Character>();
		for(int i=0;i<s.length();i++){
			if(!s1.contains(s.charAt(i))){
				System.out.print(s.charAt(i)+""+m.get(s.charAt(i)));
				s1.add(s.charAt(i));
			}
		}
		
	}
}