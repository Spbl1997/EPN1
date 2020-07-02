
public class JaggedArray {
//jagged array have diiferent size of elemnt
	public static void main(String[] args) {
		
		int k[][]=new int[3][];
		k[0]=new int[4];//4 element in array
		k[1]=new int[2];//2 element in array
		k[2]=new int[3];//3 elemnt in array
		
		
		
		
		int p[][]= {
				{1,2,3,4},//
				{5,6},    //jagged array
				{7,8,9}   // 

	};
		for(int i[]: p)
		{
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println("  ");
		} 
	}
}
