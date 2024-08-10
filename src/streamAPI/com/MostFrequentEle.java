package streamAPI.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MostFrequentEle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> l = new ArrayList<String>(Arrays.asList("java","java","C#","c","ruby","ruby","ruby"));
		System.out.println(l);
		System.out.println("Group element by length: "+l.stream().sorted((a,b)->b.length()-a.length()).findFirst());
		System.out.println(""+l.stream().map(i->i).collect(Collectors.joining(",")));
	}

}
