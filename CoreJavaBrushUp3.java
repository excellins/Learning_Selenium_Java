
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string is an object that represent string of characters
		//BELOW IS STRING LITERAL, same values refers to existing and doesnt create new object
		String s = "Collins Abang Eban";//created a memory s and stored data
		String s1 = "Collins Abang Eban";
		//look above, java doesnt create additional memory after seeing that the content is the same
		//it just points s1 to s value, if text is same only one object is created
		String s5 = "Hello"; //new object created because the value is different
		
		//another way to create string
		//WHEN YOU USE NEW IT ALWAYS CREATES OBJECT BECAUSE YOU USE NEW
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		//in the above case it is 2 objects bev=ecause we created an instance of an object 
		
		//WHEN BOTH VALUE IS SAME THEN NO OBJECT IS CREATED, BUT WHEN YOU SPECIFY WITH NEW YOU CREATE NEW OBJECT
		//IRRESPECTIVE OF THE VALUE
		
		//STRING IN JAVA IS OBJECT THAT REPRESENT SEQUENCE OF CHARACTERS
		//-------------------------------------------------------------
		String d = "Teaching selenium automation";
		d.split(" ");//by doing this i split my string based on white spaces,
		//this then means i have an array
		
		String[] splittedString = d.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		//=========================SECOND CASE SCENARIO=================
		String g = "Teaching Collins Selenium";
		g.split("Collins");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		//want to remove white space? use trim
		System.out.println(splittedString[0].trim());
		
		//print character none by one?
		//"Teaching Collins Selenium"; note this is an array of character, it is a string but individually it is a charcater
		for(int i = 0; i < g.length(); i++)
		{
			//System.out.println(g[i]);//this wont work because it is not directly an array
			System.out.println(g.charAt(i)); //charAt picks the index for you
			
			
		}
		
		//PRING IN REVERSE ORDER
		for(int i = g.length()-1; i >=0; i--)
		{
			System.out.println(g.charAt(i));
		}
		
		
	}

}
