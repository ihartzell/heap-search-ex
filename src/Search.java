
import java.util.Random;

public class Search 
{
	private int array[];
	private int size;
	
	private int count;
	
	public Search()
	{
		size = 100;
		array = new int[size];
		Random rand = new Random();
		
		for (int i = 0; i < size; i++)
			array[i] = rand.nextInt(10000);
	}
	
	public Search(int size)
	{
		this.size = size;
		array = new int[size];
		Random rand = new Random();
		
		rand.setSeed(12345);
		
		for (int i = 0; i < size; i++)
			array[i] = rand.nextInt(10000);
	}
	
	public void print()
	{
		for (int i = 0; i < size; i++)
			System.out.println(array[i]);
	}
	
	private void swap(int index1, int index2)
	{
		int hold = array[index1];
		array[index1] = array[index2];
		array[index2] = hold;
	}
	
	// Insertion Sort
	public void sort()
	{
		for (int index1 = 0; index1 < size - 1; index1++)
			for (int index2 = index1 + 1; index2 < size; index2++)
			{
				if (array[index1] > array[index2])
					swap(index1,index2);
			}
	}
	
	public int getIndex(int index)
	{
		if (index >= 0 && index < size)
			return array[index];
		else
			return -1;
	}
	
	public void setIndex(int index, int value)
	{
		if (index >= 0 && index < size)
			array[index] = value;
	}
	
	private int findValue(int value, int start, int end)
	{
		count += 1;
		
		
		if (start > end)
			return 0;
		int midpoint = (start + end) / 2;
		
		if (array[midpoint] == value)
			return value;
		
		// general case
		if (array[midpoint] < value)
			return findValue(value,midpoint+1,end);
		else //if (array[midpoint] > value)
			return findValue(value,start,midpoint-1);
	}
	
	public int findValue(int value)
	{
/*		
		for (int i = 0; i < size; i++)
			if (array[i] == value)
				return value;
*/
		count = 0;
		
		int found = findValue(value,0,size-1);
		
		System.out.print("Count: ");
		System.out.println(count);
		
		return found;
	//	return 0;
	}
}
