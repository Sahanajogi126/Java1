package com;

public class Student1 {
	int id;
	String name;
	Student1(int id,String name){
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {
		Student1 s1=new Student1(22,"Sahana");
		Student1 s2=new Student1(23,"Jogi");
		Student1[] s= new Student1[2];
		s[0]=s1;
		s[1]=s2;
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i].id+" "+s[i].name);
		}
		
		
	}

}
