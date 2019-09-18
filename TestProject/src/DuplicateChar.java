
public class DuplicateChar {

	public static void main(String[] args) {
		String str = "helloword";
		int counter=0;
		char [] input= str.toCharArray();
		System.out.println("Duplicate charachers are:");
		for (int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if (input[i]==input[j]) {
					System.out.println(input[j]);
					counter++;
					break;
				}
			}
		}
				

	}

}
