package Array;

public class ArrayEx {
	private int[] newArray = new int[10]; // private integer array
	
	int[] getArray() { // method to get the private integer array
		return this.newArray;
	}
	
	void populateValues() { // method to populate the array with values
		for(int i = 0; i < this.newArray.length; i++) {
			this.newArray[i] = i;
		}
	}
	
	void listValues(int[] intArray) { // method to print the values of the array
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The inputted array contains the following values:");
		
		ArrayEx array = new ArrayEx(); // instantiate the class
		
		array.populateValues(); // populate the array
		array.listValues(array.getArray()); // list the values of the array
	}

}
