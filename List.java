package Singh_Gursharan_Assignment1;

import java.util.ArrayList;

public class List {

	public void bubbleSort(ArrayList<Integer> items) {
		for(int i=items.size();i>=1;i--) { 
			for(int j=0;j<i-1;j++) { 
				if(items.get(j)>items.get(j+1)) {
					int temp=items.get(j);
					items.set(j, items.get(j+1));
					items.set(j+1, temp);
				}
			}
		}
		System.out.println("Sorted List:");
		System.out.println(items);
	}
	
}
