import java.util.Random;

public class ArryExcptin {
//unchecked exception
	public static void main(String[] args) {
		Random r=new Random();
		int P[]=new int[25];
		
		for(int i=0;i<P.length;i++)
		{
			P[i]=r.nextInt(50);//print 50th element
		}try {
			System.out.println(P[52]);//random element start with 20th element
		}catch(Exception e)
		{
			System.out.println(e);
		}
			for(int i:P)
			{
				System.out.println(i);
			}
	}


	}


