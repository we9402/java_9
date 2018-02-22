package com.jung.himart;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tv tv = new Tv();
		tv.setBrand("LG");
		tv.setSize(100);
		tv.setPrice(1000);
		tv.setPoint(100);
		Computer com = new Computer();
		com.setCpu("i7");
		com.setMuge(0.99);
		com.setPrice(120);
		com.setPoint(80);
		Phone phone = new Phone();
		phone.setBrand("Apple");
		phone.setColor("GoldPink");
		phone.setPrice(150);
		phone.setPoint(50);
		Customer u = new Customer();
		u.setDon(2000);
		u.setPoint(0);
		System.out.println("살 물건 선택");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		int i =sc.nextInt();
		int don = 0;
		int point = 0;
		switch(i) {
		case 1 :
			don = com.getPrice();
			point = com.getPoint();
			break;
		case 2 :
			don = tv.getPrice();
			point = tv.getPoint();
			break;
		case 3 :
			don = phone.getPrice();
			point = phone.getPoint();
			break;
		}
		
		u.buy(u.getDon(),u.getPoint(),don, point);
		
		

	}

}
