package strings;

public class Uniquechars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = "Girish";
boolean flag = findUnique(input);
if(flag == true) {
	System.out.println("String is unique");
				}
else
	{
	System.out.println("String is not unique");
	}
}
	
	public static boolean findUnique(String data) {
		boolean flag=false;
		boolean arr[] = new boolean[256];
		for(int i=0;i<data.length();i++) {
			char a=data.charAt(i);
			if(arr[a]==false) {
				arr[a]=true;
			}
			else 
				
				return flag;
		}flag= true;
		return flag;
	}

}
