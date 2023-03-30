
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5;
		String website = "Collins Eban Academy";
		char letter = 'r';
		double dec = 5.99;
		
		boolean myCard = true;
		
		System.out.println(myNum + " is the value");
		System.out.println(website);
		
		//ARRAYS - Store multiple values 
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		//ARRAY SHORTCUT - directly assigning values
		int[] arr2 = {1,2,3,4,5,6};
		System.out.println(arr2[0]);
		
		//USING FOR LOOP TO PRINT FOR ITERATION ALL ELEMENT
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(i);
		}
		
		
		for(int q = 0; q < arr2.length; q++)
		{
			System.out.println(arr2[q]);
		}
		
		//LOOPING STRING
		String[] name = {"Collins", "Abang", "Eban"};
		for(int z = 0; z < name.length; z++)
		{
			System.out.println(name[z]);
		}
		
		//AN ENHANCED LOOP IS AS BELOW
		for(String s: name)
		{
			System.out.println(s);
		}
				
		
		
		int[] test = new int[5];
		test[0] = 5;
		
		System.out.println(test[0]);
		for(int i = 0; i < test.length; i++)
		{
			System.out.print(test[i]);
		}
		
		
	}
	

}
