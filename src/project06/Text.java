package project06;

public class Text {

	public static void main(String[] args) {
		
		
		System.out.println(febonaci(7));
		hanoi(3, "A", "B", "C");

	}
	
	
	//斐波那契数列 1 1 2 3 5 8 13 21
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
	
	//汉诺塔问题
	public static void hanoi(int n,String from,String middle,String taget)
	{
		if(n==1)
		{
			System.out.println("第1个盘子从"+from+"移到了"+taget);
		}
		else {
			hanoi(n-1, from,taget,middle);
			System.out.println("第"+n+"个盘子从"+from+"移到了"+taget);
			hanoi(n-1, middle, from, taget);
			
		}
	}

}
