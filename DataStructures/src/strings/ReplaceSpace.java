package strings;

public class ReplaceSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = "Girish Hegde";
String output = replace(input);

	System.out.println("reversed String is : "+output);
				
}
	
	public static String  replace(String data) {
		data = data.trim();
		data = data.replaceAll("\\s", "%20");
		return data;
	}

}

