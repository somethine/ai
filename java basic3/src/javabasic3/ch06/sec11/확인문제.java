package javabasic3.ch06.sec11;

import java.util.Scanner;

public class Ȯ�ι��� {

	public static void main(String[] args) {
	
	BankApplication ba = new BankApplication();
	
	Scanner sc = new Scanner(System.in);
	String menu = "0";
	
	While(! menu.equals("5")){
	System.out.println("---------------------------------------");
	System.out.println("1. ���»��� 2. ���¸�� 3. ���� 4. ��� 5. ����");
	System.out.println("---------------------------------------");
	System.out.println("����>");
	menu = sc.nextLine();

	switch(menu) {
	case "1":ba.���»���(); break;
	case "2":ba.���¸��(); break;
	case "3":ba.����(); break;
	case "4":ba.���(); break;
	case "5":System.out.println("���α׷� ����"); break;
	
	
	}
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
	}

}
