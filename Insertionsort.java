import java.util.*;
class  Insertionsort{
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
		for(int i=0;i<n;i++)
		{   
			int j=i;
			while(j>0&&(array[j-1]>array[j]))
			{
				swap(array,j,j-1);
				j--;
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