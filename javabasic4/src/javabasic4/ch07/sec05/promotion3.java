package javabasic4.ch07.sec05;



public class promotion3 {

	public static void main(String[] args) {
	  A	a = new A();
	  a.eat();
	  
	  B	b = new B();
	  A b1= new B();
	  b.eat();
	  b1.eat();
	
	  BB bb = new BB();
	  bb.eat();
	
	
	}

}

class A {
	void eat() {
		System.out.println("��");
	}


}
class B extends A{
	@Override
	void eat() {
	System.out.println("������");
	}
}

class BB extends A{
	@Override
	void eat() {
		System.out.println("�ܹ���");
		super.eat();
	}
}

class C extends B{
	@Override
	void eat() {
		System.out.println("����");
		super.eat();
	}
}





