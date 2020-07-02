import java.util.Random;

public class RandamArry {

	public static void main(String[] args) {
		Random r=new Random();
		int P[]=new int[25];
		
		for(int i=0;i<P.length;i++)
		{
			P[i]=r.nextInt(50);//print 50th element
		//	System.out.println(P[i]);
		}
			System.out.println(P[20]);//random element start with 20th element
			for(int i:P)
			{
				System.out.println(i);
			}
	}

}
