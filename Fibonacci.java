public class Fibonacci{
		
	public static void main(String args[]) {
						
		int n1=0;
		int n2=1;
		int n3=0;
		
		//printing 0 and 1
		/*
		for(int i = 2;i<10;i++)//loop starts from 2 b/c 0 and 1 are already printed
		{
		n3=n1+n2;
		
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		}
		*/
		
		while(n3<10000){

			n3=n1+n2;
			
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;
		}
	}
}