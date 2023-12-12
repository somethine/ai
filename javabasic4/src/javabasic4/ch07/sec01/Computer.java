package javabasic4.ch07.sec01;

public class Computer extends Calculator {

   @Override
public double areaCircle(double r) {
	   System.out.println("Computer객체의 areaCircle() 실행");
		
	    return 2 * 3.14 * r;  //원둘레 구하기
	    
}






}
