package streamAPI.com;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondSmallest 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,5,2,9,7,3,6));
		System.out.println("list element: "+l1);
		System.out.println("Second smallest: "+l1.stream().sorted().skip(1).findFirst());
		System.out.println("Second max: "+l1.stream().sorted((a,b)->b-a).distinct().skip(1).findFirst());
		System.out.println("Descending: "+l1.stream().sorted((a,b)->b-a).toList());
	}

}
