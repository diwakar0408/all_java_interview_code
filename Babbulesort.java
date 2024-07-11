import java.util.*;
class  Babbulesort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements:");
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
		System.out.println("Before sorting the elements:");
		for(int i=0;i<n;i++){
			System.out.print(array[i]+" ");
		}
		for(int i=n-1;i>=1;i--)
		{   
			for(int j=0;j<i;j++)
			{
				if(array[j]>array[j+1])
				{
					swap(array,j,j+1);
				}
			}

		}
		System.out.println();
		System.out.println("after sorting the elements:");
		for(int i=0;i<n;i++){
			System.out.print(array[i]+" ");
		}
		
	}
	static void swap(int array[],int a,int b)
	{
		int temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	}
}