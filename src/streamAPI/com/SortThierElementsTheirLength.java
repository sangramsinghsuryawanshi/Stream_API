package streamAPI.com;

import java.util.ArrayList;
import java.util.Arrays;

public class SortThierElementsTheirLength {

	public static void main(String[] args)
	{
		ArrayList<String> l = new ArrayList<String>(Arrays.asList("java","C#","c","c++"));
		System.out.println("Group element by length: "+l.stream().sorted((a,b)->a.length()-b.length()).toList());

	}

}
