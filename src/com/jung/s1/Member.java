package com.jung.s1;

public class Member {
	//이름, 나이, 성별, 몸무게, 키, 전화번호
	String name; //이름
	int age;	//나이
	String s;
	double weight;
	double height;
	String number;
	
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+s);
		System.out.println("몸무게 : "+weight);
		System.out.println("키 : "+height);
		System.out.println("전화번호 : "+number);
	}

}
