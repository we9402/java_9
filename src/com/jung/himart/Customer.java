package com.jung.himart;

public class Customer {
	private int don;
	private int point;
	
	
	public Customer() {
		
	}
	public void buy(int dons, int points, int a, int b) {
		//물건값 계산
		//포인트 계산
		int don = dons- a;
		int point = points + b;
		
		System.out.println("현재 남은 돈 : "+don);
		System.out.println("현재 누적포인트 : "+point);
	}
	
	public int getDon() {
		return don;
	}
	public void setDon(int don) {
		this.don = don;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}
