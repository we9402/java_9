package com.jung.s1;

public class InBody {
	public void check(Member member) {
		//비만도 측정 
		//회원키-100 한 결과 값에 0.95를 곱한 결과 값 a(표준몸무게)
		//s가 회원몸무게 보다 작다면 비만
		//s가 회원몸무게 보다 크다면 저제중
		//s가 회원몸무게 랑 같다면 정상
		/*double s = (member.height-100)*0.95;
		System.out.println(member.name+"회원의 정상체중은 "+s+" 입니다.");
		if(s<member.weight) {
			System.out.println(member.name+"회원의 체중은 비만입니다.");
		}else if(s>member.weight) {
			System.out.println(member.name+"회원의 체중은 저체중 입니다.");
		}else {
			System.out.println(member.name+"회원의 체중은 정상 입니다.");
		}*/
		
	}
	

}
