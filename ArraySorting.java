/* Write a Java program to sort in ascending order an array of given integers[45,35,56,67,78,89,78,12,20] */

package arrayPrograms;

public class ArraySorting {

	public static void main(String[] args) {

		int a[]= {45,35,56,67,78,89,78,12,20}; //array declaration and initialization

		//sorting the array elements in an ascending order
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;

				}
			}
		}


		//Traversing the sorted array and displaying the elements
		System.out.println("After sorting the array elements are: ");
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}


	}

}

/*Output:
 *After sorting the array elements are: 
 *12 20 35 45 56 67 78 78 89 
 */
