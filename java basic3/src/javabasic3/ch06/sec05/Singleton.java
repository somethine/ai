package javabasic3.ch06.sec05;

public class Singleton {

     private static Singleton singleton = new Singleton();
     
     

	
	
	
	private Singleton() {
    	 //������ new �ϸ� ����Ǵµ� private �ؼ�
    	 // �ܺ�Ŭ�������� new ���ϰ� ��
    	 
    	
     }


     public static Singleton getInstance() {
    	 return singleton;
    	 
     }




}
