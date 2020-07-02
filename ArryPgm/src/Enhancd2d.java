
public class Enhancd2d {

	public static void main(String[] args) {
		//int x[]= {1,2,3,4}; same as below written
				//int y[]= {5,6,7,8};
				//int z[]= {3,4,7,8};
		int p[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{3,4,7,8}
				
		};
		for(int i[]:p)//it will fetch whole array like x[],y[],z[]
		{
			for(int j: i)
			//it will fetch perticular ellement of each array
			{
				System.out.print(j+ " ");
			}
			System.out.println(" ");
		}
	}

}
