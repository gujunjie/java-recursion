package project06;

public class Text {

	public static void main(String[] args) {
		
		
		System.out.println(febonaci(7));
		hanoi(3, "A", "B", "C");

	}
	
	
	//쳲��������� 1 1 2 3 5 8 13 21
	public static int febonaci(int i)
	{
		if(i==1||i==2)
		{
			return 1;
		}
		else
		{
			return febonaci(i-1)+febonaci(i-2);
		}
	}
	
	//��ŵ������
	public static void hanoi(int n,String from,String middle,String taget)
	{
		if(n==1)
		{
			System.out.println("��1�����Ӵ�"+from+"�Ƶ���"+taget);
		}
		else {
			hanoi(n-1, from,taget,middle);
			System.out.println("��"+n+"�����Ӵ�"+from+"�Ƶ���"+taget);
			hanoi(n-1, middle, from, taget);
			
		}
	}

}
