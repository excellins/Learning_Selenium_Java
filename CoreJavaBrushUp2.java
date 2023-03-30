import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122};
		
		for(int i = 0; i < arr2.length; i++)
		{
			if(arr2[i] % 2 == 0)
			{
				System.out.println(arr2[i]);
				break;//TO STOP THE LOOP
			}
			
			else
			{
				System.out.println(arr2[i] + " is not multiple of 2");
			}
		}
		
		//ARRAY LIST - WHY? BECAUSE FOR THE ARRAY WE CRETAED WE SPECIFY THE SIZES
		//int[] arr2 = {1,2,3,4,5,6,7,8,9,10,122}; AND in[] arr = new int[5]
		//if we go past the size we will have an outOfBoundException so to avoid
		//we use an arrayList
		ArrayList<String> a = new ArrayList<String>();
		//crate object of the class 0bject method
		a.add("Collins");
		a.add("Abang");
		a.add("Eban");
		a.add("This is me learning");
		System.out.println(a.get(3));
		
		for(int i = 0; i < a.size(); i++)
		//arrayList we use Size, normal aray we use lenght
		//note size because its size we are looking for, normal array we use lenght
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("****************************");
		for(String val :a)
		{
			System.out.println(val + " Advanced for loop");
		}
		
		//TO CHECK IF ITEM IS PRESENT ON THE LOOP
		//a.contains("Eban"); returns true
		System.out.println(a.contains("Eban"));//another good thing with Array List, normal array doesnt contain
		
		//BUT WHAT IF YOU WANT TO CONVERT A METHOD TO AN ARRAY LIST?
		String[] converttoList = {"Eban", "Collins", "Abang"};
		//Arrays.asList(converttoList);//after you do this, then you hold it in a variable
		List<String> converttoListArrayList = Arrays.asList(converttoList);
		//YOU CAN STILL CHECK IF IT CONTAINS A VALUE
		converttoListArrayList.contains("Collins");//THIS SHOULD RETURN TRUE
		//ARRAY VS ARRAY LIST?
		//ARRAY is static size set, array list you can dynamically grow on the list, array list also has more methods like contains
	};

}
