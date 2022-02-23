package strings;

public class RepeatingChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = "girish Hegde ";
 findUnique(input);

}
	
	public static void findUnique(String data) {
		int arr[] = new int[256];
		boolean flag=false;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<data.length();i++) {
			char a=data.charAt(i);
			if(arr[a]!= 0) {
				//arr[a]=arr[a]+1;
				sb =sb.append(data.charAt(i));
			}
			 
				
				arr[a]=arr[a]+1;
		}
		String result = sb.toString();
		for (int i=0;i<result.length();i++) {
		System.out.println("repeating characters : "+result.charAt(i) + " repeated " +arr[result.charAt(i)]);
		}
	}

}

