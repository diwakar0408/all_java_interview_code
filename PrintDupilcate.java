import java.util.*;
class PrintDupilcate{
	public static void main(String args[]){
		String s="diwakar";
		PrintDup(s);
	}
	static void PrintDup(String s){
		HashMap<Character,Integer> h=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(!h.containsKey(s.charAt(i))){
				h.put(s.charAt(i),1);
			}else{
				h.put(s.charAt(i),h.get(s.charAt(i))+1);
			}
		}
		for (Map.Entry<Character, Integer> e : h.entrySet()){
           if(e.getValue()>1){
			   System.out.println(e.getKey()+":"+e.getValue());
		   }
    }
		
	}
	
}