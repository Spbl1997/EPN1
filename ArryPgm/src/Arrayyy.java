

public class Arrayyy {
	public static void main(String[] args) {
		//array declaration two aproach
		//1. approach
		int[] sp=new int[4];
		String[] ps=new String[3];
		//Int Array Initialisation : 
		sp[0]=10;
		sp[1]=20;
		sp[2]=30;
		sp[3]=40;
	//	sp[4]=50;
		
		//if size array is greater than deifined size than we get exception
		//java.lang.ArrayIndexOutOfBoundsException:
		System.out.println(sp[0]);
		System.out.println(sp[1]);
		System.out.println(sp[2]);
		System.out.println(sp[3]);
		//System.out.println(sp[4]);
		//String Array Initialisation 
		ps[0]="java";
		ps[1]="java1";
		ps[2]="java2";
	//	ps[3]="java3";
		System.out.println(ps[0]);
		System.out.println(ps[1]);
		System.out.println(ps[2]);
		//System.out.println(ps[3]);
		
	}
}
//second approach 
// int[] sp={10,20,30}
//String[] ps={"java","jav1","java2"};