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
	      //메뉴판 메소드 
	      System.out.println("-------------------------------");
	      System.out.println(" 1. 밥  2. 떡뽁이 3. 햄버거 4. 피자");
	      System.out.println("-------------------------------");
	   }
	   public int menuChoice() {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("메뉴를 주문하세요 >");
	      int choice;
	      choice = sc.nextInt();
	      return choice;
	   }
	   public String output( int choice ) {
	      //주문한 메뉴 나가기 
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
	      System.out.println("밥");
	   }
	}
	class B extends A{
	   @Override
	   void eat() {
	      System.out.println("떡뽁이");
	   }
	}
	class BB extends A{
	   @Override
	   void eat() {
	      System.out.println("햄버거");
	   }
	}
	class C extends B{
	   @Override
	   void eat() {
	      System.out.println("피자");
	   }
	}