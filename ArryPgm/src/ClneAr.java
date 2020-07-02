
public class ClneAr {
public static void main(String[] args) {
	int []a= {1,2,3};
	System.out.println("the original copy");
	for(int i:a)
	{
		System.out.println(i);
	}
	System.out.println("printig clone array");
	int ar[]=a.clone();
	for(int i:ar)
	{
		System.out.println(i);
	}
}
}
