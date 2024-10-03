/*
 * Q4. Wap create a pojo class  employee with attribute id, name, city , and salary store all data in linklist, now by using Stream API find out the 
 * second max salary from this data. you can use comparable or comparator for sorting.
 */
package streamAPI.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class POJOClassFindSecMaxSalry 
{
	private int id;
	private String name;
	private String city;
	private double salary;
	public POJOClassFindSecMaxSalry(int id, String name, String city, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public static void isSmax(List<Double> ld)
	{
		double sal = ld.stream().sorted(Comparator.reverseOrder()).skip(1).mapToDouble(Double::doubleValue).findFirst().orElse(0);
		System.out.println("Second Max Salary is: "+sal);
	}
	public static void main(String[] args) 
	{
		LinkedList<POJOClassFindSecMaxSalry> p = new LinkedList<>();
		p.add(new POJOClassFindSecMaxSalry(1, "Sangram", "Kadegaon", 120000.2));
		p.add(new POJOClassFindSecMaxSalry(2, "Harshad", "Hingangaon", 130000.2));
		p.add(new POJOClassFindSecMaxSalry(3, "Omkar", "Kavthe", 140000.2));
		p.add(new POJOClassFindSecMaxSalry(4, "Aditya", "Kharade", 150000.2));
		System.out.println("Given Informations is: ");
		System.out.println("-----------------------------");
		for(POJOClassFindSecMaxSalry p1 : p)
		{
			System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getCity()+" "+p1.getSalary());
		}
		System.out.println("-----------------------------");
		List<Double> ld = new ArrayList<>();
		for(POJOClassFindSecMaxSalry p1 : p)
		{
			ld.add(p1.getSalary());
		}
		isSmax(ld);
	}
}
