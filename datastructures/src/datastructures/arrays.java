package datastructures;

public class arrays {

	public static void main(String[] args) {
		
		//Create int array and initialize to 5 elements
		int[] intArr = new int[5];
		
		//Fill array
		for(int i = 0; i < 5; i++) {
			intArr[i] = i;
		}
		
		for (int num : intArr) {
			System.out.print(num + ", ");
		}
		
		//Can use other data types, such as String
		String strArr[] = new String[2];

		//Fill array with string values
		strArr[0] = "Hello";
		strArr[1] = "World";
		
		//Print values
		System.out.println(strArr[0] + " " + strArr[1]);
		
	}

}
