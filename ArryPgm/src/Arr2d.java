
public class Arr2d {

	public static void main(String[] args) {
		//int x[]= {1,2,3,4}; same as below written
		//int y[]= {5,6,7,8};
		//int z[]= {3,4,7,8};
int p[][]= {
		{1,2,3,4},
		{5,6,7,8},
		{3,4,7,8}
		
};
for(int i=0;i<3;i++)//this is for row 
{
	for(int j=0;j<4;j++)//colmn
	{
		System.out.print(p[i][j]+" ");
	}
	System.out.println(" "  );

}	
}
}
