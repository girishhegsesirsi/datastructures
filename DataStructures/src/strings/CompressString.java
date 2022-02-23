package strings;

public class CompressString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = "aaabbccccaa";
String output = compress(input);

	System.out.println("Compressed String is : "+output);
				
}
	
	public static String  compress(String data) {
int count =0;
StringBuffer sb = new StringBuffer();
char last = data.charAt(0);
for (int i = 0; i<data.length();i++) {
	if(data.charAt(i)==last) {
		count++;
	}
	else {
	sb.append(last);
	sb.append(count);
	last = data.charAt(i);
	count=1;
	}
}
sb.append(last);
sb.append(count);
return sb.toString();
}
}