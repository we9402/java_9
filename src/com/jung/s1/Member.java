package com.jung.s1;

public class Member {
	//이름, 나이, 성별, 몸무게, 키, 전화번호
	private String name; //이름
	private int age;	//나이
	private String s;
	private double weight;
	private double height;
	private String number;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getS() {
		return s;
	}



	public void setS(String s) {
		this.s = s;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public String getNumber() {
		return number;
	}



	public void setNumber(String number) {
		this.number = number;
	}



	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+s);
		System.out.println("몸무게 : "+weight);
		System.out.println("키 : "+height);
		System.out.println("전화번호 : "+number);
	}

}
