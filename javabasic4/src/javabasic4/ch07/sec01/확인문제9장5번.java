package javabasic4.ch07.sec01;

public class Ȯ�ι���9��5�� {

	
	public static void printSound(Soundable soundable) {
		    System.out.println(soundable.sound());
	}
	
	
	
	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
		
	   printSound(new Cat());
	   printSound(new Dog());
	 
	
	}

}

interface Soundable{
	public String sound();
	
}

class Cat implements Soundable {

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return " �߿���   ";
	}
	
}

class Dog implements Soundable {

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "�۸�";
	}
	

}


class SoundableExample{
	
}



interface Remocon {
	public void powerOn();
}

class TV implements Remocon {
	
	@Override
	public void powerOn() {
		
			System.out.println("TV�� �׽��ϴ�");
		
	}
	
}
	
