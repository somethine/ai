package javabasic4.ch07.sec010;

public class promotion2 {

	public static void main(String[] args) {
		//E ��ü �����մϴ�.
		E e = new E();
		B e1=new E();
		A e2= new E();
		
		//G ��ü�� �����մϴ�
		
		G g = new G();
		C g1=new G();
		A g2= new G();
		
	    //H ��ü�� �����մϴ�
	
		H h = new H();
		D h1=new H();
		A h2= new H();
	
	
	}

}




class A {
	
}
class B extends A{
	
}

class C extends A{
	
}

class D extends A{
	
}

class E extends B{
	
}

class F extends B{
	
}

class I extends E{
	
}

class G extends C{
	
	}
class H extends D{
	
}