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
			int DdayNumber=45;
			int Power=100;
			int Money=100000;
			int Friend=50;
			int Score=0;
			int Attendence=0;
			int Month=5;
			int Day=1;
			String Daily[]={"��","��","ȭ","��","��","��","��"};
			String Today = null;
			while(true){
				if(Month==5) {Today=Daily[Day%7];}
				if(Month==6) {Today=Daily[Day%7];}
				System.out.println("�������� D-"+DdayNumber+"  2017��   "+Month+"��   "+Day+"��   "+Today+"����");
				System.out.println("ü�� : "+Power+"  /   �� : "+Money+"��   /  �θ� : "+Friend);
				System.out.println();
				System.out.println("���ΰ� : ������ �������� "+DdayNumber+"��! �� �غ���?");
				System.out.println();
				System.out.println("1. ���ǵ�� \t 2. �˹ٰ��� \t 3. ģ��Ȱ���ϱ� \t 4. ��մ��");
				
				/*if(DdayNumber==0)*/ break;
			}
		}
		
		
		// TODO Auto-generated method stub

	}

}
