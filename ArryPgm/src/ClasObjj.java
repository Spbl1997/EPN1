
public class ClasObjj {

	int n1;
	int n2;
	int res;
	public void perfrm()
	{
		res=n1+n2;
	}

}
class Demo1{
	public static void main(String[] args) {
		ClasObjj obj=new ClasObjj();
		obj.n1=3;
		obj.n2=4;
		obj.perfrm();
		System.out.println(obj.res);
		
	}
}