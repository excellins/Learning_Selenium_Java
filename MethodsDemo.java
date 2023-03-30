
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		//d.getData();
		
		String name = d.getData();
		System.out.println(name);
		
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		
		getData2();
		
		ToDelete df = new ToDelete();
		df.getSomeData();
	}
	//Main is for execution
	//Why method - Create method, reuse it by calling the block of code
	
	public String getData()//PUBLIC IS ACCESS MODIFIER, VOID MEANS WHAT IT RETURNS, it returns nothing, executes line of code but desnt return anything
	{
		System.out.println("Hello World");
		return "Collins Abang Eban";
	}
	
	
	public static String getData2()//WHEN STATIC, WE DIRECTLY ASSIGN THAT METHOD TO BELONG TO CLASS SO YOU DONT HAVE TO CREATE AN OBJECT TO CALL IT
	{
		System.out.println("Hello World");
		return "Collins Abang Eban";
	}
}
