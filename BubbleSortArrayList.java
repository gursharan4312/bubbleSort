import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSortArrayList {

	public static void main(String[] args) {
		ArrayList <Integer> items = new ArrayList<>();
		Scanner inp = new Scanner(System.in);
		
		//Ask the user for how many elements to be added.
		 System.out.println("Enter the number of elements to be added");
		 int HowManyElements = inp.nextInt();
		 
		//adding the elements to the ArrayList.
		 System.out.println("Enter intergers to be sorted:");
		for (int i = 1 ; i<= HowManyElements; i++){
			items.add(inp.nextInt());
		}
		inp.close();
		
		//Print out the Original ArrayList
		System.out.println("Unsorted List:");
		System.out.println(items);
		
		/* Calling the non-static bubbleSort method using the instantiated object list of
		the class it is defined*/
		List list=new List();
		list.bubbleSort(items);
		}
	
}
