import java.util.Scanner;
public class StudentGrow {

	public static void main(String[] args) {
		Scanner sscc = new Scanner(System.in);
		System.out.println("\t+-----<< ���л� Ű��� >>-----+");
		System.out.println("1. �����ϱ�");
		System.out.println("2. �����ϱ�");
		int starting=sscc.nextInt();
		if(starting!=1) {System.out.println("������ �����մϴ�."); System.exit(0);}
		else{
			System.out.println("=========================== ������ �����մϴ� ============================");
			System.out.println();
			System.out.println("<������ �� �бⰡ ���۵Ǿ���!..�� ��� ����� �߰���簡 ��?! ���� ���� �� ��¥ �⸻��� ���̾�..!>");
			System.out.println("<�������� ���� 45�� ���� ���л��� ������ Ű������! ����� ���� � ������ �����ϰ� �� ���ΰ� !>");
			System.out.println();
			int DdayNumber=45; //�ʱⰪ
			int Power=100;
			int Money=100000;
			int Friend=50;
			int Intelli=0;
			int Attendence=0;
			int Month=5;
			int Day=1;
			String Daily[]={"��","��","ȭ","��","��","��","��"};
			String Today = null;
			while(true){
				if(Month==5) {Today=Daily[Day%7];} //5���� 6�������� �°���
				if(Month==6) {Today=Daily[Day%7];}
				System.out.println("===================================================================");
				System.out.println("�������� D-"+DdayNumber+"  2017��   "+Month+"��   "+Day+"��   "+Today+"����");
				System.out.println("ü�� : "+Power+"  /  �����ɷ�: "+Intelli+" /   �� : "+Money+"��   /  �θ� : "+Friend);
				System.out.println();
				System.out.println("���ΰ� : ������ �������� "+DdayNumber+"��! �� �غ���?");
				System.out.println();
				System.out.println("1. ���ǵ�� : ���θ� ����! ������ ����߰ھ�!(1�� �Ҹ�, ü�� -10, �� -5000, �ָ��� ���þȵ�)");
				System.out.println("2. �˹ٰ��� : ���� �����! ���縸ŭ  �������ž�!(2�� �Ҹ�, ü�� -20, �� +20000)"); //�˹������� switch case�� �÷��� ������
				System.out.println("3. ģ��Ȱ���ϱ� : ģ���� �׾ƺ���! �θƵ� �ɷ��̷���!(2�� �Ҹ�, ü�� -10, �� -10000)"); //�����Լ��� �����ϰ� ���谡 �� ����(�����ɷ�+3) �̷��͵� ������?!
				System.out.println("4. ��մ�� : �����! ���� ���°� �ְ��!(1�� �Ҹ�, ü��+10)");//�����Լ��� ����ļ� �浿������ ���ڸ� ���״�!(�� -20000) �̷���..
				System.out.println("===================================================================");//5. �����ϱ⸦ ���� ����� ������
				int select=sscc.nextInt();
				if(select==1&&(Today.equals("��")||Today.equals("��"))) {
					System.out.println("�� �ָ��Դϴ�. �ٽ� �����ϼ���!");
					continue;
					}//��� ����..
				switch(select){
					case 1 :
						System.out.println("\n���Ǹ� ��´�.\n");
						 int i = (int) Math.round(Math.random() * (10) + 1); 
						 if(i<=2&&i>0){
							 System.out.println("������ : &#$%@&#ABC#%@... \n���ΰ�: ���� �Ϻ��� �����߾�!");
							 System.out.println("\n�����ɷ��� +2 ��ŭ �ö���!");
							 Intelli+=2;
						 }
						 else if(i<=10&&i>8){
							 System.out.println("������ : @#$%&1234%$#@... \n���ΰ� : ����ü �������ϱ�!");
							 System.out.println("\n���Ǹ� ���� �ǹ̰� ������!");
						 }
						 else {
							 System.out.println("������ : $%@#!@*&������$^@#... \n���ΰ�: ��..���� �˵�����..?!");
							 System.out.println("\n�����ɷ��� +1 ��ŭ �ö���!");
							 Intelli+=1;
							 }
						 System.out.println();
						 Day++;
						 DdayNumber--;
						 Power-=10;
						 Money-=5000;
						 break;
					/*case 2 :
					case 3 :
					case 4 :*/
				}
				/*if(DdayNumber==0)break; ������ while������ ���� ������ ��*/
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}
