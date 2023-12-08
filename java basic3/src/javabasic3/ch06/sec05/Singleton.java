package javabasic3.ch06.sec05;

public class Singleton {

     private static Singleton singleton = new Singleton();
     
     

	
	
	
	private Singleton() {
    	 //생성자 new 하면 실행되는데 private 해서
    	 // 외부클래스에서 new 못하게 함
    	 
    	
     }


     public static Singleton getInstance() {
    	 return singleton;
    	 
     }




}
