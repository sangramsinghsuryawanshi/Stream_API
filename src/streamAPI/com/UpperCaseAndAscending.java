package streamAPI.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperCaseAndAscending {

	public static void main(String[] args) 
	{
		List<String> l = new ArrayList<String>(Arrays.asList("java","c#","ruby","c"));
		List s = l.stream().map(a->a.toUpperCase()).toList();
		System.out.println("To uppercase: "+s);
		
		List s1 = l.stream().sorted().toList();
		System.out.println("Sorted: "+s1);
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,6,3,8,9,4,5));
		List w = l1.stream().sorted().toList();
		System.out.println("Integer sort: "+w);
	}
}
