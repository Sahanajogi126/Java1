package com;

public class Employees {
	@Override
	public int hashCode()
	{
		return  12345;
	}
public static void main(String args[]) {
	Employee e=new Employee();
	System.out.println(e.hashCode());
}
}
