
public class ReverseStringWithoutFunction {

	public static void main(String[] args) {
		
		String original = "We are gonna reverse this string by swaping characters";
		System.out.println("The Original string is:-- " + original);
		
		//Now converting sting to character array 
		
		char charStringArray[] = original.toCharArray();
		int n= charStringArray.length;   //length of array
		int i=0;
		int end=n-1;
		while(i<=end) {       //swipe the character
			char temp= charStringArray[i];
			charStringArray[i]=charStringArray[end];
			charStringArray[end]= temp;
			i++;
			end--;
			
		}
		//converting character array to string back;
		
		String reversedString=String.valueOf(charStringArray);
		System.out.println("Are u ready for surprise?? here is reversed string:-  "
				+ "" +reversedString);
		
	}

}
