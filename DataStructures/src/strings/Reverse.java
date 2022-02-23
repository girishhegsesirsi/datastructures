package strings;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = "Girish hegde";
String output = reverse(input);

	System.out.println("reversed String is : "+output);
				
}
	
	public static String  reverse(String data) {
		StringBuffer sb = new StringBuffer();
		for(int i=data.length()-1;i>=0;i--) {
			char a=data.charAt(i);
			sb = sb.append(a);
		}
		return sb.toString();
	}

}
