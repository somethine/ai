
public class Calculator {

	 //�޼ҵ� ���� ~ �Ѵ�, ~ �ϱ� ���� , ���ڱ� , ��� , ����ϱ�
	//���� [����������] ���� Ÿ�� �޼ҵ��([�Ű�����...]){}
	//���Ŀ��� [] �������� ... ������
	//�޼ҵ带 �����Ϸ��� ȣ���ؾ� �Ѵ�

	void powerOn() {
		System.out.println("������ �մϴ�");
	
	}

   void powerOff() {
	   System.out.println("������ ���ϴ�.");
   
   }

   int plus(int x, int y) {
	   int result = x+y;
	   return result;   //return�� �޼ҵ带 ȣ���� ���� ���� result ���� �ǵ��� �־��
	   
   }
   double divide(int x, int y) {
	   double result = (double) x / (double)y;
	   return result;
	   
	  
  
   
   
   }
 

}
