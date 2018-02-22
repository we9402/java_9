package com.jung.s1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member();
		/*member.name = "김oo";
		member.age = 28;
		member.s = "남자";
		member.weight = 70.5;
		member.height = 175.6;
		member.number = "010-0000-0000";*/
		InBody inBody = new InBody();
		inBody.check(member);

	}

}
