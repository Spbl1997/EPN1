
public class VarArgs {

	public static void main(String[] args) {
		display dp=new display();
		dp.displayval(3,3,44,4,4);//here we dnt knw the actually value 
//if it is one value like (3) than it will call second method//it will occupy all values
		}

}
//we dntknow exact size of array thats y we should declare lik array
class display{
	void displayval(int ...a)//variable arguemnts
	{
		for(int i:a)
			System.out.println(i);
	}
	void displayval(int a)
	{
		System.out.println(a);
	}
}