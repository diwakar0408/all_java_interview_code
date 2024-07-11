//Functional_Interface.java
interface Demo_Funct{
	public  String getName();
}
class Functional_Interface{
	public static void main(String args[]){
	Demo_Funct  e1=()->"diwakar";
	System.out.print(e1.getName());
	Demo_Funct  e2=()->"Love";
	System.out.print(e2.getName());
	
	}
}