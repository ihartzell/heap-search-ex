

public class HeapSearch 
{
	private String [][]heap;
	private int heapSize;
	private int innerSize[];
	
	public HeapSearch()
	{
		heapSize = 101;
		
		heap = new String[heapSize][];
		innerSize = new int[heapSize];
		
		for (int i = 0; i < heapSize; i++)
		{
			innerSize[i] = 0;
			heap[i] = new String[innerSize[i]];
		}		
	}

	private long sfold(String s, int M) {
		int intLength = s.length() / 4;
		long sum = 0;
		for (int j = 0; j < intLength; j++) {
			char c[] = s.substring(j * 4, (j * 4) + 4).toCharArray();
			long mult = 1;
			for (int k = 0; k < c.length; k++) {
				sum += c[k] * mult;
				mult *= 256;
			}
		}
		char c[] = s.substring(intLength * 4).toCharArray();
		long mult = 1;
		for (int k = 0; k < c.length; k++) {
			sum += c[k] * mult;
			mult *= 256;
		}
		return (Math.abs(sum) % M);
	}
	
	public void insertHeap(long key, String item)
	{
		int currentSize = innerSize[(int) key];
		
		String newArray[] = new String[currentSize + 1];
		for (int i = 0; i < currentSize; i++)
			newArray[i] = heap[(int) key][i];
		heap[(int) key] = newArray;
		heap[(int) key][currentSize] = item;
		innerSize[(int) key]  = currentSize + 1;
	}
	
	public void insert(String item)
	{
		long key = sfold(item,heapSize);

//		System.out.print(item + " ");
//		System.out.println(key);
		
		insertHeap(key, item);
	}
	
	public void print()
	{
		for (int i = 0; i < heapSize; i++)
		{
			System.out.print("Bin: " );
			System.out.println(i);
			
			for (int j = 0; j < innerSize[i]; j++)
			{
				System.out.println("\t" + heap[i][j]);
			}
		}
	}
}
