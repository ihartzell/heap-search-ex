import java.util.Scanner;

//Isaac Hartzell
// CIS 2207 N02
// Assignment 8
// 3-26-18
// This program demonstrates a heap search.

public class Driver 
{
	public static void main(String[] arg)
	{
		/*Search search = new Search(1000);
		search.print();
		search.sort();
		search.print();
		System.out.println(search.findValue(9080));*/
		
		/*HeapSearch heap = new HeapSearch();
		heap.insert("This is a tes");
		heap.insert("This is a tes");
		heap.insert("This is a test");
		heap.insert("Hello World");
		heap.insert("Test this is");
		heap.print();*/
		
		HeapSearch heap = new HeapSearch();
		heap.insert("HELLO WORLD");
		heap.insert("NOW HEAR THIS");
		heap.insert("HEAR THIS NOW");
		heap.print();
	}
}

