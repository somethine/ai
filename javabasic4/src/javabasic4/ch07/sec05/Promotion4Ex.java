package javabasic4.ch07.sec05;

import java.util.Scanner;

public class Promotion4Ex {

	 public static void main(String[] args) {
	      Promotion4Ex p = new Promotion4Ex();
	      p.menuDisplay();
	      int choice = p.menuChoice();
	      p.output(choice);
	   }
	   
	   public void menuDisplay() {
	      //�޴��� �޼ҵ� 
	      System.out.println("-------------------------------");
	      System.out.println(" 1. ��  2. ������ 3. �ܹ��� 4. ����");
	      System.out.println("-------------------------------");
	   }
	   public int menuChoice() {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("�޴��� �ֹ��ϼ��� >");
	      int choice;
	      choice = sc.nextInt();
	      return choice;
	   }
	   public String output( int choice ) {
	      //�ֹ��� �޴� ������ 
	      switch( choice ) {
	          case 1:  A a = new A(); a.eat(); break;
	          case 2:  A b = new B(); b.eat(); break;
	          case 3:  A bb = new BB(); bb.eat(); break;
	          case 4:  A c = new C(); c.eat(); break;
	      }
	      return null;
	   }

	}


	class A{
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
	   }
	}
	class C extends B{
	   @Override
	   void eat() {
	      System.out.println("����");
	   }
	}