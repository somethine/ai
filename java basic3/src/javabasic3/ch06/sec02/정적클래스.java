package javabasic3.ch06.sec02;

public class 정적클래스 {

	public static void main(String[] args) {
	       m1();
	      
	   정적클래스 i1  = new 정적클래스(); // static 안 붙어 있는 멤버들이 힙메모리 올라간다.
	     i1.m2();
	   System.out.println(st);
	   
	}

static void m1() {
	
	System.out.println("정적 메스드입니다");
}

   void m2() {
	   
	  System.out.println("인스턴스 메소드입니다.");
   }





}




