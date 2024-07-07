class PrimeNumber{
	public static void main(String args[]){
		int n2=19;
		for(int n1=2;n1<=n2;n1++)
		{
		int n=n1,count=1;
		for(int i=2;i<=n;i++)
		{
			if(n%i==0){
				count++;
				if(count>2){
					break;
				}
			}
		}
		/*if(count==2)
		{
			System.out.println("yes");
		}else{
			System.out.println("No");
		}*/
		if(count==2)
		{
			System.out.println(n+" ");
		}
		count=1;
		}
	}
}